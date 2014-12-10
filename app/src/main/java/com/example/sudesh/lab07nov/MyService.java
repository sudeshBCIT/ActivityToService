package com.example.sudesh.lab07nov;

import android.app.Service;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.widget.Toast;

/**
 * Created by Sudesh on 07/11/2014.
 */
public class MyService extends Service {

    @Override
    public IBinder onBind(Intent arg0) {
        return null;
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {

        String nm;
        Bundle bundle = new Bundle();
        bundle = intent.getExtras();
        nm = bundle.getString("key1");
        Toast.makeText(this, nm, Toast.LENGTH_LONG).show();
        return START_STICKY;
    }
    @Override
    public void onDestroy() {
        super.onDestroy();

        Toast.makeText(this, "Service Destroyed", Toast.LENGTH_LONG).show();
    }
}
