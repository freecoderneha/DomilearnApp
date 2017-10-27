package com.example.neha.ui;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ListView;

import java.util.ArrayList;


public class PickActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pick_activity);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Pick any 5 topic or more");
        Button button=(Button) findViewById(R.id.button_submit);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(PickActivity.this,CoursesActivity.class);
                startActivity(i);
            }
        });
        final ArrayList<PickItem> coursesList=new ArrayList<>();
        coursesList.add(new PickItem("JAVA",R.drawable.java,R.drawable.scrim3,R.drawable.scrim11));
        coursesList.add(new PickItem("AR",R.drawable.ar,R.drawable.scrim,R.drawable.scrim8));

        coursesList.add(new PickItem("MACHINE",R.drawable.machine,R.drawable.scrim4,R.drawable.scrim9));
        coursesList.add(new PickItem("TECH",R.drawable.main4,R.drawable.scrim7,R.drawable.scrim10));
        coursesList.add(new PickItem("JAVA",R.drawable.java,R.drawable.scrim3,R.drawable.scrim11));
        coursesList.add(new PickItem("AR",R.drawable.ar,R.drawable.scrim,R.drawable.scrim8));

        coursesList.add(new PickItem("MACHINE",R.drawable.machine,R.drawable.scrim4,R.drawable.scrim9));
        coursesList.add(new PickItem("TECH",R.drawable.main4,R.drawable.scrim7,R.drawable.scrim10));
        PickAdapter adapter = new PickAdapter(this, coursesList);

        GridView gridView = (GridView) findViewById(R.id.grid);


        gridView.setAdapter(adapter);



    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_search, menu);
        return true;
    }

    @Override
    public boolean onPrepareOptionsMenu(Menu menu) {
        super.onPrepareOptionsMenu(menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_search:
                return true;

        }
        return super.onOptionsItemSelected(item);
    }
            }
