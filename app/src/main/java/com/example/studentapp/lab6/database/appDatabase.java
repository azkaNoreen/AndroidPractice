package com.example.studentapp.lab6.database;

import androidx.room.Database;
import androidx.room.RoomDatabase;
@Database(entities = {StudentEntity.class},version = 3)
public abstract class appDatabase extends RoomDatabase {
    public static appDatabase dataBase;
    public abstract StudentDAO studentDAO();



}
