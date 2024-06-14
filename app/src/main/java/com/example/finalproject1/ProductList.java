package com.example.finalproject1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class ProductList extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_product_list);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        ImageButton btnlogout = findViewById(R.id.pro1);
        btnlogout.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(ProductList.this, Detail.class);
                startActivity(intent);
            }

        });

        ImageButton btnlogout1 = findViewById(R.id.list1);
        btnlogout1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(ProductList.this, Detail.class);
                startActivity(intent);
            }

        });

        ImageView btnlogout2 = findViewById(R.id.back1);
        btnlogout2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(ProductList.this, Home.class);
                startActivity(intent);
            }

        });

        ImageView btnlogout3 = findViewById(R.id.cambg2);
        btnlogout3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(ProductList.this, Post.class);
                startActivity(intent);
            }

        });

        ImageView btnprofile = findViewById(R.id.profile);
        btnprofile.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(ProductList.this, Profile.class);
                startActivity(intent);
            }

        });

        ImageView btnhome1 = findViewById(R.id.home);
        btnhome1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(ProductList.this, Home.class);
                startActivity(intent);
            }

        });

    }
}