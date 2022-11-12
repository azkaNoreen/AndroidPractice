package com.example.studentapp.assignment4;

import androidx.appcompat.app.AppCompatActivity;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.widget.FrameLayout;
import android.widget.TextView;

import com.example.studentapp.R;

public class Base extends AppCompatActivity {
    FrameLayout fl;
    FragmentManager fm;
    FragmentTransaction ft;
    TextView status;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_base);

        status=findViewById(R.id.stu);
        //status.setText(getIntent().getStringExtra("Email"));
        String email=getIntent().getStringExtra("Email");
        if(email.equals(Constants.firstTeacherEmail)||email.equals(Constants.secondTeacherEmail)){
            status.setText("Students");
        }
        else{
            status.setText("Subjects");
        }
        Bundle bn=new Bundle();
        bn.putString("Emai",email);


        fm=getFragmentManager();
        ft=fm.beginTransaction();
        UserFragment tf=new UserFragment();
        tf.setArguments(bn);

        ft.add(R.id.LoginFragment_container,tf);
        ft.commit();
//        getSupportFragmentManager().beginTransaction().replace(R.id.LoginFragment_container,new TeacherFragment()).commit();
    }
}