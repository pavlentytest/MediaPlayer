package com.example.myapplication;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void doPlay(View v) {
        switch(v.getId()) {
            case R.id.button:
                if(mp == null) {
                    mp = MediaPlayer.create(this,R.raw.betkhoven);
                    mp.start();
                } else {
                    if (mp.isPlaying()) {
                        mp.pause();
                    } else {
                        mp.start();
                        
                    }
                }
                break;
            case R.id.button2:
                mp.stop();
                //mp.release();
                mp = null;
                break;
        }
    }
}
