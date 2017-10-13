package com.dreaminreality.ranad_000.myapplication;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;

    Context context;

    RecyclerView.Adapter recyclerView_Adapter;

    RecyclerView.LayoutManager recyclerViewLayoutManager;

    String[] numbers = {
            "onedfsafsadfasdfsdafasdfasdfasdfasdf",
            "twofadsafsadfasdfsdafdasfads",
            "thrfasdfsdafasdfasdfsdafee",
            "foufasdfsadfasdfasdr",
            "fivfasdfasdfasdfe",
            "sixadsfasdfasd",
            "sevfadsfasdfsdafsaden",
            "eigfasdfasdfasdht",
            "ninfadsfasdfe",
            "tenasdfasdfasdfsadfas",
            "elevdfasdfasdfasdfen",

    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        context = getApplicationContext();

        recyclerView = (RecyclerView) findViewById(R.id.recycler_view1);

        //Change 2 to your choice because here 2 is the number of Grid layout Columns in each row.
        recyclerViewLayoutManager = new GridLayoutManager(context, 3);

        recyclerView.setLayoutManager(recyclerViewLayoutManager);

        recyclerView_Adapter = new RecyclerViewAdapter(context,numbers);

        recyclerView.setAdapter(recyclerView_Adapter);

    }
}