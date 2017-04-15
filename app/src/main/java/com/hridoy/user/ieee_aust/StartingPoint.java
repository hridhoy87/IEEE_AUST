package com.hridoy.user.ieee_aust;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class StartingPoint extends AppCompatActivity {

    MediaPlayer creed;
    Button start,stop;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_starting_point);
        initialize();
        //playSong();
    }

    private void initialize() {
        start=(Button)findViewById(R.id.bStartSong);
        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playSong();
            }
        });
        stop=(Button)findViewById(R.id.bStopSong);
        stop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                creed.release();
            }
        });
    }

    private void playSong() {
        creed= MediaPlayer.create(StartingPoint.this,R.raw.one_last_breath);
        creed.start();
    }
    /*
    @Override
    protected void onPause() {
        super.onPause();
        creed.pause();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        creed.release();
    }
    */
}
