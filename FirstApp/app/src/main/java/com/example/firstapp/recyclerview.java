package com.example.firstapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class recyclerview extends AppCompatActivity {
    //class untuk menampilkan recycler view
    RecyclerView recyclerView;
    RecyclerView.Adapter recyclerViewAdapter;
    RecyclerView.LayoutManager recyclerViewLayoutManager;
    ArrayList<ItemModel> data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recyclerview);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);

        recyclerViewLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(recyclerViewLayoutManager);
        recyclerView.addItemDecoration(new DividerItemDecoration(this, DividerItemDecoration.VERTICAL));


        data = new ArrayList<>();
        for (int i = 0; i < MyItem.HeadLine.length; i++) {
            data.add(new ItemModel(
                    MyItem.HeadLine[i],
                    MyItem.SubHeadLine[i],
                    MyItem.iconlist[i]));
        }

        recyclerViewAdapter = new AdapterRecyclerView(data);
        recyclerView.setAdapter(recyclerViewAdapter);

    }
}