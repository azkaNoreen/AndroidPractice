package com.example.studentapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Menu extends AppCompatActivity {
    Button SingleFragment,ChangeFragment,DoubleFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        SingleFragment=findViewById(R.id.prospectus);
        ChangeFragment=findViewById(R.id.departmemts);
        DoubleFragment=findViewById(R.id.shifts);
        

        //SingleFragment
        SingleFragment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Menu.this,Prospectus.class));
            }
        });
        ChangeFragment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Menu.this,Departments.class));

            }
        });
        DoubleFragment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Menu.this,Shifts.class));

            }
        });
    }
}