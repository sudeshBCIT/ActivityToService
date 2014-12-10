package com.example.sudesh.lab07nov;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;


public class MyActivity extends Activity {
    EditText txt;
    String txtvalue;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);

    }
    public void startService(View view) {
        txt = (EditText) findViewById(R.id.txtpass);
        txtvalue = txt.getText().toString();
        Intent intent = new Intent(getApplicationContext(),MyService.class);
        intent.putExtra("key1",txtvalue);
        startService(intent);

    }
    // Method to stop the service
    public void stopService(View view) {
        stopService(new Intent(getBaseContext(), MyService.class));
    }

}
