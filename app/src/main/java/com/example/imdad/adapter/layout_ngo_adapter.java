package com.example.imdad.adapter;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.imdad.R;
import com.example.imdad.model.layout_ngo;

import java.util.List;

public class layout_ngo_adapter extends RecyclerView.Adapter<layout_ngo_adapter.ngoViewHolder> {
    Context context;
    List<layout_ngo> ngo_view_list;
    int pos;

    public layout_ngo_adapter(Context context, List<layout_ngo> ngo_view_list) {
        this.context = context;
        this.ngo_view_list = ngo_view_list;
    }

    @NonNull
    @Override
    public ngoViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.layout_ngos_view,parent,false);
        return new ngoViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ngoViewHolder holder, int position) {
     holder.image_ngo_view.setImageResource(ngo_view_list.get(position).getImageurl());
     holder.ngo_name.setText(ngo_view_list.get(position).getName());
        holder.ngo_contact.setText(ngo_view_list.get(position).getContact());
        holder.ngo_address.setText(ngo_view_list.get(position).getAddress());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String mobileNo=ngo_view_list.get(holder.getAdapterPosition()).getContact();
                String call="tel:"+mobileNo.trim();
                Intent intent=new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse(call));
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return ngo_view_list.size();
    }

    public static final class ngoViewHolder extends RecyclerView.ViewHolder{
        ImageView image_ngo_view;
        TextView ngo_name,ngo_contact,ngo_address;
        public ngoViewHolder(@NonNull View itemView) {
            super(itemView);
            image_ngo_view=itemView.findViewById(R.id.image_ngo_view);
            ngo_name=itemView.findViewById(R.id.ngo_name);
            ngo_contact=itemView.findViewById(R.id.ngo_contact);
            ngo_address=itemView.findViewById(R.id.ngo_address);
        }
    }
}
