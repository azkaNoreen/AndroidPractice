package com.example.studentapp.Assignment3;

import androidx.appcompat.app.AppCompatActivity;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.widget.FrameLayout;

import com.example.studentapp.R;

public class Shifts extends AppCompatActivity {
    FrameLayout fl;
    FragmentManager fm;
    FragmentTransaction ft;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shifts);

        fm=getFragmentManager();
        ft=fm.beginTransaction();
        ft.add(R.id.Fragment_container1,new MorningFragment());
        ft.add(R.id.Fragment_container2,new AfternoonFragment());

        ft.commit();


    }
}