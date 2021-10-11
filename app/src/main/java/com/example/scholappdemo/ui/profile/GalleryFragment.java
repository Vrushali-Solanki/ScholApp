package com.example.scholappdemo.ui.profile;

import android.app.AlertDialog;
import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.example.scholappdemo.ChangePassActivity;
import com.example.scholappdemo.DatabaseConnectivity;
import com.example.scholappdemo.ProfileUpdateActivity;
import com.example.scholappdemo.R;
import com.example.scholappdemo.ui.home.HomeFragment;

public class GalleryFragment extends Fragment {

    private TextView update,pname,ppass,pemail;
    private DatabaseConnectivity g;
    private ImageView arrowfrag;



    private GalleryViewModel galleryViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        galleryViewModel =
                new ViewModelProvider(this).get(GalleryViewModel.class);
        View root = inflater.inflate(R.layout.fragment_profile, container, false);

        update = root.findViewById(R.id.profile_update);

        g = new DatabaseConnectivity(getActivity());
        //g.getReadableDatabase();








//        root.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//                String uname=pname.toString().trim();
//                String upass=ppass.toString().trim();
//                String uemail=pemail.toString().trim();
//
//                Cursor t=g.getinfo(uname,uemail,upass);
//                if(t.getCount()==0)
//                {
//                    Toast.makeText(getActivity(),"No data found",Toast.LENGTH_SHORT).show();
//                }
//
//                StringBuffer buffer=new StringBuffer();
//                while (t.moveToNext())
//                {
//                    buffer.append("name:" +t.getString(1)+"\n");
//                    buffer.append("email:" +t.getString(3)+"\n");
//                    buffer.append("password:" +t.getString(2)+"\n\n\n\n");
//                }
//
//                AlertDialog.Builder builder=new AlertDialog.Builder(getActivity());
//                builder.setCancelable(true);
//                builder.setTitle("SignUp User Data");
//                builder.setMessage(buffer.toString());
//                builder.show();
//            }
//        });

        update.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(), ProfileUpdateActivity.class);
                startActivity(intent);
            }
        });




        return root;
    }
}