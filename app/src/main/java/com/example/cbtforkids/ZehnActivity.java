package com.example.cbtforkids;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ZehnActivity extends AppCompatActivity {
    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zehn);

        tv = (TextView) findViewById(R.id.zehn_tv);

        tv.setMovementMethod(new ScrollingMovementMethod());
    }

    public void nextClick(View v){
        Intent i = new Intent(this, Zehn2Activity.class);
        startActivity(i);
    }
}
