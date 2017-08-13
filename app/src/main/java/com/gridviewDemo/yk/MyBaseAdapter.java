package com.gridviewDemo.yk;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

/**
 * Created by yk on 2017/8/13.
 */

public class MyBaseAdapter extends BaseAdapter {

    private Context myContent;
    private List<Integer> img_list;

    public MyBaseAdapter(Context context,List<Integer> list){

        this.myContent = context;
        this.img_list = list;
    }

    @Override
    public int getCount() {
        return img_list.size();
    }

    @Override
    public Object getItem(int i) {
        return i;
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(final int position, View view, ViewGroup viewGroup) {
        LayoutInflater layoutInflater = LayoutInflater.from(myContent);
        View v = layoutInflater.inflate(R.layout.item,null);
        ImageView imageView = (ImageView) v.findViewById(R.id.img_gridview);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(myContent,"当前点击的是第"+(position+1)+"个图片",Toast.LENGTH_SHORT).show();
            }
        });
        TextView textView = (TextView) v.findViewById(R.id.tv_gridview);

        imageView.setImageResource(img_list.get(position));
        textView.setText(String.valueOf(position));

        return v;
    }
}
