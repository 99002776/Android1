package com.example.lntapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class RecyclerActivity extends AppCompatActivity {
    String[] languagesData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler);
        languagesData=new String[]{"english","hindi","telugu","kannada","urdu"};
        RecyclerView recyclerView=findViewById(R.id.recyclerView);
//        MyAdapter adapter=new MyAdapter(this,languagesData);
        /*MyAdapter adapter = new MyAdapter(this,languagesData);
        MyAdapter adapter = new MyAdapter(this,languagesData);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        recyclerView.setAdapter(adapter);*/

    }
}