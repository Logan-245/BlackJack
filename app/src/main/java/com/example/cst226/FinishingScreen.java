package com.example.cst226;

import android.content.Context;
import android.content.Intent;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.io.FileInputStream;
import java.io.InputStreamReader;

public class FinishingScreen  extends AppCompatActivity {

    LocationManager locationManager;
    LocationListener locationListener;
    String WhatLocation;
    String tvLat;
    String tvLon;
    String UserName;
    String Points;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_finish);
        Intent i =getIntent();

        Bundle b  = i.getExtras();

         Points = b.getString("wins");



        getName();

        Button btnAgain = findViewById(R.id.btnPlayAgain);

        btnAgain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                RestartGame();
            }
        });




        locationManager = (LocationManager) getSystemService(Context.LOCATION_SERVICE);



        //Define a listener that responds when the device moves around
        locationListener = new LocationListener() {
            @Override
            public void onLocationChanged(Location location) {
                makeUseOfNewLocation(location);
            }
        };

        //Register the listener with the manager to receive updates
        try
        {
            //***Note: time and distance (set to 0 here) should be set to values that make sense for your app
            locationManager.requestLocationUpdates(LocationManager.GPS_PROVIDER, 0, 0, locationListener);
        }
        catch (SecurityException e)
        {
            tvLat = (e.getMessage());
        }


}

    private void RestartGame() {

        Intent intent = new Intent(this, MainActivity.class); //Open the other activity

        this.startActivity(intent);
    }


    private void makeUseOfNewLocation(Location location)
    {
        tvLat = (location.getLatitude() + "");


        tvLon = (location.getLongitude() + "");


        if (  (Double.parseDouble(tvLat)> 52.07060658553531 && Double.parseDouble(tvLat) <52.209463496519035) &&(Double.parseDouble(tvLon))> (-106.76678831819522)&& (Double.parseDouble(tvLon)) <-106.53950866004487 )
        {
            WhatLocation = "SASKATOON";
        }
        else{
            WhatLocation ="NOT SASKATOON";
        }
        TextView txt = findViewById(R.id.txtWinText);
        txt.setText("Congratulations " + UserName + " of " + WhatLocation + " you finished with " + (Points) +   " Points");

    }

    protected void onStop()
    {
        locationManager.removeUpdates(locationListener);
        super.onStop();
    }

    protected void onResume()
    {
        //Register the listener with the manager to receive updates
        try
        {
            //***Note: time and distance (set to 0 here) should be set to values that make sense for your app
            locationManager.requestLocationUpdates(LocationManager.GPS_PROVIDER, 0, 0, locationListener);
        }
        catch (SecurityException e)
        {
            tvLat = (e.getMessage());
        }
        super.onResume();
    }






    private void getName() {

        int block_size = 100;
        try
        {
            FileInputStream fileIn = openFileInput("mytextfile.txt"); //For the internal memory

            //For SD Card
//            File path = Environment.getExternalStorageDirectory();
//            File file = new File(path, "userName.txt");
//            FileInputStream fileIn = new FileInputStream(file);

            InputStreamReader inputRead = new InputStreamReader(fileIn);

            char[] inputBuffer = new char[block_size];
            UserName = "";
            int charRead;

            while ((charRead = inputRead.read(inputBuffer)) > 0)
            {
                UserName += String.copyValueOf(inputBuffer, 0, charRead);
            }
            inputRead.close();

        }
        catch (Exception e)
        {
            Toast.makeText(this, e.getMessage(), Toast.LENGTH_LONG).show();
        }
    }






}