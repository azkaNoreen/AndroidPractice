package com.example.studentapp.lab15;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Intent;
import android.os.Build;
import android.os.IBinder;
import android.widget.RemoteViews;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.core.app.NotificationCompat;

import com.example.studentapp.R;
import com.example.studentapp.lab13.Notification;

public class NotificationService extends Service {
    private int notificaitionid=100;

    public static String Play_Button="Play_Button";
    public static String Stop_Button="Stop_Button";

    @Override
    public void onCreate() {
        super.onCreate();
        createNotificationChannel();
        startForeground(notificaitionid,createNotification());
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        //assigning task to service
        String action=intent.getAction();
        if(action.equals(Play_Button)){
            Toast.makeText(this, "Play CLicked", Toast.LENGTH_SHORT).show();
        }
        else
            Toast.makeText(this, "Stop Clicked", Toast.LENGTH_SHORT).show();
        return super.onStartCommand(intent, flags, startId);

    }

    @Override
    public void onDestroy() {
        super.onDestroy();
    }

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }
    private android.app.Notification createNotification() {
        Intent intent=new Intent(NotificationService.this,Notification.class);
        //for not opening the activity again and again
//                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
        PendingIntent pendingIntent=PendingIntent.getActivity(NotificationService.this,0,intent,PendingIntent.FLAG_IMMUTABLE);
        RemoteViews customNotification=new RemoteViews(getPackageName(),R.layout.customnotification);
        customNotification.setOnClickPendingIntent(R.id.play,getButtonPendingIntent(Play_Button));
        customNotification.setOnClickPendingIntent(R.id.stop,getButtonPendingIntent(Stop_Button));

        NotificationCompat.Builder builder = new NotificationCompat.Builder(NotificationService.this,"My_App")
                .setSmallIcon(R.drawable.ic_action_menuu)
                .setContentTitle("This is my Notification")
                .setContentText("Explanation of notification goes here...")
                .setPriority(NotificationCompat.PRIORITY_HIGH)
                .setContentIntent(pendingIntent)
                .setAutoCancel(true)
                .setContent(customNotification);


//        NotificationManagerCompat notificationManagerCompat=NotificationManagerCompat.from(SecondService.this);
//        notificationManagerCompat.notify(notificaitionid,builder.build());
        return builder.build();// notification object
    }

    private PendingIntent getButtonPendingIntent( String action) {
        Intent intent=new Intent(this, NotificationService.class);
        intent.setAction(action);
        return PendingIntent.getService(this,0,intent,PendingIntent.FLAG_IMMUTABLE);
    }

    private void createNotificationChannel() {
        // Create the NotificationChannel, but only on API 26+ because
        // the NotificationChannel class is new and not in the support library
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            CharSequence name = "This is my channel";
            String description = "this is description of chennal";
            int importance = NotificationManager.IMPORTANCE_HIGH;
            NotificationChannel channel = new NotificationChannel("My_App", name, importance);
            channel.setDescription(description);
            // Register the channel with the system; you can't change the importance
            // or other notification behaviors after this
            NotificationManager notificationManager = getSystemService(NotificationManager.class);
            notificationManager.createNotificationChannel(channel);
        }
    }

}
