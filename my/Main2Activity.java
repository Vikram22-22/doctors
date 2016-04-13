package com.example.vikram.my;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;

import static android.app.PendingIntent.getActivity;

public class Main2Activity extends AppCompatActivity  implements AdapterView.OnItemClickListener{
    ListView listview;

    String[] doctor = {"Dr. Manav Setiya", "Dr. Praveen Kumar Jain", "Dr. H. K. Bandil", "Dr. Pradeep Singh Rathore","DR. Vikram"};
    String[] rating = {"13 Years Exp.", "29 Years Exp.", " 41 Years Exp.", "11 Years Exp","5 Years Exp." };
    //  String [] images={("R.mipmap.tiger"),"R.mipmap.rose","R.mipmap.beauti","R.mipmap.tiger","R.mipmap.rose","R.mipmap.beauti","R.mipmap.tiger","R.mipmap.rose","R.mipmap.beauti","R.mipmap.tiger","R.mipmap.rose","R.mipmap.beauti"};
    int[] images = {R.drawable.manav_setiya, R.drawable.praveen_kumar, R.drawable.hk_bandil, R.drawable.pradeepsir,R.drawable.ic_menu_gallery};
    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        listview = (ListView) findViewById(R.id.listView);
        //  ArrayAdapter arrayAdapter= new ArrayAdapter(this,R.layout.single_row,doctor);
        //listview.setAdapter(arrayAdapter);
        adapter2 arrayAdapter = new adapter2(this, doctor, images, rating);
        listview.setAdapter(arrayAdapter);

listview.setOnItemClickListener( Main2Activity.this);

     getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client = new GoogleApiClient.Builder(this).addApi(AppIndex.API).build();
    }


    @Override
    public void onStart() {
        super.onStart();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client.connect();
        Action viewAction = Action.newAction(
                Action.TYPE_VIEW, // TODO: choose an action type.
                "Main2 Page", // TODO: Define a title for the content shown.
                // TODO: If you have web page content that matches this app activity's content,
                // make sure this auto-generated web page URL is correct.
                // Otherwise, set the URL to null.
                Uri.parse("http://host/path"),
                // TODO: Make sure this auto-generated app deep link URI is correct.
                Uri.parse("android-app://com.example.vikram.my/http/host/path")
        );
        AppIndex.AppIndexApi.start(client, viewAction);
    }

    @Override
    public void onStop() {
        super.onStop();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        Action viewAction = Action.newAction(
                Action.TYPE_VIEW, // TODO: choose an action type.
                "Main2 Page", // TODO: Define a title for the content shown.
                // TODO: If you have web page content that matches this app activity's content,
                // make sure this auto-generated web page URL is correct.
                // Otherwise, set the URL to null.
                Uri.parse("http://host/path"),
                // TODO: Make sure this auto-generated app deep link URI is correct.
                Uri.parse("android-app://com.example.vikram.my/http/host/path")
        );
        AppIndex.AppIndexApi.end(client, viewAction);
        client.disconnect();
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        if(position==0) {
            startActivity(new Intent(Main2Activity.this, Activity_Eye_Manav.class));
        }
        if(position==1)
        {
            startActivity(new Intent(Main2Activity.this, Activity_Eye_praveen_kumar.class));
        }

        if(position==2)
        {
            startActivity(new Intent(Main2Activity.this, Activity_hk_bandil.class));
        }
        if(position==3)
        {
            startActivity(new Intent(Main2Activity.this, Activity_eye_pradeep_rathore.class));
        }

    }

}

class adapter2 extends ArrayAdapter<String>
{
    int[] img_adap;
    String[] txt1_adap;
    String[] txt2_adap;
    Context c;
    public adapter2(Context context, String[] docto,int[] imagpara,String[] txt1para)
    {

        super(context, R.layout.single_row2t, R.id.textView, docto);
        this.c=context;
        this.img_adap=imagpara;
        this.txt1_adap=txt1para;
        this.txt2_adap=docto;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent)
    {
        LayoutInflater inflater= (LayoutInflater) c.getSystemService(c.LAYOUT_INFLATER_SERVICE);
        View row=  inflater.inflate(R.layout.single_row2t, parent, false);
        ImageView img= (ImageView) row.findViewById(R.id.imageView);
        TextView txtview1= (TextView) row.findViewById(R.id.textView);
        TextView txtview2= (TextView) row.findViewById(R.id.textView2);
        img.setImageResource((img_adap[position]));
        txtview1.setText(txt2_adap[position]);
        txtview2.setText(txt1_adap[position]);
        return row;
        // return super.getView(position, convertView, parent);
    }
}