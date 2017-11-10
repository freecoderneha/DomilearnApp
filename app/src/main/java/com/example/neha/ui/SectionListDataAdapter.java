package com.example.neha.ui;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;


import org.w3c.dom.Text;

import java.util.ArrayList;

public class SectionListDataAdapter extends RecyclerView.Adapter<SectionListDataAdapter.SingleItemRowHolder> {

    private ArrayList<SingleItemModel> itemsList;
    private Context mContext;

    public SectionListDataAdapter(Context context, ArrayList<SingleItemModel> itemsList) {
        this.itemsList = itemsList;
        this.mContext = context;
    }

    @Override
    public SingleItemRowHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.list_single_card, null);
        SingleItemRowHolder mh = new SingleItemRowHolder(v);
        return mh;
    }

    @Override
    public void onBindViewHolder(SingleItemRowHolder holder, int i) {

        SingleItemModel singleItem = itemsList.get(i);

        holder.date.setText(singleItem.getDate());
        holder.description.setText(singleItem.getDescription());
        holder.created.setText(singleItem.getCreated());
holder.title.setText(singleItem.getTitle());
        holder.itemImage.setImageResource(singleItem.getImage());
        holder.aimed.setText(singleItem.getAimed());
    }

    @Override
    public int getItemCount() {
        return (null != itemsList ? itemsList.size() : 0);
    }

    public class SingleItemRowHolder extends RecyclerView.ViewHolder {

        protected TextView date;
        protected TextView description;
        protected TextView created;
        protected ImageView itemImage;
        protected TextView aimed;

protected TextView title;
        public SingleItemRowHolder(View view) {
            super(view);

            this.date=(TextView) view.findViewById(R.id.date);
            this.description=(TextView) view.findViewById(R.id.description);
            this.created=(TextView) view.findViewById(R.id.created);
            this.itemImage = (ImageView) view.findViewById(R.id.itemImage);
            this.title=(TextView) view.findViewById(R.id.title);
            this.aimed=(TextView) view.findViewById(R.id.aimed_at);
            view.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i=new Intent(mContext,DetailActivity.class);
                    mContext.startActivity(i);

                }
            });
        }
    }

}