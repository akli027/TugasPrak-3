package com.example.cafelist;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Dashboard extends AppCompatActivity {
        RecyclerView recyclerView;
        ImageButton myButton;

        String s1[], s2[], s3[];
        int images[] = {R.drawable.ft1 ,R.drawable.ft2 ,R.drawable.ft3,R.drawable.ft4,R.drawable.ft5,R.drawable.ft6,R.drawable.ft7,R.drawable.ft8,R.drawable.ft9,R.drawable.ft10 };
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_dashboard);

            recyclerView = findViewById(R.id.recyclerView);

            s1 = getResources().getStringArray(R.array.judul);
            s2 = getResources().getStringArray(R.array.description);
            s3 = getResources().getStringArray(R.array.price);


            MyAdapter myAdapter = new MyAdapter(this, s1,s2,s3,images);
            recyclerView.setAdapter(myAdapter);
            recyclerView.setLayoutManager(new LinearLayoutManager(this));

            myButton = (ImageButton) findViewById(R.id.button);
            myButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(Dashboard.this, profil.class);
                    startActivity(intent);
                }
            });
        }
    }
