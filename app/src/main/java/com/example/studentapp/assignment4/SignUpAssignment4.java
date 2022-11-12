package com.example.studentapp.assignment4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.studentapp.R;

public class SignUpAssignment4 extends AppCompatActivity {
    Button signup;
    EditText namee,emaile,phonee,passe,repasse;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up_assignment4);
        signup=findViewById(R.id.signup);

        namee=findViewById(R.id.nameee);
        emaile=findViewById(R.id.emaileee);
        phonee=findViewById(R.id.phoneNO);
        passe=findViewById(R.id.pass);
        repasse=findViewById(R.id.passRe);

        signup.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                String name = namee.getText().toString();
                String email = emaile.getText().toString();
                String phone = phonee.getText().toString();
                String pass = passe.getText().toString();
                String repass = repasse.getText().toString();
                if(!name.equals("")){
                    if(!email.equals("")){
                        if(!phone.equals("")){
                            if(!pass.equals("")){
                                if(!repass.equals("")){
                                    Toast.makeText(getApplicationContext(), "Signup Complete", Toast.LENGTH_SHORT).show();
                                    Constants.studentName=name;
                                    Constants.studentEmail=email;
                                    Constants.studentPhone=phone;
                                    Constants.studentPassword=pass;
                                    finish();

                                }else{
                                    Toast.makeText(getApplicationContext(), "PLease Re-Enter password ", Toast.LENGTH_SHORT).show();
                                }
                        }else{
                            Toast.makeText(getApplicationContext(), "PLease Enter Password ", Toast.LENGTH_SHORT).show();
                        }
                        }else{
                            Toast.makeText(getApplicationContext(), "PLease Enter Phone ", Toast.LENGTH_SHORT).show();
                        }
                    }else{
                        Toast.makeText(getApplicationContext(), "PLease Enter Email ", Toast.LENGTH_SHORT).show();
                    }
                }else{
                    Toast.makeText(getApplicationContext(), "PLease Enter Name ", Toast.LENGTH_SHORT).show();
                }

            }
        });
    }
}