package com.example.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //button 1 untuk menampilkan activity list view

        Button butt1=(Button)findViewById(R.id.butt1);
        butt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent inten1 = new Intent(MainActivity.this,listviewact.class);
                startActivity(inten1);
            }
        });

        //button 2 untuk menampilkan activity spinner

        Button butt2=(Button)findViewById(R.id.butt2);
        butt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent inten1 = new Intent(MainActivity.this,spinneract.class);
                startActivity(inten1);
            }
        });

        //button 3 untuk menampilkan activity autocomplete

        Button butt3=(Button)findViewById(R.id.butt3);
        butt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent inten1 = new Intent(MainActivity.this,autocomplete.class);
                startActivity(inten1);
            }
        });

        //button 4 untuk menampilkan activity recycler view

        Button butt4=(Button)findViewById(R.id.butt4);
        butt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent inten1 = new Intent(MainActivity.this,recyclerview.class);
                startActivity(inten1);
            }
        });

    }
}