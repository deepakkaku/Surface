package com.deepakkaku.surface;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.deepakkaku.surface.Adapter.HomeGridAdapter;
import com.deepakkaku.surface.Utility.Config;

public class SurfaceHomeActivity extends AppCompatActivity {

    RecyclerView homeGrid;
    GridLayoutManager gridLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_surface_home);

        homeGrid = (RecyclerView) findViewById(R.id.homeGrid);
        HomeGridAdapter mAdapter = new HomeGridAdapter(this);
        mAdapter.initialize();
        homeGrid.setAdapter(mAdapter);
        int numOfColumns = Config.calculateColumns(this);
        gridLayoutManager = new GridLayoutManager(this, numOfColumns);
        homeGrid.setLayoutManager(gridLayoutManager);
    }
}
