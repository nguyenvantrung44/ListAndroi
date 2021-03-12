package com.example.listandroi;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomGoodsAdapter extends BaseAdapter {

    Context ctx;
    int layoutItem;
    ArrayList<Goods> arrayList;

    public CustomGoodsAdapter(Context ctx, int layoutItem, ArrayList<Goods> arrayList) {
        this.ctx = ctx;
        this.layoutItem = layoutItem;
        this.arrayList = arrayList;
    }

    @Override
    public int getCount() {
        return arrayList.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        view = LayoutInflater.from(ctx).inflate(layoutItem,viewGroup,false);

        TextView tvName=view.findViewById(R.id.tvName);
        TextView tvGia = view.findViewById(R.id.tvGia);
        ImageView imgGoods= view.findViewById(R.id.imgGoods);

        tvName.setText(arrayList.get(i).getName());
        tvGia.setText(arrayList.get(i).getGia());
        imgGoods.setImageResource(arrayList.get(i).getImageGoods());
        return view;
    }
}
