package com.example.neha.ui;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.GridView;

import java.util.ArrayList;


public class MeCoursesActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_me_courses);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("  My Courses");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        final ArrayList<PickItem> coursesList=new ArrayList<>();

        coursesList.add(new PickItem("JAVA",R.drawable.image1,R.drawable.scrim3));
        coursesList.add(new PickItem("AR",R.drawable.image1,R.drawable.scrim));
        coursesList.add(new PickItem("MACHINE",R.drawable.image1,R.drawable.scrim4));
        coursesList.add(new PickItem("TECH",R.drawable.image1,R.drawable.scrim7));
        coursesList.add(new PickItem("JAVA",R.drawable.image1,R.drawable.scrim3));
        coursesList.add(new PickItem("AR",R.drawable.image1,R.drawable.scrim));
        coursesList.add(new PickItem("MACHINE",R.drawable.image1,R.drawable.scrim4));
        coursesList.add(new PickItem("TECH",R.drawable.image1,R.drawable.scrim7));

        MeCoursesAdapter adapter = new MeCoursesAdapter(this, coursesList);
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
            case android.R.id.home:

                onBackPressed();
        }
        return super.onOptionsItemSelected(item);
    }
    @Override
    public void onBackPressed() {

        finish();
    }

}
