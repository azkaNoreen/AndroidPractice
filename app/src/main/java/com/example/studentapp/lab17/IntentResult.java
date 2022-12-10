package com.example.studentapp.lab17;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.studentapp.R;

public class IntentResult extends AppCompatActivity {
    String st1, sy2;
    TextView te1, te2;
    Button b;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent_result);
        te1 = findViewById(R.id.text1);
        te2 = findViewById(R.id.text2);
        b = findViewById(R.id.go);

b.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Intent intent = new Intent(IntentResult.this, SendingActivity.class);
        startActivityForResult(intent, 50);
    }

});
    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 50 && resultCode==RESULT_OK) {
            if (resultCode == Activity.RESULT_OK) {
                if (data != null) {
                    te1.setText(data.getStringExtra("First"));
                    te2.setText(data.getStringExtra("Second"));
                    Log.d("r",data.getStringExtra("First")+data.getStringExtra("Second")) ;
                }
            }
        }
    }
}