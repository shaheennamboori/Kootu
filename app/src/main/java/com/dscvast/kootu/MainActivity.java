package com.dscvast.kootu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    TextView idli, dosa, upma, putt, rice, chappathi;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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
                Toast.makeText(getApplicationContext(), "idli", Toast.LENGTH_SHORT).show();
                break;
            case R.id.dosa:
                Toast.makeText(getApplicationContext(), "dosa", Toast.LENGTH_SHORT).show();
                break;
            case R.id.upma:
                Toast.makeText(getApplicationContext(), "upma", Toast.LENGTH_SHORT).show();
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
}
