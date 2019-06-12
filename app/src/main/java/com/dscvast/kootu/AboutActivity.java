package com.dscvast.kootu;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

import static java.util.Objects.requireNonNull;

public class AboutActivity extends AppCompatActivity
        implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);

        ImageView dev1 = findViewById(R.id.dev1);
        ImageView dev2 = findViewById(R.id.dev2);

        dev1.setOnClickListener(this);
        dev2.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.dev1) {
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://github.com/nsshaheen10/"));
            startActivity(intent);
        } else if (v.getId() == R.id.dev2) {
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://github.com/hjanesh"));
            startActivity(intent);
        }
    }

    @Override
    public boolean onSupportNavigateUp() {
        finish();
        return super.onSupportNavigateUp();
    }
}
