package com.example.cbtforkids;

import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class TozihActivity extends AppCompatActivity {

    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tozih);
        tv = (TextView) findViewById(R.id.tozih_tv);

        tv.setMovementMethod(new ScrollingMovementMethod());
    }
}
