package com.example.netscape;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class BusinessFragment extends Fragment {

    RecyclerView.LayoutManager layoutManager;
    RecyclerView businessCards;
    ArrayList<Business> businessArrayList;
    BusinessAdapter businessAdapter;
    View view ;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view=inflater.inflate(R.layout.fragment_business, container, false);

        businessCards=view.findViewById(R.id.businessProfileRecycler);
        businessCards.setHasFixedSize(true);
        layoutManager= new LinearLayoutManager(getContext());
        businessCards.setLayoutManager(layoutManager);

        businessArrayList= new ArrayList<>();

        businessArrayList.add(0, new Business("Rupali Kokate","Nanded","Within 4.2 KM",
                "Student", "4561254863",0 ,"Hi community! I am available at your\nservice!" ));
        businessArrayList.add(new Business("Sanket Wakde","Nanded","Within 10.0 KM",
                "Data Entry Associate", "4561254864",0 ,"Hi community! I am available at your\nservice!" ));

        businessAdapter= new BusinessAdapter(getContext(),businessArrayList);
        businessCards.setAdapter(businessAdapter);

        return view;
    }
}