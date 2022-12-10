package com.example.studentapp.lab17;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.studentapp.R;

public class SendingActivity extends AppCompatActivity {
Button a;
EditText f,s;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sending);
        a=findViewById(R.id.send);
        f=findViewById(R.id.text1e);
        s=findViewById(R.id.text2e);
        a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent();
                intent.putExtra("First",f.getText().toString());
                intent.putExtra("Second",s.getText().toString());
                setResult(Activity.RESULT_OK,intent);

                finish();
            }
        });
    }
}