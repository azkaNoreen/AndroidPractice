package com.example.studentapp.lab14;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;

public class MyService extends Service {
    public MyService() {
    }


    @Override
    public void onCreate() {
        super.onCreate();
        Log.d("msg", "onCreate: called this");
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Log.d("msg", "OnStartCommand: called this");

        return super.onStartCommand(intent, flags, startId);

    }

    @Override
    public void onDestroy() {
        Log.d("msg", "onDestroy: called this");
        super.onDestroy();
    }

    @Override
    public IBinder onBind(Intent intent) {
        Log.d("msg", "onBind: called this");

        // TODO: Return the communication channel to the service.
        return null;
    }
}