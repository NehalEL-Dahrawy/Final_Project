package com.example.f_project;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.List;

public class MovieAdapter extends RecyclerView.Adapter<MovieAdapter.MovieViewHolder> {
    List<MovieItem> movies ;

    public MovieAdapter(List<MovieItem> movies){

        this.movies = movies;
    }


    public MovieViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.movie_list_item,parent,false);
        return new MovieViewHolder(view);
    }


    public void onBindViewHolder(@NonNull MovieViewHolder holder, int position) {

        holder.name.setText(movies.get(position).getName());
        Picasso.get().load(movies.get(position).getImageUrl()).into(holder.movieicon);

    }


    public int getItemCount() {

        return movies.size();
    }

    class MovieViewHolder extends RecyclerView.ViewHolder {
        TextView name;

        ImageView movieicon;

        public MovieViewHolder(@NonNull View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.movieName);
            movieicon = (ImageView) itemView.findViewById(R.id.movieicon);

        }
    }




}
