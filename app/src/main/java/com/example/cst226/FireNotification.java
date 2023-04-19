package com.example.cst226;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.IBinder;

import androidx.core.app.NotificationCompat;

public class FireNotification extends Service {
    public FireNotification() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }

    @Override
    public void onCreate()
    {
        //Code Copied from the other LO6 Example
        //Quick Notes from Jason
        //Get a reference to the manager
        //Make the notification/ configure it using a pattern called Builder
        //Builder is an object that creates/ configures another object to make a notification
        //Then send it to the Manager to have it appear (At a high level)

        //-------- Actual coding --------
        //Get the manager to use later
        NotificationManager notifyMgr = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);

        //Configure a notification
        Notification n;

        //Create a pending intent to open (or re-open) this activity
        Intent intent = new Intent(this, MainActivity.class);

        //Wrap the intent in a "Pending Intent"
        PendingIntent pendingIntent = PendingIntent.getActivity(this, 0, intent, PendingIntent.FLAG_CANCEL_CURRENT);

        //**In Oreo, channels were added, so we'll check to see what version is in use**
        //Configure it based on which version you have, newer or older
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O)
        {
            //Configure a channel to use and then add notification to it
            String channel = "1111";

            CharSequence name = "channel1111";

            int importance = NotificationManager.IMPORTANCE_LOW;

            //Make our channel
            NotificationChannel nChannel = new NotificationChannel(channel, name, importance);

            //The Manager has to be aware that a channel has been created - so create the channel and pass in the info
            notifyMgr.createNotificationChannel(nChannel);

            //**This next section will be similar in the else as well**
            //** - A builder pattern creates an object that configures/ builds another object**
            NotificationCompat.Builder builder = new NotificationCompat.Builder(this, channel)
                    .setSmallIcon(R.mipmap.ic_launcher)
                    .setChannelId(channel)
                    .setPriority(NotificationCompat.PRIORITY_DEFAULT)
                    .setTicker("Ticker Notify")
                    .setContentTitle("Black Jack")
                    .setContentText("Come and fuel your gambling addiction, with no risk of loosing money")
                    .setAutoCancel(false)
                    .setContentIntent(pendingIntent);
            //^ Take advantage of method chaining for this section

            n = builder.build(); //Build it
        }
        else
        {
            Notification.Builder builder = new Notification.Builder(this)
                    .setSmallIcon(R.mipmap.ic_launcher)
                    .setTicker("Ticker Notify")
                    .setContentTitle("Black Jack")
                    .setContentText("Come and fuel your gambling addiction, with no risk of loosing money")
                    .setAutoCancel(false)
                    .setContentIntent(pendingIntent);

            n = builder.build(); //Build it
        }

        //Use the manager to make the notification appear (id can be used to identify the notification later)
        notifyMgr.notify(1, n);
    }

}