package com.pasang.viewactivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.pasang.viewactivity.R;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private EditText nameEditText, ageEditText, occupationEditText, addressEditText;
    private ArrayList<String> dataList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize UI elements
        nameEditText = findViewById(R.id.nameEditText);
        ageEditText = findViewById(R.id.ageEditText);
        occupationEditText = findViewById(R.id.occupationEditText);
        addressEditText = findViewById(R.id.addressEditText);
        Button addButton = findViewById(R.id.addButton);
        Button listViewButton = findViewById(R.id.listViewButton);
        Button gridViewButton = findViewById(R.id.gridViewButton);
        Button recyclerViewButton = findViewById(R.id.recyclerViewButton);

        // Initialize data list
        dataList = new ArrayList<>();

        // Set onClick listeners for buttons
        addButton.setOnClickListener(v -> addData());

        listViewButton.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, com.pasang.viewactivity.ListViewActivity.class);
            intent.putStringArrayListExtra("dataList", dataList);
            startActivity(intent);
        });

        gridViewButton.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, com.pasang.viewactivity.GridViewActivity.class);
            intent.putStringArrayListExtra("dataList", dataList);
            startActivity(intent);
        });

        recyclerViewButton.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, com.pasang.viewactivity.RecyclerViewActivity.class);
            intent.putStringArrayListExtra("dataList", dataList);
            startActivity(intent);
        });
    }

    private void addData() {
        String name = nameEditText.getText().toString();
        String age = ageEditText.getText().toString();
        String occupation = occupationEditText.getText().toString();
        String address = addressEditText.getText().toString();

        String data = "Name: " + name + ", Age: " + age + ", Occupation: " + occupation + ", Address: " + address;
        dataList.add(data);
    }
}