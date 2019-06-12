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

public class FamilyActivity extends AppCompatActivity
        implements View.OnClickListener {

    private final int[] resID = { R.raw.achan, R.raw.amma, R.raw.chettan, R.raw.chechi, R.raw.aniyan, R.raw.aniyathi };
    private MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_family);

        requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);
        mp = new MediaPlayer();

        TextView achan = findViewById(R.id.achan);
        TextView amma = findViewById(R.id.amma);
        TextView chetan = findViewById(R.id.chettan);
        TextView chechi = findViewById(R.id.chechi);
        TextView aniyan = findViewById(R.id.aniyan);
        TextView aniyathi = findViewById(R.id.aniyathi);

        achan.setOnClickListener(this);
        amma.setOnClickListener(this);
        chetan.setOnClickListener(this);
        aniyan.setOnClickListener(this);
        chechi.setOnClickListener(this);
        aniyathi.setOnClickListener(this);
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
            case R.id.achan:
                playSong(0);
                break;
            case R.id.amma:
                playSong(1);
                break;
            case R.id.chettan:
                playSong(2);
                break;
            case R.id.chechi:
                playSong(3);
                break;
            case R.id.aniyan:
                playSong(4);
                break;
            case R.id.aniyathi:
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
