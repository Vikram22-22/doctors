package com.example.vikram.my;

import android.content.Intent;
import android.net.Uri;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class Ear_doctors extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ear_doctors);
    CardView cardView;
        cardView= (CardView) findViewById(R.id.ear_deepanshu);

        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Ear_doctors.this,Ear_deepanshu_singhal.class));
            }
        });

    }

    public void share1(View view)
    {

      /*  Intent intent=null,chooser=null;
        intent=new Intent(Intent.ACTION_ATTACH_DATA);
        intent.setData(Uri.parse("mailto:"));
        String[] data={"Dr. Manav Setiya is a Vitreoretina Specialist, Cataract and Refractive Surgeon and Ophthalmologist/ Eye Surgeon in Gwalior City, Gwalior and has an  experience" };
        intent.putExtra(Intent.ACTION_ATTACH_DATA,data);
     */
Intent chooser=null;
        Intent whatsappIntent = new Intent(Intent.ACTION_SEND);
        whatsappIntent.setType("text/plain");
      //  whatsappIntent.setPackage("com.whatsapp");
        whatsappIntent.putExtra(Intent.EXTRA_TEXT, "Dr. Manav Setiya is a Vitreoretina Specialist, Cataract and Refractive Surgeon and Ophthalmologist/ Eye Surgeon in Gwalior City, Gwalior and has an  experience");
       chooser=Intent.createChooser(whatsappIntent,"share it");
        startActivity(chooser);

        }



    }




