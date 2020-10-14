package com.example.f_project;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.ArrayList;
import java.util.List;

@Dao
public interface MovieDao {

    @Query("SELECT * FROM Movie")
    ArrayList<Movie> getAll();


   // @Insert
  //  void insertAll(ArrayList<Movie>movie);

    @Insert
    Void insert (Movie movie);

    @Update
    void update (Movie movie);

    @Delete
    void delete(Movie movie);



    }



