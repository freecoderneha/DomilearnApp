package com.example.neha.ui;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;



public class RecyclerViewCoursesAdapter extends RecyclerView.Adapter<RecyclerViewCoursesAdapter.SingleItemRowHolder> {

    private ArrayList<PickItem> dataList;
    private Context mContext;


    public RecyclerViewCoursesAdapter(Context context, ArrayList<PickItem> dataList) {
        this.dataList = dataList;
        this.mContext = context;
    }

    @Override
    public SingleItemRowHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_single_post, null);
        RecyclerViewCoursesAdapter.SingleItemRowHolder mh = new RecyclerViewCoursesAdapter.SingleItemRowHolder(v);
        return mh;
    }

    @Override
    public void onBindViewHolder(SingleItemRowHolder holder, int position) {
        PickItem singleItem = dataList.get(position);

        holder.text.setText(singleItem.getName());
        holder.image.setImageResource(singleItem.getThumbnail());
        holder.view.setBackgroundResource(singleItem.getView());
    }

    @Override
    public int getItemCount() {
        return (null != dataList ? dataList.size() : 0);
    }


    public class SingleItemRowHolder extends RecyclerView.ViewHolder {

        protected TextView text;
        protected ImageView image;
        protected View view;
        public SingleItemRowHolder(View view) {
            super(view);

            this.text=(TextView) view.findViewById(R.id.text_pick);
            this.image=(ImageView) view.findViewById(R.id.thumbnail_pick);
            this.view = (View) view.findViewById(R.id.view_pick);

        }
    }
}


