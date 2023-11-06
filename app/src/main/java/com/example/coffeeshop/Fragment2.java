package com.example.coffeeshop;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.coffeeshop.adapter.mycustomadapter;
import com.example.coffeeshop.adapter.mycustomadapter2;
import com.example.coffeeshop.model.coffeemodel;
import com.example.coffeeshop.model.teamodel;

import java.util.ArrayList;
import java.util.List;


public class Fragment2 extends Fragment {

    private RecyclerView recyclerView2;
    private View v1;
    private mycustomadapter2 mycustomadapter2;

    private List<teamodel> teamodelList;
    private GridLayoutManager gridLayoutManager;

    public Fragment2() {

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        v1 = inflater.inflate(R.layout.fragment_2, container, false);

        recyclerView2 = v1.findViewById(R.id.recycleview2);

        teamodelList=new ArrayList<>();
        mycustomadapter2 = new mycustomadapter2(teamodelList);
        gridLayoutManager = new GridLayoutManager(getActivity(), 2);
        recyclerView2.setLayoutManager(gridLayoutManager);
        recyclerView2.setAdapter(mycustomadapter2);
        IntializeDataintoRecycleview();
        return v1;
    }

    private void IntializeDataintoRecycleview() {


        teamodel t1 = new teamodel("Cinnamon&", "Cocoa", R.drawable.coffee3, 99);
        teamodel t2 = new teamodel("Drizzled with", "Carmel", R.drawable.coffee1, 199);
        teamodel t3 = new teamodel("Dalgona", "wipped matcha", R.drawable.coffee5, 249);
        teamodel t4 = new teamodel("Bursting ", "Blueberry", R.drawable.tea, 299);
        teamodel t5 = new teamodel("Cinnamon&", "Cocoa", R.drawable.coffee1, 199);
        teamodel t6 = new teamodel("Cinnamon&", "Cocoa", R.drawable.coffee5, 99);
        teamodel t7 = new teamodel("Cinnamon&", "Cocoa", R.drawable.coffee3, 99);
        teamodel t8 = new teamodel("Cinnamon&", "Cocoa", R.drawable.tea, 299);
        teamodelList.add(t1);
        teamodelList.add(t2);
        teamodelList.add(t3);
        teamodelList.add(t4);
        teamodelList.add(t5);
        teamodelList.add(t6);
        teamodelList.add(t7);
        teamodelList.add(t8);
        mycustomadapter2.notifyDataSetChanged();

    }
}

