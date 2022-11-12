package com.example.studentapp.Assignment2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.studentapp.R;
import com.example.studentapp.assignment1.MainActivity;
import com.example.studentapp.lab3.StudentActivity;
import com.example.studentapp.lab4.StudentView;

public class Login extends AppCompatActivity {

    EditText name, password, phone, email, gender, department;
    Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        name = findViewById(R.id.username);
        password = findViewById(R.id.password);
        phone = findViewById(R.id.phone);
        email = findViewById(R.id.email);
        gender = findViewById(R.id.gender);
        department = findViewById(R.id.department);

        login = findViewById(R.id.login);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String namee = name.getText().toString();
                String pass = password.getText().toString();
                String ph = phone.getText().toString();
                String em = email.getText().toString();
                String gen = gender.getText().toString();
                String dep = department.getText().toString();

//                if (!namee.equals("")) {
//                    if (!pass.equals("")) {
//                        if (!ph.equals("")) {
//                            if (!em.equals("")) {
//                                if (!gen.equals("")) {
//                                    if (!dep.equals("")) {
//                                        if (namee.equals(Constants.name)) {
//                                            if (pass.equals(Constants.password)) {
//                                                if (em.equals(Constants.email)) {
//                                                    Intent in = new Intent(Login.this, MainActivity.class);
//                                                    in.putExtra("Name", namee);
//                                                   // in.putExtra("Password",pass);
//                                                    in.putExtra("Phone",ph);
//                                                    in.putExtra("Email",em);
//                                                    in.putExtra("Gender",gen);
//                                                    in.putExtra("Department",dep);
//
//                                                    startActivity(in);
//                                                } else {
//                                                    Toast.makeText(getApplicationContext(), "Incorrect Email ", Toast.LENGTH_SHORT).show();
//                                                }
//                                            } else {
//                                                Toast.makeText(getApplicationContext(), "Incorrect Password ", Toast.LENGTH_SHORT).show();
//                                            }
//                                        } else {
//                                            Toast.makeText(getApplicationContext(), "Incorrect Name ", Toast.LENGTH_SHORT).show();
//                                        }
//                                    } else {
//                                        Toast.makeText(getApplicationContext(), "PLease Enter Department ", Toast.LENGTH_SHORT).show();
//                                    }
//                                } else {
//                                    Toast.makeText(getApplicationContext(), "PLease Enter Gender ", Toast.LENGTH_SHORT).show();
//                                }
//                            } else {
//                                Toast.makeText(getApplicationContext(), "PLease Enter Email ", Toast.LENGTH_SHORT).show();
//                            }
//                        } else {
//                            Toast.makeText(getApplicationContext(), "PLease Enter Phone ", Toast.LENGTH_SHORT).show();
//                        }
//                    } else {
//                        Toast.makeText(getApplicationContext(), "PLease Enter Password ", Toast.LENGTH_SHORT).show();
//                    }
//                } else {
//                    Toast.makeText(getApplicationContext(), "PLease Enter Name ", Toast.LENGTH_SHORT).show();
//
//                }
                //for lab3
                // startActivity(new Intent(Login.this, StudentActivity.class));
                //for asssignemnt 3
                //startActivity(new Intent(Login.this, Menu.class));
                //for lab4
                startActivity(new Intent(Login.this, StudentView.class));


            }
        });

    }
}