package com.example.cbtforkids;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import java.io.File;

public class EhsasGame2 extends AppCompatActivity {
    ImageView gameImage;
    ImageView gameGozine1;
    ImageView gameGozine2;
    ImageView gameGozine3;
    int qNum;

    boolean buttonOn;

    String[] urls = {"@mipmap/game1_mage5","@mipmap/game1_mage6", "@mipmap/game1_mage7", "@mipmap/game1_mage8",
            "@mipmap/game1_mage9", "@mipmap/game1_mage10", "@mipmap/game1_mage11", "@mipmap/game1_mage12", "@mipmap/game1_mage13"};

    String[] gozine1_urls = {"@mipmap/stiker_khejalat", "@mipmap/stiker_tanafor", "@mipmap/stiker_shadi",
    "@mipmap/stiker_shadi","@mipmap/stiker_khejalat", "@mipmap/stiker_tars", "@mipmap/stiker_negaran",
            "@mipmap/stiker_khashm", "@mipmap/stiker_khejalat"
    };

    String[] gozine2_urls = {"@mipmap/stiker_tajob", "@mipmap/stiker_tars", "@mipmap/stiker_khashm",
            "@mipmap/stiker_tajob","@mipmap/stiker_tanafor", "@mipmap/stiker_hesadat", "@mipmap/stiker_khashm",
            "@mipmap/stiker_khejalat", "@mipmap/stiker_shadi"
    };


    String[] gozine3_urls = {"@mipmap/stiker_gham", "@mipmap/stiker_tajob", "@mipmap/stiker_tars",
            "@mipmap/stiker_khashm","@mipmap/stiker_hesadat", "@mipmap/stiker_shadi", "@mipmap/stiker_tanafor",
            "@mipmap/stiker_gham", "@mipmap/stiker_tajob"
    };

    int[] javab_number = {
            1,1,2,2,3,1,1,3,2

    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ehsas_game2);

        gameImage = (ImageView) findViewById(R.id.game1_image);
        gameGozine1 = (ImageView) findViewById(R.id.game1_gozine1);
        gameGozine2 = (ImageView) findViewById(R.id.game1_gozine2);
        gameGozine3 = (ImageView) findViewById(R.id.game1_gozine3);

        qNum = 0;
        buttonOn = true;

        showImage();


    }

    private void showImage() {
        if(qNum > 8){
            finish();
            return;
        }
        qNum++;

        int imageResource = getResources().getIdentifier(urls[qNum -1], null, getPackageName());
        int imageResGoz1 = getResources().getIdentifier(gozine1_urls[qNum -1], null, getPackageName());
        int imageResGoz2 = getResources().getIdentifier(gozine2_urls[qNum -1], null, getPackageName());
        int imageResGoz3 = getResources().getIdentifier(gozine3_urls[qNum -1], null, getPackageName());

        Drawable res = getResources().getDrawable(imageResource);
        Drawable resGoz1 = getResources().getDrawable(imageResGoz1);
        Drawable resGoz2 = getResources().getDrawable(imageResGoz2);
        Drawable resGoz3 = getResources().getDrawable(imageResGoz3);

        gameImage.setImageDrawable(res);
        gameGozine1.setImageDrawable(resGoz1);
        gameGozine2.setImageDrawable(resGoz2);
        gameGozine3.setImageDrawable(resGoz3);


    }

    private void checkJavab(View v){
        if(v.getId() == javabMap(javab_number[qNum-1]))
        {
            audioPlayer(1);
            final Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    // Do something after 5s = 5000ms
                    showImage();
                    buttonOn = true;

                }
            }, 2000);
        }
        else{
            audioPlayer(0);
            final Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    // Do something after 5s = 5000ms
                    buttonOn = true;

                }
            }, 2000);
            return;
        }

    }

    private int javabMap(int i){
        switch (i){
            case 1:
                return R.id.game1_gozine1;
            case 2:
                return R.id.game1_gozine2;
            case 3:
                return R.id.game1_gozine3;
            default:
                return 0;
             }
    }

    public void gozineClick(View v) {
        if(buttonOn){
            buttonOn = false;
            checkJavab(v);

        }
        else return;
    }

    public void audioPlayer(int i){
        //set up MediaPlayer
        Uri uriAb = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.afarin);

        if(i==1)
            uriAb = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.afarin);
        else if (i==0)
            uriAb = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.tryagain);

        MediaPlayer mp = new MediaPlayer();

        try {
            mp.setDataSource(this, uriAb);
            mp.prepare();
            mp.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
