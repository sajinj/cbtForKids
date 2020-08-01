package com.example.cbtforkids;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void tozihClick(View view){
        Intent i = new Intent(this, TozihActivity.class);
        startActivity(i);
    }
    public void zehnClick(View view){
        Intent i = new Intent(this, ZehnActivity.class);
        startActivity(i);
    }
    public void khataClick(View view){
        Intent i = new Intent(this, KhataActivity.class);
        startActivity(i);
    }
    public void slahClick(View view){
        Intent i = new Intent(this, SlahActivity.class);
        startActivity(i);
    }

    public void exitClick(View view){
        finish();
    }

}
