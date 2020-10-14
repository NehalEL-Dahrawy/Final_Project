package com.example.f_project;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.Toast;


import org.json.JSONException;

import java.util.ArrayList;

import java.util.List;
import retrofit2.Retrofit;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;



public class HomeFragment extends Fragment {

    RecyclerView movielist;
    MovieAdapter movieAdapter;
    private ArrayList<ApiClient> movieList;

    @NonNull
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @NonNull ViewGroup container,
                             @NonNull Bundle savedInstanceState) {

        movieList = new ArrayList<>();
        return inflater.inflate(R.layout.fragment_home, container, false);
    }


    public HomeFragment() {
        // Required empty public constructor
    }



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        //LinearLayoutManager llm = new LinearLayoutManager(getContext());
        //movielist.setOrientation(LinearLayoutManager.VERTICAL);
        //movielist.setLayoutManager(llm);
        //movielist.setAdapter( movieAdapter );
       // movielist = getActivity().findViewById(R.id.movielist);




        // movieList = findViewById(R.id.movieList);

        ApiInterface apiInterface = ApiClient.getClient().create(ApiInterface.class);
        apiInterface.getMovies().enqueue(new Callback<List<MovieItem>>() {

            public void onResponse(Call<List<MovieItem>> call, Response<List<MovieItem>> response) {

                List<MovieItem> movieItems = response.body();
               // SetupAdapter(movieItems);
            }

            public void onFailure(Call<List<MovieItem>> call, Throwable t) {

                 //Toast.makeText(HomeFragment.this, "Unable to load users", Toast.LENGTH_SHORT).show();


            }
        });


        // Inflate the layout for this fragment
        //  return inflater.inflate(R.layout.fragment_home, container, false);


    }

   // private void SetupAdapter(List<MovieItem> list) {

      //  MovieAdapter adapter = new MovieAdapter(list);
     //   LinearLayoutManager layoutManager = new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL, false);
    //    movieList.setLayoutManager(layoutManager);
    //    movieList.setAdapter(adapter);


   // }


}