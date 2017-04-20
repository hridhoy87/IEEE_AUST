package com.hridoy.user.ieee_aust;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;

import static android.support.v7.recyclerview.R.styleable.RecyclerView;


public class MyOtherActivity extends Activity {


    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_other);

    }
}
