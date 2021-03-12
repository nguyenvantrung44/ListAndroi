package com.example.listandroi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    ListView lvGoods;
    CustomGoodsAdapter adt;
    ArrayList<Goods> arrayList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvGoods = findViewById(R.id.lvGoods);
        arrayList  = new ArrayList<>();
        arrayList.add(new Goods("ao 1","80$",R.drawable.a_teveloper_tester_can_never_be_friend));
        arrayList.add(new Goods("ao 2","85$",R.drawable.android_mobile_app_developer));
        arrayList.add(new Goods("ao 3","90$",R.drawable.computer_engineer_mens_sport));

        adt = new CustomGoodsAdapter(this,R.layout.item_listview,arrayList);
        lvGoods.setAdapter(adt);
    }
}