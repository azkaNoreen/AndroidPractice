package com.example.studentapp.lab18;

import static java.lang.String.valueOf;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Environment;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.studentapp.R;
import com.example.studentapp.lab16.StorageActivity;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import kotlin.io.FileAlreadyExistsException;

public class FileHandling extends AppCompatActivity {
Button created,createFile,renamFile,delFile;
EditText name;
    String nam;
    String folderPath;
    String filePath;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_file_handling);

        created=findViewById(R.id.create);
        name=findViewById(R.id.name);
        renamFile=findViewById(R.id.renamFile);
        createFile=findViewById(R.id.createFile);
        delFile=findViewById(R.id.delFile);

        nam=name.getText().toString().trim();

        created.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkStorage();
            }
        });
        createFile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    CreateFile(name.getText().toString().trim());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });
        renamFile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    WriteInFile(name.getText().toString().trim());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });
        delFile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    ReadFromFile();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });


    }
    private void checkStorage() {
        if(ActivityCompat.checkSelfPermission(FileHandling.this, Manifest.permission.READ_EXTERNAL_STORAGE)
                != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(FileHandling.this, Manifest.permission.WRITE_EXTERNAL_STORAGE)
                != PackageManager.PERMISSION_GRANTED){
            String[] permissions= {Manifest.permission.READ_EXTERNAL_STORAGE,Manifest.permission.WRITE_EXTERNAL_STORAGE};
            ActivityCompat.requestPermissions(FileHandling.this, permissions, 123);
        }
        else{
            CreateFolder(name.getText().toString().trim());
        }
    }
    public void CreateFolder(String folderName){
        String rootPath = Environment.getExternalStorageDirectory().getAbsolutePath();
        folderPath=rootPath+"/"+folderName;

        File folder=new File(folderPath);
        if(!folder.exists()){
            if(folder.mkdir())
                Toast.makeText(this, "Folder Created Successfully", Toast.LENGTH_SHORT).show();
            else
                Toast.makeText(this, "Sorry!not created", Toast.LENGTH_SHORT).show();
        }
        else{
            Toast.makeText(this, "Folder Already Exists", Toast.LENGTH_SHORT).show();
        }
    }
    public void CreateFile(String fileName) throws IOException {
//        String rootPath = Environment.getExternalStorageDirectory().getAbsolutePath();
        filePath=folderPath+"/"+fileName+".txt";

        File file=new File(filePath);
        if(!file.exists()){
            if(file.createNewFile())
                Toast.makeText(this, "File Created Successfully", Toast.LENGTH_SHORT).show();
            else
                Toast.makeText(this, "Sorry!not created", Toast.LENGTH_SHORT).show();
        }
        else{
            Toast.makeText(this, "file Already Exists", Toast.LENGTH_SHORT).show();
        }
    }
    public void RenameFile(String renamedFileName) throws IOException {

        File file=new File(filePath);
        if(file.exists()){
            if(file.renameTo(new File(folderPath+"/"+renamedFileName+".txt")))
            {
                filePath=folderPath+"/"+renamedFileName+".txt";
            Toast.makeText(this, "File Renamed Successfully", Toast.LENGTH_SHORT).show();}
            else
                Toast.makeText(this, "Sorry!not renamed", Toast.LENGTH_SHORT).show();
        }
        else{
            Toast.makeText(this, "file does not exist Exists", Toast.LENGTH_SHORT).show();
        }
    }
    public void DeleteFile() throws IOException {
        File file=new File(filePath);
        if(file.exists()){
            file.delete();
            Toast.makeText(this, "Deleted", Toast.LENGTH_SHORT).show();

        }
        else{
            Toast.makeText(this, "file does not exist Exists", Toast.LENGTH_SHORT).show();
        }
    }
    public void WriteInFile(String fileText) throws IOException {
        try{
            FileOutputStream stream=new FileOutputStream(filePath);
            try{
                stream.write(fileText.getBytes());
            }finally {
                stream.close();
            }
        }
        catch(Exception e){

        }
    }
    public void ReadFromFile() throws IOException {
        File file=new File(filePath);
        int size=(int)file.length();

        byte[] array = new byte[(int)file.length()];
        FileInputStream inputStream = new FileInputStream(filePath);

        try {
            inputStream.read(array);
        }catch(Exception e){

        }
        finally {
            inputStream.close();
        }
        name.setText(new String(array));

    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        if(grantResults.length > 0 && grantResults[0]== PackageManager.PERMISSION_GRANTED){
            CreateFolder(name.getText().toString().trim());
        }
        else{
            Toast.makeText(this, "Storage Permission Denied", Toast.LENGTH_SHORT).show();
        }
    }
}