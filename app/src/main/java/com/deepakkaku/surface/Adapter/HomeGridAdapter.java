package com.deepakkaku.surface.Adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.deepakkaku.surface.R;

import java.util.ArrayList;

/**
 * Created by Deepak Kaku on 13-08-2018.
 */

public class HomeGridAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder>{

    ArrayList<Integer> items = new ArrayList<Integer>();
    Context mContext;
    public void initialize(){
        for(int i=0; i<10; i++){
            items.add(i);
        }
    }

    public HomeGridAdapter(Context context){
        mContext = context;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.grid_home_item, parent, false);
        return new HomeGridHolder(itemView);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        HomeGridHolder itemHolder = (HomeGridHolder) holder;
        itemHolder.image.setImageResource(R.drawable.placeholder);
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public int getItemViewType(int position) {
        return position;
    }

    public class HomeGridHolder extends RecyclerView.ViewHolder{

        ImageView image;
        TextView title;
        public HomeGridHolder(View itemView) {
            super(itemView);
            image = (ImageView) itemView.findViewById(R.id.image);
            title = (TextView) itemView.findViewById(R.id.title);
        }
    }
}
