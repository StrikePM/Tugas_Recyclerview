package com.example.a2018034_recyclerview.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.example.a2018034_recyclerview.R;
import com.example.a2018034_recyclerview.model.Champ;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class RecyclerviewAdapter extends RecyclerView.Adapter<RecyclerviewAdapter.MyViewHolder> {
    List<Champ> champList;
    OnItemClickCallback onItemClickCallback;

    public RecyclerviewAdapter(List<Champ> champList) {
        this.champList = champList;
    }

    public void setOnItemClickCallback(OnItemClickCallback onItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback;
    }

    @NonNull
    @Override
    public RecyclerviewAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View foodView = layoutInflater.inflate(R.layout.item_champ,parent,false);
        MyViewHolder viewHolder = new MyViewHolder(foodView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerviewAdapter.MyViewHolder holder, int position) {
        Champ champ = champList.get(position);
        holder.champName.setText(champ.getName());
        holder.champRole.setText(champ.getRole());
        Glide.with(holder.itemView.getContext())
                .load(champ.getLogo())
                .apply(new RequestOptions().override(80,80))
                .into(holder.champPhoto);
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onItemClickCallback.onItemClicked(champList.get(holder.getAdapterPosition()));
            }
        });
    }

    @Override
    public int getItemCount() {
        return (champList != null) ? champList.size() : 0;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView champName, champRole, champDiff;
        public ImageView champPhoto;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            champName = itemView.findViewById(R.id.txtName);
            champRole = itemView.findViewById(R.id.txtRole);
            champDiff = itemView.findViewById(R.id.txtDiff);
            champPhoto = itemView.findViewById(R.id.image_logo);
        }
    }

    public interface OnItemClickCallback{
        void onItemClicked(Champ data);
    }
}
