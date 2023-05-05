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
import com.example.imdad.model.topngo;
import com.example.imdad.person_layout;

import java.util.List;

public class topngoadapter extends RecyclerView.Adapter<topngoadapter.topviewHolder> {
    Context context;
    List<topngo>topngoList;

    public topngoadapter(Context context, List<topngo> topngoList) {
        this.context = context;
        this.topngoList = topngoList;
    }

    @NonNull
    @Override
    public topviewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.topngo,parent,false);
        return new topviewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull topviewHolder holder, int position) {
        holder.topngoimage.setImageResource(topngoList.get(position).getImageurl());
        holder.topngoname.setText(topngoList.get(position).getName());
        holder.typeofngo.setText(topngoList.get(position).getNgotype());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(context, person_layout.class);
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return topngoList.size();
    }

    public static final class topviewHolder extends RecyclerView.ViewHolder
    {
        ImageView topngoimage;
        TextView topngoname,typeofngo;
        public topviewHolder(@NonNull View itemView) {
            super(itemView);
            topngoimage=itemView.findViewById(R.id.topngoimage);
            topngoname=itemView.findViewById(R.id.topngoname);
            typeofngo=itemView.findViewById(R.id.typeofngo);
        }
    }
}
