package com.example.scholappdemo.ui.home;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.example.scholappdemo.PostMatricActivity;
import com.example.scholappdemo.R;

public class HomeFragment extends Fragment {

    private TextView ug,pg,phd,girls,study;

    private HomeViewModel homeViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        homeViewModel = new ViewModelProvider(this).get(HomeViewModel.class);
        View root = inflater.inflate(R.layout.fragment_home, container, false);

         ug = root.findViewById(R.id.home_ug);
         pg = root.findViewById(R.id.home_pg);
         phd = root.findViewById(R.id.home_phd);
         girls = root.findViewById(R.id.home_girls);
         study = root.findViewById(R.id.home_study_abroad);

        ug.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(), PostMatricActivity.class);
                startActivity(intent);
            }
        });



        //ViewGroup rootView=(ViewGroup)inflater
                //.inflate(R.layout.fragment_home,container,false);

        return root;
    }
}