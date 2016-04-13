package com.example.vikram.my;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;


/**
 * Created by vikram on 14/3/16. */
public class Fragment_private extends Fragment
{

  View v;
  CardView eye,ear,heart;

    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
     View v= inflater.inflate(R.layout.fragment_private, container, false);
    eye= (CardView) v.findViewById(R.id.view);
        ear= (CardView) v.findViewById(R.id.view2);
        heart= (CardView) v.findViewById(R.id.view3);

        eye.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(),Main2Activity.class));
            }
        });


       ear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(),Ear_doctors
                        .class));
            }
        });

       heart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(),Private_heart
                        .class));
            }
        });

        return  v;



    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {

        super.onActivityCreated(savedInstanceState);


}



}
