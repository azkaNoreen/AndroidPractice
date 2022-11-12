package com.example.studentapp.whatsappToolbar;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.example.studentapp.R;

public class WhatsappToolbar extends AppCompatActivity {
Toolbar toolba;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_whatsapp_toolbat);

        toolba=findViewById(R.id.wtoolbar);
        setSupportActionBar(toolba); //set toolbar to act as action bar
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        //inflate the menu ,this adds items to action bar but here in toolbar
        getMenuInflater().inflate(R.menu.whatsappmenu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        int menuItemId=item.getItemId();
        if(menuItemId==R.id.searchw){
            Toast.makeText(this, "Serach Clicked", Toast.LENGTH_SHORT).show();
        }
        else{
            Toast.makeText(this, "Delete Clicked", Toast.LENGTH_SHORT).show();
        }
        return super.onOptionsItemSelected(item);
    }
}