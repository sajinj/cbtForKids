package com.example.cbtforkids;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class KhataActivity extends AppCompatActivity {
    TextView tv;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_khata);

        tv = (TextView) findViewById(R.id.khata_tv);
        btn = (Button) findViewById(R.id.next_btn);

        tv.setMovementMethod(new ScrollingMovementMethod());


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), Khata2Activity.class);
                startActivity(i);

            }
        });
    }
}
