package com.example.studentapp.assignment1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.studentapp.Assignment3.Menu;
import com.example.studentapp.R;
import com.example.studentapp.assignment4.LoginAssignment4;
import com.example.studentapp.lab10.APIActivity;
import com.example.studentapp.lab13.Notification;
import com.example.studentapp.lab14.MyService;
import com.example.studentapp.lab14.ServiceAct;
import com.example.studentapp.lab3.StudentActivity;
import com.example.studentapp.lab4.StudentView;
import com.example.studentapp.lab5.ViewPagerActivity;
import com.example.studentapp.lab6.database.InsertStudent;
import com.example.studentapp.lab8.MyDialog;
import com.example.studentapp.lab9.ToolbarActivity;

public class MainActivity extends AppCompatActivity {
    Button menu,login4,fragments,rcv,vp,rdb,dial,toolb,api,noti,service;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        menu=findViewById(R.id.menu);
        login4=findViewById(R.id.login4);
        fragments=findViewById(R.id.fragments);
        rcv=findViewById(R.id.rcv);
        vp=findViewById(R.id.vp);
        rdb=findViewById(R.id.rdb);
        dial=findViewById(R.id.dial);
        toolb=findViewById(R.id.toolb);
        api=findViewById(R.id.api);
        noti=findViewById(R.id.noti);
        service=findViewById(R.id.service);





        menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
           Intent in = new Intent(MainActivity.this, Menu.class);
            startActivity(in);
            }
        });
        login4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(MainActivity.this, LoginAssignment4.class);
                startActivity(in);
            }
        });
        fragments.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(MainActivity.this, StudentActivity.class);
                startActivity(in);
            }
        });
        rcv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(MainActivity.this, StudentView.class);
                startActivity(in);
            }
        });
        vp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(MainActivity.this, ViewPagerActivity.class);
                startActivity(in);
            }
        });
        rdb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(MainActivity.this, InsertStudent.class);
                startActivity(in);
            }
        });
        dial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(MainActivity.this, MyDialog.class);
                startActivity(in);
            }
        });
        toolb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(MainActivity.this, ToolbarActivity.class);
                startActivity(in);
            }
        });
        api.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(MainActivity.this, APIActivity.class);
                startActivity(in);
            }
        });
        noti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(MainActivity.this, Notification.class);
                startActivity(in);
            }
        });
        service.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(MainActivity.this, ServiceAct.class);
                startActivity(in);
            }
        });


    }
}