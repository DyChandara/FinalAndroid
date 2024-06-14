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

public class Post extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_post);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        ImageView btnlogout = findViewById(R.id.back);
        btnlogout.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(Post.this, ProductList.class);
                startActivity(intent);
            }

        });


        ImageView btngo = findViewById(R.id.btngo);
        btngo.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(Post.this, Notification.class);
                startActivity(intent);
            }

        });


    ImageView GoTo = findViewById(R.id.back);
        GoTo.setOnClickListener(new View.OnClickListener(){
        @Override
        public void onClick(View v){
            Intent intent = new Intent(Post.this, Home.class);
            startActivity(intent);
        }

    });
    }
}