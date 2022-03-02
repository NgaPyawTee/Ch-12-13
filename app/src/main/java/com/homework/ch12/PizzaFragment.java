package com.homework.ch12;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class PizzaFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        RecyclerView recyclerView = (RecyclerView) inflater.inflate(R.layout.fragment_recycler_view,container,false);

        String[] pizzaNames = new String[Pizza.pizzas.length];
        for(int i=0; i< pizzaNames.length; i++){
            pizzaNames[i] = Pizza.pizzas[i].getName();
        }

        int[] pizzaImages = new int[Pizza.pizzas.length];
        for(int j=0; j< pizzaImages.length; j++){
            pizzaImages[j] = Pizza.pizzas[j].getImageID();
        }

        CaptionedImagesAdapter adapter = new CaptionedImagesAdapter(pizzaNames,pizzaImages);
        recyclerView.setAdapter(adapter);

        GridLayoutManager gridLayoutManager = new GridLayoutManager(getActivity(),2);
        recyclerView.setLayoutManager(gridLayoutManager);

        return recyclerView;
    }
}