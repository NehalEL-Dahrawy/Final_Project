package com.example.f_project;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ProductViewHolder> {
    ArrayList<Movie> rec_fav;


    public MyAdapter(ArrayList<Movie> rec_fav) {
        this.rec_fav = rec_fav;
    }

    @NonNull
    @Override
    public ProductViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ProductViewHolder(LayoutInflater.from(parent.getContext())
                .inflate(R.layout.fav_list,parent,false));
    }


    @Override
    public void onBindViewHolder(@NonNull ProductViewHolder holder, int position) {
      //  holder.text.setText(rec_fav.get(position).getName());
      //  Picasso.get().load(rec_fav.get(position).getImageUrl()).into(holder.FAV);

    }

    @Override
    public int getItemCount() {

        return rec_fav.size();
    }

    static class ProductViewHolder extends RecyclerView.ViewHolder {
        TextView text;
        ImageView FAV ;
        public ProductViewHolder(@NonNull View itemView) {
            super(itemView);
           text = itemView.findViewById(R.id.text);
            //  ProductImageUrl = itemView.findViewById(R.id.imagurl);
            FAV = itemView.findViewById(R.id.FAV);
        }
    }

}

