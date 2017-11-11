package com.example.neha.ui;

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.graphics.drawable.RoundedBitmapDrawable;
import android.support.v4.graphics.drawable.RoundedBitmapDrawableFactory;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class MeFragment extends Fragment {
    private Resources mResources;
    private RecyclerView recyclerView1,recyclerView2;
    private Toolbar toolbar;

    public static MeFragment newInstance() {
        MeFragment fragment = new MeFragment();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v=inflater.inflate(R.layout.fragment_try, container, false);
        toolbar = (Toolbar)v.findViewById(R.id.toolbar);
        AppCompatActivity activity = (AppCompatActivity) getActivity();



        activity.setSupportActionBar(toolbar);
        activity.getSupportActionBar().setTitle("  Profile");
        recyclerView1 = (RecyclerView)v.findViewById(R.id.recyclerview1);
        recyclerView2=(RecyclerView)v.findViewById(R.id.recyclerview2) ;
        initViews();
        populatRecyclerView();


        ImageView image=(ImageView)v.findViewById(R.id.image_profile);
        mResources = getResources();
        Bitmap bitmap= BitmapFactory.decodeResource(getResources(),
                R.drawable.image1);
        image.setImageBitmap(bitmap);
        RoundedBitmapDrawable drawable = createRoundedBitmapImageDrawableWithBorder(bitmap);
        image.setImageDrawable(drawable);
        image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getActivity(),EditProfile.class);
                startActivity(i);
            }
        });
        TextView view1=(TextView)v.findViewById(R.id.view_all1);
        view1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
Intent i=new Intent(getActivity(),MePostsActivity.class);
                startActivity(i);
            }
        });
        TextView view2=(TextView)v.findViewById(R.id.view_all2);
        view2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
Intent i=new Intent(getActivity(),MeCoursesActivity.class);
                startActivity(i);
            }
        });
        return v;
    }

    private void populatRecyclerView() {
        ArrayList<PostsItemModel> dataList = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            dataList.add(new PostsItemModel(R.drawable.image1,"27.10.17","Machine Learning Basics","TITLE","Aimed at"));
        }
        ArrayList<PickItem> dataList2=new ArrayList<>();

            dataList2.add(new PickItem("JAVA",R.drawable.image1,R.drawable.scrim3));
       dataList2.add(new PickItem("AR",R.drawable.image1,R.drawable.scrim));
        dataList2.add(new PickItem("MACHINE",R.drawable.image1,R.drawable.scrim4));
        dataList2.add(new PickItem("TECH",R.drawable.image1,R.drawable.scrim7));
        dataList2.add(new PickItem("JAVA",R.drawable.image1,R.drawable.scrim3));
        RecyclerViewMeAdapter  adapter = new RecyclerViewMeAdapter(getActivity(), dataList);
        RecyclerViewCoursesAdapter  adapter2 = new RecyclerViewCoursesAdapter(getActivity(), dataList2);
        recyclerView1.setAdapter(adapter);
        recyclerView2.setAdapter(adapter2);// set adapter on recyclerview
        adapter.notifyDataSetChanged();
        adapter2.notifyDataSetChanged();
    }

    private void initViews() {

        recyclerView1.setHasFixedSize(true);
        recyclerView1
                .setLayoutManager(new LinearLayoutManager(getActivity(), LinearLayoutManager.HORIZONTAL,false));
        recyclerView2.setHasFixedSize(true);
        recyclerView2
                .setLayoutManager(new LinearLayoutManager(getActivity(), LinearLayoutManager.HORIZONTAL,false));
    }


    private RoundedBitmapDrawable createRoundedBitmapImageDrawableWithBorder(Bitmap bitmap){
        int bitmapWidthImage = bitmap.getWidth();
        int bitmapHeightImage = bitmap.getHeight();
        int borderWidthHalfImage = 8;

        int bitmapRadiusImage = Math.min(bitmapWidthImage,bitmapHeightImage)/2;
        int bitmapSquareWidthImage = Math.min(bitmapWidthImage,bitmapHeightImage);
        int newBitmapSquareWidthImage = bitmapSquareWidthImage+borderWidthHalfImage;

        Bitmap roundedImageBitmap = Bitmap.createBitmap(newBitmapSquareWidthImage,newBitmapSquareWidthImage,Bitmap.Config.ARGB_8888);
        Canvas mcanvas = new Canvas(roundedImageBitmap);
        mcanvas.drawColor(Color.TRANSPARENT);
        int i = borderWidthHalfImage + bitmapSquareWidthImage - bitmapWidthImage;
        int j = borderWidthHalfImage + bitmapSquareWidthImage - bitmapHeightImage;

        mcanvas.drawBitmap(bitmap, i, j, null);

        Paint borderImagePaint = new Paint();
        borderImagePaint.setStyle(Paint.Style.STROKE);
        borderImagePaint.setStrokeWidth(borderWidthHalfImage*2);
        borderImagePaint.setColor(Color.WHITE);
        mcanvas.drawCircle(mcanvas.getWidth()/2, mcanvas.getWidth()/2, newBitmapSquareWidthImage/2, borderImagePaint);

        RoundedBitmapDrawable roundedImageBitmapDrawable = RoundedBitmapDrawableFactory.create(mResources,roundedImageBitmap);
        roundedImageBitmapDrawable.setCornerRadius(bitmapRadiusImage);
        roundedImageBitmapDrawable.setAntiAlias(true);
        return roundedImageBitmapDrawable;
    }



}