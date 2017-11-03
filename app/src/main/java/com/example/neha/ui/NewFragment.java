package com.example.neha.ui;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class NewFragment extends Fragment {
    ArrayList<SectionDataModel> allSampleData;
    private Toolbar toolbar;
    public static NewFragment newInstance() {
        NewFragment fragment = new NewFragment();
        return fragment;
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v=inflater.inflate(R.layout.fragment_new, container, false);
        toolbar = (Toolbar)v.findViewById(R.id.toolbar);
        AppCompatActivity activity = (AppCompatActivity) getActivity();

        allSampleData = new ArrayList<SectionDataModel>();

        activity.setSupportActionBar(toolbar);
        activity.getSupportActionBar().setTitle("  New");



        createDummyData();


        RecyclerView my_recycler_view = (RecyclerView)v.findViewById(R.id.my_recycler_view);
        RecyclerViewDataAdapter adapter = new RecyclerViewDataAdapter(getActivity(), allSampleData);

        my_recycler_view.setLayoutManager(new LinearLayoutManager(getActivity(), LinearLayoutManager.VERTICAL, false));

        my_recycler_view.setAdapter(adapter);

        return v;
    }
    public void createDummyData() {
        for (int i = 1; i <= 5; i++) {

            SectionDataModel dm = new SectionDataModel();

            dm.setHeaderTitle("Section " + i);

            ArrayList<SingleItemModel> singleItem = new ArrayList<SingleItemModel>();
            for (int j = 0; j <= 5; j++) {
                singleItem.add(new SingleItemModel(R.drawable.image1,"27.10.17","Machine Learning Basics","neha sharma"));
            }

            dm.setAllItemsInSection(singleItem);
            allSampleData.add(dm);
        }
    }
}
