package com.example.scholappdemo;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;


public class LogoutFragment extends Fragment {


    private Button logout;
    SharedPrefManager sharedPrefManager;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        sharedPrefManager=new SharedPrefManager(getActivity());
        View root = inflater.inflate(R.layout.fragment_logout, container, false);
        logout = root.findViewById(R.id.button_logout);

        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sharedPrefManager.logout();

                Toast.makeText(getActivity(), "You are Logged Out successfully", Toast.LENGTH_SHORT).show();
        Intent intent=new Intent(getActivity(),LoginDemoActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK|Intent.FLAG_ACTIVITY_CLEAR_TASK);
        startActivity(intent);

            }
        });


        return root;
    }

//    @Override
//    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
//        switch (item.getItemId()){
//            case R.id.nav_logout:
//                logoutUser();
//                break;
//        }
//        return super.onOptionsItemSelected(item);
//    }
//
//    private void logoutUser() {
//        sharedPrefManager.logout();
//
//        Intent intent=new Intent(getActivity(),LoginDemoActivity.class);
//        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK|Intent.FLAG_ACTIVITY_CLEAR_TASK);
//        startActivity(intent);
//
//    }

}