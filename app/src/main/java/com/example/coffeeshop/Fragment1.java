package com.example.coffeeshop;

import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.coffeeshop.adapter.mycustomadapter;
import com.example.coffeeshop.model.coffeemodel;

import java.util.ArrayList;
import java.util.List;


public class Fragment1 extends Fragment {

   private RecyclerView recyclerView;
    private View v;
   private mycustomadapter mycustomadapter;

    private List<coffeemodel> coffeemodelList;

    public Fragment1() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.fragment_1, container, false);

        recyclerView=v.findViewById(R.id.recycleview);
        coffeemodelList=generateVideoitems();

        mycustomadapter=new mycustomadapter(coffeemodelList);
      recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setAdapter(mycustomadapter);
        return v;


    }

    private List<coffeemodel> generateVideoitems(){

       List<coffeemodel> coffeemodels= new ArrayList<>();

        coffeemodels.add( new coffeemodel("Dalgona Macha", 1, R.drawable.coffee1, 299));
        coffeemodels.add(new coffeemodel("Busting Blurberry", 2, R.drawable.coffee3, 249));
        coffeemodels.add( new coffeemodel("Dalgona Macha", 1, R.drawable.coffee1, 299));
        coffeemodels.add( new coffeemodel("Cinnaman & Cocoa", 1, R.drawable.coffee3, 99));
        coffeemodels.add( new coffeemodel("dalgona Macha", 1, R.drawable.coffee1, 299));
        coffeemodels.add( new coffeemodel("Dalgona Macha", 1, R.drawable.coffee3, 299));

        return coffeemodels;
    }
}




