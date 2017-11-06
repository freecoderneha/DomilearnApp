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



public class RecyclerViewMeAdapter extends RecyclerView.Adapter<RecyclerViewMeAdapter.SingleItemRowHolder> {

    private ArrayList<PostsItemModel> dataList;
    private Context mContext;


    public RecyclerViewMeAdapter(Context context, ArrayList<PostsItemModel> dataList) {
        this.dataList = dataList;
        this.mContext = context;
    }

    @Override
    public SingleItemRowHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.horizontal_view, null);
        RecyclerViewMeAdapter.SingleItemRowHolder mh = new RecyclerViewMeAdapter.SingleItemRowHolder(v);
        return mh;
    }

    @Override
    public void onBindViewHolder(SingleItemRowHolder holder, int position) {
        PostsItemModel singleItem = dataList.get(position);

        holder.date.setText(singleItem.getDate());
        holder.description.setText(singleItem.getDescription());
        holder.itemImage.setImageResource(singleItem.getImage());
        holder.title.setText(singleItem.getTitle());
    }

    @Override
    public int getItemCount() {
        return (null != dataList ? dataList.size() : 0);
    }


    public class SingleItemRowHolder extends RecyclerView.ViewHolder {

        protected TextView date;
        protected TextView description;
        protected ImageView itemImage;
protected  TextView title;

        public SingleItemRowHolder(View view) {
            super(view);

            this.date=(TextView) view.findViewById(R.id.date);
            this.description=(TextView) view.findViewById(R.id.description);
            this.itemImage = (ImageView) view.findViewById(R.id.itemImage);
            this.title=(TextView) view.findViewById(R.id.title);
        }
    }
}

