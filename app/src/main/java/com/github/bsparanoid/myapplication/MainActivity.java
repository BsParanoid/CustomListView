package com.github.bsparanoid.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    ArrayList<DataModel> dataModels;
    ListView listView;
    private static CustomAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        listView=(ListView)findViewById(R.id.list);


        dataModels= new ArrayList<>();

        dataModels.add(new DataModel("test", "1"));
        dataModels.add(new DataModel("test", "2"));
        dataModels.add(new DataModel("test", "3"));
        dataModels.add(new DataModel("test", "4"));
        dataModels.add(new DataModel("test", "5"));
        dataModels.add(new DataModel("test", "6"));
        dataModels.add(new DataModel("test", "7"));
        dataModels.add(new DataModel("test", "8"));
        dataModels.add(new DataModel("test", "9"));
        dataModels.add(new DataModel("test", "10"));
        dataModels.add(new DataModel("test", "11"));
        dataModels.add(new DataModel("test", "12"));
        dataModels.add(new DataModel("test", "13"));

        adapter= new CustomAdapter(dataModels,getApplicationContext());

        listView.setAdapter(adapter);
    }
}
