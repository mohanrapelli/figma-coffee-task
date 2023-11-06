package com.example.coffeeshop.adapter;


import android.content.Context;
import android.view.ContentInfo;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.coffeeshop.R;
import com.example.coffeeshop.model.coffeemodel;
import com.google.android.material.imageview.ShapeableImageView;

import java.util.List;

public class mycustomadapter extends RecyclerView.Adapter<mycustomadapter.coffeeviewholder> {
    List<coffeemodel> coffeemodelList ;
    Context context;


    public mycustomadapter(List<coffeemodel> coffeemodelList) {
        this.coffeemodelList = coffeemodelList;
        this.context = context;

    }





    @NonNull
    @Override
    public mycustomadapter.coffeeviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout,parent,false);
        return new coffeeviewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull mycustomadapter.coffeeviewholder holder, int position) {
        coffeemodel coffeemodel=coffeemodelList.get(position);
        holder.coffename.setText(coffeemodel.getCoffename());
        holder.coffeesize.setText(String.valueOf(coffeemodel.getCoffeesize()));
        holder.coffeeimage.setImageResource(coffeemodel.getCoffeeimage());
        holder.coffeeprice.setText(String.valueOf(coffeemodel.getCoffeprice()));

    }

    @Override
    public int getItemCount() {
        return coffeemodelList.size();
    }
    public static class coffeeviewholder extends RecyclerView.ViewHolder{
        TextView coffename,coffeeprice,coffeesize;
        ShapeableImageView coffeeimage;

        public coffeeviewholder(@NonNull View itemView) {
            super(itemView);
            coffename=itemView.findViewById(R.id.name);
            coffeeprice=itemView.findViewById(R.id.price);
            coffeeimage=itemView.findViewById(R.id.image);
            coffeesize=itemView.findViewById(R.id.size);

        }
    }
}

