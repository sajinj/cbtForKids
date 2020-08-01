package com.example.cbtforkids;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class Khata2Activity extends AppCompatActivity {

    String vName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_khata2);


    }
    public void khVideoClick(View v){
        if (v.getId() == R.id.video_arus1)
            vName = "Arus1";
        else if(v.getId() == R.id.video_arus2)
            vName = "Arus2";
        else if(v.getId() == R.id.video_arus3)
            vName = "Arus3";
        else if(v.getId() == R.id.video_arus4)
            vName = "Arus4";

        Intent i = new Intent(this, VideoActivity.class);
        i.putExtra("videoName", vName);
        startActivity(i);



    }
}
