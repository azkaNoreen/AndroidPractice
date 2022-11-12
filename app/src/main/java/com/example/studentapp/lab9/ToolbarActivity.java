package com.example.studentapp.lab9;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.example.studentapp.R;
import com.google.android.material.navigation.NavigationView;

public class ToolbarActivity extends AppCompatActivity {
Toolbar toolba;
DrawerLayout drawerLayout;
NavigationView navigationView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toolbar);

        toolba=findViewById(R.id.toolba);
        drawerLayout=findViewById(R.id.drawerLay);
        navigationView=findViewById(R.id.nv);

        setSupportActionBar(toolba); //set toolbar to act as action bar
//        getSupportActionBar().setDisplayHomeAsUpEnabled(true);   //add a back arrow button
        toolba.setNavigationIcon(R.drawable.ic_action_menuu);  //set navigation icon if you don't want back arrow
        //on pressing arrow ie navigation Icon
        toolba.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                drawerLayout.openDrawer(GravityCompat.START);

            }
        });

        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                int menuItemId=item.getItemId();
                if(menuItemId==R.id.view){
                    Toast.makeText(ToolbarActivity.this, "View Clicked", Toast.LENGTH_SHORT).show();
                    drawerLayout.closeDrawer(GravityCompat.START);
                }else if(menuItemId==R.id.insert){
                    Toast.makeText(ToolbarActivity.this, "Insert Clicked", Toast.LENGTH_SHORT).show();
                    drawerLayout.closeDrawer(GravityCompat.START);
                }
                else{
                    Toast.makeText(ToolbarActivity.this, "Remove Clicked", Toast.LENGTH_SHORT).show();
                    drawerLayout.closeDrawer(GravityCompat.START);
                }

                return false;
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        //inflate the menu ,this adds items to action bar but here in toolbar
        getMenuInflater().inflate(R.menu.main_menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        int menuItemId=item.getItemId();
        if(menuItemId==R.id.update){
            Toast.makeText(this, "update Clicked", Toast.LENGTH_SHORT).show();
        }else if(menuItemId==R.id.add){
            Toast.makeText(this, "Add Clicked", Toast.LENGTH_SHORT).show();
        }
//        else if(menuItemId==android.R.id.home){
//            finish();
//        }
        else{
            Toast.makeText(this, "Delete Clicked", Toast.LENGTH_SHORT).show();
        }
        return super.onOptionsItemSelected(item);
    }
}