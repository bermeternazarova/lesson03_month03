package com.example.lesson03_month03;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button like, home,profile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        like=findViewById(R.id.like);
        profile=findViewById(R.id.profile);
        home=findViewById(R.id.home);

        getSupportFragmentManager().beginTransaction().add(R.id.containerfr,new HomeFragment());

        like.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getSupportFragmentManager().beginTransaction().add(R.id.containerfr,new LikeFragment()).addToBackStack(null ).commit();
            }
        });
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getSupportFragmentManager().beginTransaction().add(R.id.containerfr,new HomeFragment()).addToBackStack(null).commit();
            }
        });
        profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getSupportFragmentManager().beginTransaction().add(R.id.containerfr,new ProfileFragment()).addToBackStack(null).commit();
            }
        });
    }
}