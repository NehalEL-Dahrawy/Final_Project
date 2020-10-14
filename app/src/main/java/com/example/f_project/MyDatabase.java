package com.example.f_project;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

@Database(entities = {Movie.class},exportSchema = false , version = 1)
public abstract class MyDatabase extends RoomDatabase {
    //private static final String DB_NAME = "person_db";
    public static MyDatabase  instance;
    public abstract MovieDao productDao();
    public static synchronized MyDatabase getInstance(Context context){
        if (instance == null) {
            instance = Room.databaseBuilder(context, MyDatabase.class , "data_base")
                    .allowMainThreadQueries()
                    .build();
        }
        return instance;
    }




}