package com.example.studentapp.lab16;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Environment;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.studentapp.R;

import java.io.File;

public class StorageActivity extends AppCompatActivity {
    TextView getAllText;
    Button getAllFiles;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_storage);
        getAllText= findViewById(R.id.textView1);
        getAllFiles= findViewById(R.id.getAllFiles);
        getAllFiles.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getAllText.setText("Sijal Fatima");
                checkStorage();
            }

            private void checkStorage() {
                if(ActivityCompat.checkSelfPermission(StorageActivity.this, Manifest.permission.READ_EXTERNAL_STORAGE)
                        != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(StorageActivity.this, Manifest.permission.WRITE_EXTERNAL_STORAGE)
                        != PackageManager.PERMISSION_GRANTED){
                    String[] permissions= {Manifest.permission.READ_EXTERNAL_STORAGE,Manifest.permission.WRITE_EXTERNAL_STORAGE};
                    ActivityCompat.requestPermissions(StorageActivity.this, permissions, 123);
                }
                else{
                    getAllFilesPath();
                }
            }
        });
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        if(grantResults.length > 0 && grantResults[0]== PackageManager.PERMISSION_GRANTED){
            getAllFilesPath();
        }
        else{
            Toast.makeText(this, "Storage Permission Denied", Toast.LENGTH_SHORT).show();
        }
    }
    private void getAllFilesPath() {
        // String rootPath= Environment.getExternalStorageDirectory().getAbsolutePath();   if we want string
        File rootPath = Environment.getExternalStorageDirectory();
        File[] childFiles = rootPath.listFiles();
        String childFileName= "";

        for(int i=0; i<childFiles.length; i++){
            childFileName= childFileName + "\n \n \n \n \n \n" + childFiles[i].getName();
            if(childFiles[i].isDirectory())
                childFileName= childFileName + "\n \n" + childFiles[i].getName();
        }
        getAllText.setText(childFileName);
        getAllText.setMovementMethod(new ScrollingMovementMethod());
    }

    //  File convertStringToFile= new File(file_name);
}