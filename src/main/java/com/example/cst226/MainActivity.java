package com.example.cst226;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.media.Image;
import android.os.Bundle;
import android.os.Environment;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;


public class MainActivity extends AppCompatActivity {
    private static final int pic_id = 123;

    Button cameraButton;
    ImageView Selfie;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //SET NOTIFICATIONS
        Intent intent = new Intent(this, FireNotification.class);

        //Put inside a pending intent again
        PendingIntent pendingIntent = PendingIntent.getService(this, 1000, intent, PendingIntent.FLAG_CANCEL_CURRENT);

        //Use alarm manager to schedule into the future
        AlarmManager am = (AlarmManager) getSystemService(Context.ALARM_SERVICE);

        //am.set(AlarmManager.RTC_WAKEUP, System.currentTimeMillis() + 7000, pendingIntent);

        am.set(AlarmManager.RTC_WAKEUP, System.currentTimeMillis() + 86400000, pendingIntent);



        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cameraButton = findViewById(R.id.btnCamera);
        Selfie = findViewById(R.id.imgSelfie);


        cameraButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Intent camera
                        = new Intent(MediaStore
                        .ACTION_IMAGE_CAPTURE);

                // Start the activity with camera_intent,
                // and request pic id
                startActivityForResult(camera, pic_id);
            }
        });
    }


    public void StartGame(View view)
    {
        EditText txtMsg = findViewById(R.id.txtName);

        try
        {
            //Try to open a stream to a specific location/ file and write to it and close it

            //Internal memory
            FileOutputStream fileout = this.openFileOutput("mytextfile.txt", MODE_PRIVATE);

            //To write to the SD Card
//            File path = Environment.getExternalStorageDirectory();
//            File file = new File(path, "userName.txt");
//            FileOutputStream fileout = new FileOutputStream(file);

            OutputStreamWriter outputWriter = new OutputStreamWriter(fileout);
            outputWriter.write(txtMsg.getText().toString());
            outputWriter.close();
            Toast.makeText(this, "File Written", Toast.LENGTH_LONG).show();
        }
        catch (Exception e)
        {
            Toast.makeText(this, e.getMessage(), Toast.LENGTH_LONG).show();
        }


        Intent intent = new Intent(this, GameScreen.class); //Open the other activity

        this.startActivity(intent);
    }




    @SuppressLint("MissingSuperCall")
    protected void onActivityResult(int requestCode, int resultCode, Intent data)
    {
        // Match the request 'pic id with requestCode
        if (requestCode == pic_id) {

            // BitMap is data structure of image file
            // which stor the image in memory
            Bitmap photo = (Bitmap)data.getExtras()
                    .get("data");

            // Set the image in imageview for display
            Selfie.setImageBitmap(photo);
        }
    }
}