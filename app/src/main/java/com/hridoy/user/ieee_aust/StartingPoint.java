package com.hridoy.user.ieee_aust;

import android.app.Activity;
import android.app.ActivityOptions;
import android.content.Intent;
import android.graphics.Typeface;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.transition.Explode;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;

public class StartingPoint extends Activity {

    MediaPlayer creed;
    Button start,stop,newActivity;
    TextView textView;
    Typeface typeface;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().requestFeature(Window.FEATURE_ACTIVITY_TRANSITIONS);
        setContentView(R.layout.activity_starting_point);
        initialize();
        //playSong();
        textView.setTypeface(typeface);
        //textView.setTextSize(10);
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
        newActivity=(Button)findViewById(R.id.bNextIntent);
        newActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onSomeButtonClicked();
            }
        });
        textView=(TextView)findViewById(R.id.tvTitleSP);
        typeface=Typeface.createFromAsset(getAssets(),"fonts/garamond.ttf");
    }

    private void onSomeButtonClicked() {

        getWindow().setExitTransition(new Explode());
        Intent intent = new Intent(this, MyOtherActivity.class);
        startActivity(intent,
                ActivityOptions
                        .makeSceneTransitionAnimation(this).toBundle());

    }

    private void playSong() {
        creed= MediaPlayer.create(StartingPoint.this,R.raw.one_last_breath);
        creed.start();
    }
    /*
    @Override
    protected void onPause() {
        super.onPause();
        creed.release();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        creed.release();
    }
    */

}
