package com.example.neha.ui;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;


public class AdapterPosts extends RecyclerView.Adapter<AdapterPosts.SingleItemRowHolder> {

    private ArrayList<PostsItemModel> dataList;
    private Context mContext;


    public AdapterPosts(Context context, ArrayList<PostsItemModel> dataList) {
        this.dataList = dataList;
        this.mContext = context;
    }

    @Override
    public SingleItemRowHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_list_post, null);
       AdapterPosts.SingleItemRowHolder mh = new AdapterPosts.SingleItemRowHolder(v);
        return mh;
    }

    @Override
    public void onBindViewHolder(SingleItemRowHolder holder, int position) {
        PostsItemModel singleItem = dataList.get(position);

        holder.date.setText(singleItem.getDate());
        holder.description.setText(singleItem.getDescription());
        holder.itemImage.setImageResource(singleItem.getImage());
        holder.title.setText(singleItem.getTitle());
        holder.aimed.setText(singleItem.getAimed());
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
        protected  TextView aimed;
        public SingleItemRowHolder(View view) {
            super(view);

            this.date=(TextView) view.findViewById(R.id.date);
            this.description=(TextView) view.findViewById(R.id.description);
            this.itemImage = (ImageView) view.findViewById(R.id.itemImage);
            this.title=(TextView) view.findViewById(R.id.title);
            this.aimed=(TextView) view.findViewById(R.id.aimed);
            view.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i=new Intent(mContext,EditPost.class);
                    mContext.startActivity(i);
                }
            });
        }
    }
}

