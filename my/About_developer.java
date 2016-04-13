package com.example.vikram.my;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class About_developer extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_developer);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

              // startActivity(new Intent(About_developer.this,MainActivity.class));
        Intent intent=null,chooser=null;
                intent=new Intent(Intent.ACTION_SEND);
                intent.setData(Uri.parse("mailto:"));
                String[] email={"vikrammahendru@22gamil.com","shu9594@gmail.com","Prashant.Bhopte42@gmail.com"};
                intent.putExtra(Intent.EXTRA_EMAIL,email);
                intent.setType("message/rfc822");
             chooser =Intent.createChooser(intent,"Send Email");
                startActivity(chooser);

            }
        });
    }

}
