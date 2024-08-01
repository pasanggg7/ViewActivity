package com.pasang.viewactivity;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.pasang.viewactivity.R;

import java.util.ArrayList;

public class RecyclerViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view);

        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        ArrayList<String> dataList = getIntent().getStringArrayListExtra("dataList");

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        com.pasang.viewactivity.RecyclerViewAdapter adapter = new com.pasang.viewactivity.RecyclerViewAdapter(dataList);
        recyclerView.setAdapter(adapter);
    }
}