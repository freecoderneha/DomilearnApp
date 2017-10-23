package com.example.neha.ui;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bumptech.glide.Glide;

import java.util.ArrayList;
import java.util.List;

public class PickAdapter extends ArrayAdapter<PickItem> {


    public PickAdapter(Context context, ArrayList<PickItem> courses) {
        super(context, 0, courses);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.pick_list, parent, false);
        }
        PickItem item = getItem(position);
        TextView text = (TextView) listItemView.findViewById(R.id.text_pick);
        text.setText(item.getName());
        final View view = (View) listItemView.findViewById(R.id.view_pick);
        view.setBackgroundResource(item.getView());
        Button button = (Button) listItemView.findViewById(R.id.button_follow_pick);
        button.setBackgroundResource(item.getColor());
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                view.setBackgroundResource(R.color.highlight);
            }
        });
        ImageView image = (ImageView) listItemView.findViewById(R.id.thumbnail_pick);
        image.setBackgroundResource(item.getThumbnail());
        return listItemView;
    }
}