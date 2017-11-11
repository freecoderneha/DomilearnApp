package com.example.neha.ui;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;
import java.util.List;
public class MeCoursesAdapter extends ArrayAdapter<PickItem> {
public MeCoursesAdapter(Context context, ArrayList<PickItem> courses) {
        super(context, 0, courses);
        }

@Override
public View getView(int position, View convertView, ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
        listItemView = LayoutInflater.from(getContext()).inflate(
        R.layout.me_courses_list, parent, false);
        }
        PickItem item = getItem(position);
        TextView text = (TextView) listItemView.findViewById(R.id.text_pick);
        text.setText(item.getName());
        final View view = (View) listItemView.findViewById(R.id.view_pick);
        view.setBackgroundResource(item.getView());


        ImageView image = (ImageView) listItemView.findViewById(R.id.thumbnail_pick);
        image.setBackgroundResource(item.getThumbnail());
        return listItemView;
        }
        }

