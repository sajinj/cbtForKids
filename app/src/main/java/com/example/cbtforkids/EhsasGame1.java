package com.example.cbtforkids;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class EhsasGame1 extends AppCompatActivity {
    TextView tv;
    Button startBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ehsas_game1);

        startBtn = (Button) findViewById(R.id.btn_start);
        tv = (TextView) findViewById(R.id.ehsasgame_tv);

        tv.setMovementMethod(new ScrollingMovementMethod());

        startBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), EhsasGame2.class);
                startActivity(i);
                finish();
            }
        });
    }
}
