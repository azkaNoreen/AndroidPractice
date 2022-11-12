package com.example.studentapp.Assignment3;

import androidx.appcompat.app.AppCompatActivity;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;

import com.example.studentapp.R;

public class Departments extends AppCompatActivity {
    Button change;
    FrameLayout fl;
    FragmentManager fm;
    FragmentTransaction ft;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_departments);

        change=findViewById(R.id.change);
        fl=findViewById(R.id.Fragment_container);

        fm=getFragmentManager();
        ft=fm.beginTransaction();
        ft.add(R.id.Fragment_container,new SoftwareEngineering());
        ft.commit();
        change.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fm=getFragmentManager();
                ft=fm.beginTransaction();
                ft.replace(R.id.Fragment_container,new ComputerScience());
                ft.commit();

            }
        });





    }
}