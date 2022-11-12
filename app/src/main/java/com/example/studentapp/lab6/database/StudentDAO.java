package com.example.studentapp.lab6.database;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

@Dao
public interface StudentDAO {
    @Insert
    void insertStudent(StudentEntity student);

//    @Delete
//    void deleteStudent(StudentEntity student);

    @Query("SELECT * FROM StudentEntity")
    List<StudentEntity> getAll();



}
