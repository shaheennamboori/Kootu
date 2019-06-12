package com.dscvast.kootu;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import static java.util.Objects.requireNonNull;

public class MainActivity extends AppCompatActivity
        implements View.OnClickListener {

    private final int[] resID = { R.raw.idli, R.raw.dosa, R.raw.upma, R.raw.puttu, R.raw.choru, R.raw.chapathi };
    private MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);
        mp = new MediaPlayer();

        TextView idli = findViewById(R.id.idli);
        TextView dosa = findViewById(R.id.dosa);
        TextView upma = findViewById(R.id.upma);
        TextView putt = findViewById(R.id.putt);
        TextView rice = findViewById(R.id.rice);
        TextView chappathi = findViewById(R.id.chappathi);

        idli.setOnClickListener(this);
        dosa.setOnClickListener(this);
        upma.setOnClickListener(this);
        putt.setOnClickListener(this);
        rice.setOnClickListener(this);
        chappathi.setOnClickListener(this);
    }

    @Override
    public boolean onSupportNavigateUp() {
        finish();
        return super.onSupportNavigateUp();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.settings:
                Intent intent1 = new Intent(getApplicationContext(), SettingsActivity.class);
                startActivity(intent1);
                break;
            case R.id.about:
                Intent intent2 = new Intent(getApplicationContext(), AboutActivity.class);
                startActivity(intent2);
                break;
        }
        return super.onOptionsItemSelected(item);
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

    private void playSong(int songIndex) {
        mp.reset(); //stop current song
        mp = MediaPlayer.create(getApplicationContext(), resID[songIndex]); // instantiate media player with new song
        mp.start(); // start media player
    }

    @Override
    public void onDestroy() {
        if (mp != null) {
            mp.release();
        }
        super.onDestroy();
    }
}
