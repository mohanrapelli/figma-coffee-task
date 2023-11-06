package com.example.coffeeshop.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.coffeeshop.R;
import com.example.coffeeshop.model.coffeemodel;
import com.example.coffeeshop.model.teamodel;

import java.util.List;

public class mycustomadapter2 extends RecyclerView.Adapter<mycustomadapter2.teaviewholder> {
    List<teamodel> teamodelList;
    Context context;

    public mycustomadapter2(List<teamodel> teamodelList) {
        this.teamodelList = teamodelList;
        this.context = context;
    }

    @NonNull
    @Override
    public mycustomadapter2.teaviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout3,parent,false);
        return new teaviewholder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull mycustomadapter2.teaviewholder holder, int position) {
        teamodel teamodel=teamodelList.get(position);
        holder.teaname.setText(teamodel.getTeaname());
        holder.teaprice.setText(String.valueOf(teamodel.getTeaprice()));
        holder.teaimage.setImageResource(teamodel.getTeaimage());
        holder.teename.setText(teamodel.getTeename());



    }

    @Override
    public int getItemCount() {
        return teamodelList.size();
    }
    public static class teaviewholder extends RecyclerView.ViewHolder{
        TextView teaname,teename,teaprice;
        ImageView teaimage;

        public teaviewholder(@NonNull View itemView) {

            super(itemView);
            teaname=itemView.findViewById(R.id.teaname);
            teename=itemView.findViewById(R.id.teename);
            teaprice=itemView.findViewById(R.id.teaprice);
            teaimage=itemView.findViewById(R.id.teaimage);
        }
    }
}
