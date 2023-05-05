package com.example.imdad;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.imdad.adapter.layout_ngo_adapter;
import com.example.imdad.model.layout_ngo;

import java.util.ArrayList;
import java.util.List;

public class
ngosview extends AppCompatActivity {
    RecyclerView ngoViewRecycler;
    layout_ngo_adapter layout_ngo_adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ngosview);
        List<layout_ngo>ngoViewlist=new ArrayList<>();
        ngoViewlist.add(new layout_ngo("Ngo_1","+91 61279 65834","712,4th B Cross,7th Main, Kalyan Nagar, Delhi",R.drawable.maleicon));
        ngoViewlist.add(new layout_ngo("Ngo_2","+91 79313 60104","22, New Market,New Delhi",R.drawable.male2icon));
        ngoViewlist.add(new layout_ngo("Ngo_3","+91 61279 29935","13/78,Delhi",R.drawable.female2icon));
        ngoViewlist.add(new layout_ngo("Ngo_4","+91 75979 80186"," 28, Malviya Nagar, Delhi",R.drawable.femaleicon));
        ngoViewlist.add(new layout_ngo("Ngo_5","+91 74891 50530","A 110 Sector 5, Distt G B Nagar, New Delhi",R.drawable.male2icon));
        ngoViewlist.add(new layout_ngo("Ngo_6","+91 61279 01715","A/128, Nit, Dabua Colony, New Delhi",R.drawable.maleicon));
        ngoViewlist.add(new layout_ngo("Ngo_7","+91 61279 63464","1463/105, Ganesh Pura, Tri Nagar, New Delhi",R.drawable.female2icon));
        ngoViewlist.add(new layout_ngo("Ngo_8","+91 61279 93067","27 1st Floor, Main Market, New Delhi",R.drawable.femaleicon));
        setngoViewRecycler(ngoViewlist);
    }
    private void setngoViewRecycler(List<layout_ngo> ngoViewlist)
    {
        ngoViewRecycler=findViewById(R.id.ngoViewRecycler);
        RecyclerView.LayoutManager layoutManager=new LinearLayoutManager(this,RecyclerView.VERTICAL,false);
        ngoViewRecycler.setLayoutManager(layoutManager);
        layout_ngo_adapter=new layout_ngo_adapter(this,ngoViewlist);
        ngoViewRecycler.setAdapter(layout_ngo_adapter);
    }
}