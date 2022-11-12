package com.example.studentapp.lab3;

import androidx.appcompat.app.AppCompatActivity;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;

import com.example.studentapp.R;

public class StudentActivity extends AppCompatActivity {


    Button change;
    FrameLayout fl;
    FragmentManager fm;
    FragmentTransaction ft;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student);
        change = findViewById(R.id.changeFrag);
        fl = findViewById(R.id.fragment_container);

        fm=getFragmentManager();
        ft=fm.beginTransaction();
        ft.add(R.id.fragment_container,new StudentFragment());
        ft.commit();

        change.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fm=getFragmentManager();
                ft=fm.beginTransaction();
                ft.replace(R.id.fragment_container,new StudentBFragment());
                ft.commit();


            }
        });

    }
}