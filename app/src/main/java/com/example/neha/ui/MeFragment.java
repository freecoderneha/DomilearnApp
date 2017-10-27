package com.example.neha.ui;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.graphics.drawable.RoundedBitmapDrawable;
import android.support.v4.graphics.drawable.RoundedBitmapDrawableFactory;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

public class MeFragment extends Fragment {
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
        View v=inflater.inflate(R.layout.fragment_me, container, false);
        ImageView image=(ImageView)v.findViewById(R.id.image_profile);
        Bitmap bitmap= BitmapFactory.decodeResource(getResources(),
                R.drawable.image1);
        RoundedBitmapDrawable drawable = RoundedBitmapDrawableFactory.create(getResources(),bitmap);
        drawable.setCircular(true);
        image.setImageDrawable(drawable);
        return v;
    }
}