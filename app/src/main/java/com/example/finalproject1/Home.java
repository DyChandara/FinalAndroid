package com.example.finalproject1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_home);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        ImageButton btnpro1 = findViewById(R.id.pro1);
        btnpro1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(Home.this, ProductList.class);
                startActivity(intent);
            }

        });


        ImageView btnlogout1 = findViewById(R.id.cambg2);
        btnlogout1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(Home.this, Post.class);
                startActivity(intent);
            }

        });


        ImageView btnprofile = findViewById(R.id.profile);
        btnprofile.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(Home.this, Profile.class);
                startActivity(intent);
            }

        });

        ImageView Notification = findViewById(R.id.notification);
        Notification.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(Home.this, Notification.class);
                startActivity(intent);
            }

        });

        ImageView message = findViewById(R.id.message);
        message.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(Home.this, list_chatting.class);
                startActivity(intent);
            }

        });
    }
}