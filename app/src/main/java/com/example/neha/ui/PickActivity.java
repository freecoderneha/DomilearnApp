package com.example.neha.ui;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;


public class PickActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pick_activity);
        final ArrayList<PickItem> coursesList=new ArrayList<>();
        coursesList.add(new PickItem("JAVA",R.drawable.java,R.drawable.scrim3,R.drawable.scrim3));
        coursesList.add(new PickItem("AR",R.drawable.ar,R.drawable.scrim,R.drawable.scrim8));

        coursesList.add(new PickItem("MACHINE",R.drawable.machine,R.drawable.scrim4,R.drawable.scrim9));
        coursesList.add(new PickItem("TECH",R.drawable.main4,R.drawable.scrim7,R.drawable.scrim10));
        PickAdapter adapter = new PickAdapter(this, coursesList);

        ListView listView = (ListView) findViewById(R.id.list_pick);


        listView.setAdapter(adapter);


    }
            }
