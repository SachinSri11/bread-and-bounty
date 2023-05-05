package com.example.imdad;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.imdad.adapter.ngoadapter;
import com.example.imdad.adapter.topngoadapter;
import com.example.imdad.model.ngo;
import com.example.imdad.model.topngo;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;
import java.util.List;

public class Home_page extends AppCompatActivity  {
    RecyclerView ngoRecycler, topngoRecycler;
    ngoadapter ngoadapter;
    topngoadapter topngoadapter;
    BottomNavigationView bottomNavigationView;
    profile firstFragment =new profile();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);

        List<ngo> ngoList = new ArrayList<>();
        ngoList.add(new ngo("Government NGO", "256 NGO's", R.drawable.government_building));
        ngoList.add(new ngo("Private NGO", "256 NGO's", R.drawable.private_building));
        ngoList.add(new ngo("Profit NGO", "256 NGO's", R.drawable.profit_));
        ngoList.add(new ngo("Non-profit NGO", "256 NGO's", R.drawable.non_profit));
        setNgoRecycler(ngoList);
        List<topngo> topngoList = new ArrayList<>();
        topngoList.add(new topngo("Place_Holder", "Government NGO", R.drawable.maleicon));
        topngoList.add(new topngo("Place_Holder", "Private NGO", R.drawable.femaleicon));
        topngoList.add(new topngo("Place_Holder", "Profit NGO", R.drawable.male2icon));
        topngoList.add(new topngo("Place_Holder", "Non-profit NGO", R.drawable.female2icon));
        settopngoRecycler(topngoList);


    }
    private void setNgoRecycler(List<ngo>ngoList)
    {
        ngoRecycler=findViewById(R.id.ngoRecycler);
        RecyclerView.LayoutManager layoutManager=new LinearLayoutManager(this,RecyclerView.HORIZONTAL,false);
        ngoRecycler.setLayoutManager(layoutManager);
        ngoadapter= new ngoadapter(this,ngoList);
        ngoRecycler.setAdapter(ngoadapter);
    }
    private void settopngoRecycler(List<topngo>topngoList)
    {
        topngoRecycler=findViewById(R.id.topngoRecycler);
        RecyclerView.LayoutManager layoutManager=new LinearLayoutManager(this,RecyclerView.HORIZONTAL,false);
        topngoRecycler.setLayoutManager(layoutManager);
        topngoadapter= new topngoadapter(this,topngoList);
        topngoRecycler.setAdapter(topngoadapter);
    }
}