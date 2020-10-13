package com.example.f_project;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.SurfaceControl;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {
    BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //Bottom nav

        BottomNavigationView btnNav = findViewById(R.id.bottomNavigationview);
        btnNav.setOnNavigationItemSelectedListener(navListener);

        //selecting Home_Fragment
        //getSupportFragmentManager().beginTransaction().replace(R.id.fragment_Layout,new HomeFragment()).commit();
        StartFragment (new HomeFragment());

    }


    // Listener nav

            BottomNavigationView.OnNavigationItemSelectedListener navListener = new
            BottomNavigationView.OnNavigationItemSelectedListener() {
                @Override
                public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                    Fragment selectedFragment = null;

                    switch (item.getItemId()){

                        case R.id.item1:

                            StartFragment (new HomeFragment());
                            break;



                        case R.id.item2:

                            StartFragment (new FavoriteFragment());
                            break;



                        case R.id.item3:
                            StartFragment (new UserFragment()) ;
                            break;
                    }

                    return true;

                    // Transaction

                   // getSupportFragmentManager().beginTransaction().replace(R.id.fragment_Layout,selectedFragment).commit();
                    //return true;

                }
            };

    private void StartFragment(Fragment fragment){
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.fragment_Layout,fragment);
        transaction.addToBackStack(null);
        transaction.commit();
    }

}