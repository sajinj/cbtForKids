package com.example.cbtforkids;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.MediaController;
import android.widget.VideoView;

import androidx.appcompat.app.AppCompatActivity;

public class VideoActivity extends AppCompatActivity {
    int vidId;
    VideoView videoView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video);


        videoView =(VideoView)findViewById(R.id.videoView);

        Bundle extras = getIntent().getExtras();
        if (extras == null) {
            return;
        }
        String value = extras.getString("videoName");
        if (value != null) {
            if(value.equals("Ab"))
                vidId = R.raw.ab_movie;
            if(value.equals("Gol"))
                vidId = R.raw.gol_movie;
            if(value.equals("Hava"))
                vidId = R.raw.hava_movie;
            if(value.equals("Kuh"))
                vidId = R.raw.kuh_movie;
            if(value.equals("Arus1"))
                vidId = R.raw.arusak1;
            if(value.equals("Arus2"))
                vidId = R.raw.arusak2;
            if(value.equals("Arus3"))
                vidId = R.raw.arusak3;
            if(value.equals("Arus4"))
                vidId = R.raw.arusak4;
            if(value.equals("babr"))
                vidId = R.raw.babr;


        }

        playVideo();

    }

    private void playVideo(){
//
        //Set MediaController  to enable play, pause, forward, etc options.
        MediaController mediaController= new MediaController(this);
        mediaController.setAnchorView(videoView);
        //Location of Media File
        Uri uriAb = Uri.parse("android.resource://" + getPackageName() + "/" + vidId);

        //Starting VideView By Setting MediaController and URI
        videoView.setMediaController(mediaController);
        videoView.setVideoURI(uriAb);

        videoView.requestFocus();
        videoView.start();
    }
}