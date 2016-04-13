package com.example.vikram.my;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Ear_deepanshu_singhal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ear_deepanshu_singhal);

    }

  public void eardeepanshusinghal( View view)
  {
      startActivity(new Intent(Ear_deepanshu_singhal.this,Appointment_booked.class));
  }

}
