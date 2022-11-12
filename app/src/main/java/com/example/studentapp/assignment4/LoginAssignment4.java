package com.example.studentapp.assignment4;

import androidx.appcompat.app.AppCompatActivity;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.example.studentapp.Assignment2.Login;
import com.example.studentapp.Assignment3.SoftwareEngineering;
import com.example.studentapp.R;
import com.example.studentapp.lab4.StudentView;

public class LoginAssignment4 extends AppCompatActivity {
    Button signin;
    EditText email,password;
    TextView signup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_assignment4);

        signin=findViewById(R.id.signin);
        email=findViewById(R.id.email);
        password=findViewById(R.id.password);

        signup=findViewById(R.id.signup);

        signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String Email=email.getText().toString();
                String Pass=password.getText().toString();
                if(!Email.equals("")){
                    if(!Pass.equals("")){
                        if((Email.equals(Constants.firstTeacherEmail)&&Pass.equals(Constants.firstTeacherPassword))
                                || (Email.equals(Constants.secondTeacherEmail)&&Pass.equals(Constants.secondTeacherPassword))
                                || (Email.equals(Constants.studentEmail)&&Pass.equals(Constants.studentPassword)) )
                        {

                        Intent in=new Intent(LoginAssignment4.this, Base.class);
                        in.putExtra("Email",email.getText().toString());

                        startActivity(in);
                        }
                        else{
                            Toast.makeText(getApplicationContext(), "Invalid Credentials,Enter Again", Toast.LENGTH_SHORT).show();
                        }
                    }else{
                        Toast.makeText(getApplicationContext(), "PLease Enter Pasasword", Toast.LENGTH_SHORT).show();
                    }
                }else{
                   Toast.makeText(getApplicationContext(), "PLease Enter Email", Toast.LENGTH_SHORT).show();
                }
            }
        });
        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in=new Intent(LoginAssignment4.this, SignUpAssignment4.class);

                startActivity(in);
            }
        });


    }
}