package com.dscvast.kootu;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    TextView idli, dosa, upma, putt, rice, chappathi;
    private final int[] resID = {R.raw.idli, R.raw.dosa, R.raw.upma, R.raw.puttu, R.raw.choru, R.raw.chapathi};
    private MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mp = new MediaPlayer();
        idli = findViewById(R.id.idli);
        idli.setOnClickListener(this);
        dosa = findViewById(R.id.dosa);
        dosa.setOnClickListener(this);
        upma = findViewById(R.id.upma);
        upma.setOnClickListener(this);
        putt = findViewById(R.id.putt);
        putt.setOnClickListener(this);
        rice = findViewById(R.id.rice);
        rice.setOnClickListener(this);
        chappathi = findViewById(R.id.chappathi);
        chappathi.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.idli:
                playSong(0);
                break;
            case R.id.dosa:
                playSong(1);
                break;
            case R.id.upma:
                playSong(2);
                break;
            case R.id.putt:
                playSong(3);
                break;
            case R.id.rice:
                playSong(4);
                break;
            case R.id.chappathi:
                playSong(5);
        }
    }

    public void playSong(int songIndex) {
// Play song
        mp.reset();// stops any current playing song
        mp = MediaPlayer.create(getApplicationContext(), resID[songIndex]);// create's
// new
// mediaplayer
// with
// song.

        mp.start(); // starting mediaplayer

    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        mp.release();
    }

}
