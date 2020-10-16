package com.example.apptonghop;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;

import java.util.List;

public class CustomerAdapter extends ArrayAdapter<String>{
    private Activity context;
    private String[] name;
    private String[] type;
    private Integer[] imgid;

    public CustomerAdapter(Activity context,String[] name, String[] type, Integer[] imgid) {
        super(context, R.layout.product,type);
        this.context = context;
        this.name = name;
        this.type = type;
        this.imgid = imgid;
    }
    @Override
    public View getView(int position, View view, ViewGroup parent){
        LayoutInflater inflater=context.getLayoutInflater();
        View row = inflater.inflate(R.layout.product,null,true);
        TextView namee =(TextView) row.findViewById(R.id.product_name);
        TextView typee=(TextView) row.findViewById(R.id.product_type);
        ImageView img=(ImageView) row.findViewById(R.id.product_img);

        namee.setText(name[position]);
        typee.setText(type[position]);
        img.setImageResource(imgid[position]);
        return row;
    }
}
