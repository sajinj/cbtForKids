package com.example.cbtforkids;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.MediaController;
import android.widget.VideoView;

import androidx.appcompat.app.AppCompatActivity;

public class Zehn2Activity extends AppCompatActivity {

    String vName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zehn2);


    }
    public void videoClick(View v){
        if (v.getId() == R.id.videoAb)
            vName = "Ab";
        else if(v.getId() == R.id.videoGol)
            vName = "Gol";
        else if(v.getId() == R.id.videoHava)
            vName = "Hava";
        else if(v.getId() == R.id.videoKuh)
            vName = "Kuh";

        Intent i = new Intent(this, VideoActivity.class);
        i.putExtra("videoName", vName);
        startActivity(i);



    }
}
