package com.example.studentapp.lab14;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.example.studentapp.R;

public class ServiceAct extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_service);

        Intent intent=new Intent(this,MyService.class);
        startService(intent);
    }
}