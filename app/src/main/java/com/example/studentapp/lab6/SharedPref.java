package com.example.studentapp.lab6;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.studentapp.R;

public class SharedPref extends AppCompatActivity {

    EditText name,pass;
    TextView gn,gp;
    Button submit,show;
    SharedPreferences sharedPreferences;
    SharedPreferences.Editor sharedPreferencesEditor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shared_pref);
        initSharedPref();


        name=findViewById(R.id.sname);
        pass=findViewById(R.id.spass);
        submit=findViewById(R.id.ssub);
        show=findViewById(R.id.sshow);

        gn=findViewById(R.id.gname);
        gp=findViewById(R.id.gpass);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String n=name.getText().toString();
                String p=pass.getText().toString();
//                Toast.makeText(SharedPref.this, n+" "+p, Toast.LENGTH_SHORT).show();
                putPrefernceValues(n,p);
            }
        });
        show.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getPrefernceValues();
            }
        });
    }
    public void initSharedPref(){
        sharedPreferences=getSharedPreferences("myPref",MODE_PRIVATE);
        sharedPreferencesEditor=sharedPreferences.edit();

    }
    public void putPrefernceValues(String n, String p){
        sharedPreferencesEditor.putString("Name",n);
        sharedPreferencesEditor.putString("Password",p);
        sharedPreferencesEditor.apply();
    }
    public void getPrefernceValues(){
        String ng=sharedPreferences.getString("Name","no name");
        String np=sharedPreferences.getString("Password","no password");
        gn.setText(ng);
        gp.setText(np);
    }
}