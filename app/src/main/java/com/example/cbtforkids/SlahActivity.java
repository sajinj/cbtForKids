package com.example.cbtforkids;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class SlahActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_slah);

    }

    public void slahBtnClick(View v) {
        Intent i;

        if (v.getId() == R.id.ehsasGame1) {
            i = new Intent(this, EhsasGame1.class);
            startActivity(i);

        } else if (v.getId() == R.id.ehsasGame2) {
//            i = new Intent(this, VideoActivity.class);
//            startActivity(i);
            Toast.makeText(this, "این بخش هنوز تکمیل نشده :)", Toast.LENGTH_LONG).show();

        } else if (v.getId() == R.id.story) {
//            i = new Intent(this, VideoActivity.class);
//            startActivity(i);
            i = new Intent(this, VideoActivity.class);
            i.putExtra("videoName", "babr");
            startActivity(i);

        } else if (v.getId() == R.id.work_page1) {
//            i = new Intent(this, VideoActivity.class);
//            startActivity(i);
            Toast.makeText(this, "این بخش هنوز تکمیل نشده :)", Toast.LENGTH_LONG).show();

        } else if (v.getId() == R.id.work_page2) {
//            i = new Intent(this, VideoActivity.class);
//            startActivity(i);
            Toast.makeText(this, "این بخش هنوز تکمیل نشده :)", Toast.LENGTH_LONG).show();

        } else if (v.getId() == R.id.jadval) {
//            i = new Intent(this, VideoActivity.class);
//            startActivity(i);
            Toast.makeText(this, "این بخش هنوز تکمیل نشده :)", Toast.LENGTH_LONG).show();


        }


    }
}
