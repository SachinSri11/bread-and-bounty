package com.example.imdad.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.imdad.R;
import com.example.imdad.model.ngo;
import com.example.imdad.ngosview;

import java.util.List;

public class ngoadapter extends RecyclerView.Adapter<ngoadapter.ngoviewHolder> {
    Context context;
    List<ngo> ngoList;

    public ngoadapter(Context context, List<ngo> ngoList) {
        this.context = context;
        this.ngoList = ngoList;
    }

    @NonNull
    @Override
    public ngoviewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.ngo,parent,false);
        return new ngoviewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ngoviewHolder holder, int position) {
 holder.ngoimage.setImageResource(ngoList.get(position).getImageurl());
 holder.name.setText(ngoList.get(position).getName());
 holder.no.setText(ngoList.get(position).getNo());
 holder.itemView.setOnClickListener(new View.OnClickListener() {
     @Override
     public void onClick(View v) {
         Intent intent=new Intent(context, ngosview.class);
         context.startActivity(intent);
     }
 });
    }

    @Override
    public int getItemCount() {
        return ngoList.size();
    }

    public static final class ngoviewHolder extends RecyclerView.ViewHolder{
       ImageView ngoimage;
       TextView name,no;
        public ngoviewHolder(@NonNull View itemView) {
            super(itemView);
            ngoimage=itemView.findViewById(R.id.ngoimage);
            name=itemView.findViewById(R.id.ngoname);
            no=itemView.findViewById(R.id.ngono);
        }
    }
}
