
package com.example.studentapp.lab6.database;

import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Room;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import com.example.studentapp.R;

import java.util.List;

public class InsertStudent extends AppCompatActivity {
    Button clickme;
    ListView d;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_insert_student);

        clickme=findViewById(R.id.clickme);
        d=findViewById(R.id.dt);

        StudentEntity studentEntity=new StudentEntity();
        studentEntity.setFirstName("Azka");
        studentEntity.setLastName("Noreen");
        studentEntity.setEmailAddress("azka.noreen6@gmail.com");
        studentEntity.setPhoneNumber("0307-6465114");

        appDatabase db= Room.databaseBuilder(getApplicationContext(),
                appDatabase.class,
                "student_database").allowMainThreadQueries().build();

        clickme.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                db.studentDAO().insertStudent(studentEntity);
//                db.studentDAO().deleteStudent(studentEntity);

                Toast.makeText(getApplicationContext(), "Student Added", Toast.LENGTH_SHORT).show();
            }
        });
        //to show all
        List<StudentEntity> allStudent=db.studentDAO().getAll();
        ArrayAdapter<StudentEntity> as=new ArrayAdapter<StudentEntity>(this,android.R.layout.simple_list_item_1,allStudent);
        d.setAdapter(as);

    }
}