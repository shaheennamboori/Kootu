package com.dscvast.kootu;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class FamilyActivity extends AppCompatActivity implements View.OnClickListener {
    private final int[] resID = {R.raw.sond};
    TextView achan, amma, chetan, chechi, aniyan;
    private MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_family);
        mp = new MediaPlayer();
        achan = findViewById(R.id.achan);
        amma = findViewById(R.id.amma);
        chetan = findViewById(R.id.chettan);
        chechi = findViewById(R.id.chechi);
        aniyan = findViewById(R.id.aniyan);
        achan.setOnClickListener(this);
        amma.setOnClickListener(this);
        chetan.setOnClickListener(this);
        aniyan.setOnClickListener(this);
        chechi.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.achan:
                playSong(0);
                break;
            case R.id.amma:
                playSong(0);
                break;
            case R.id.chettan:
                playSong(0);
                break;
            case R.id.chechi:
                playSong(0);
                break;
            case R.id.aniyan:
                playSong(0);
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
