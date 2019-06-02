package com.dscvast.kootu;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    TextView idli, dosa, upma, putt, rice, chappathi;
    private final int[] resID = {R.raw.sond};
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
                playSong(0);
                break;
            case R.id.upma:
                playSong(0);
                break;
            case R.id.putt:
                Toast.makeText(getApplicationContext(), "putt", Toast.LENGTH_SHORT).show();
                break;
            case R.id.rice:
                Toast.makeText(getApplicationContext(), "rice", Toast.LENGTH_SHORT).show();
                break;
            case R.id.chappathi:
                Toast.makeText(getApplicationContext(), "chappathi", Toast.LENGTH_SHORT).show();
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
