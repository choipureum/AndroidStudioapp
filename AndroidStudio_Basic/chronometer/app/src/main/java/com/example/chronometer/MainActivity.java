package com.example.chronometer;

import android.graphics.Color;
import android.os.Bundle;
import android.os.SystemClock;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Chronometer;

public class MainActivity extends AppCompatActivity {

    Chronometer Chronoresult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
        public void ChronoStr(View v) {
            Chronoresult = (Chronometer)findViewById(R.id.Chronoresult);
            Chronoresult.setBase(SystemClock.elapsedRealtime());
            Chronoresult.start();
            Chronoresult.setTextColor(Color.RED);
        }

        public void ChronoEnd(View v) {
            Chronoresult = (Chronometer)findViewById(R.id.Chronoresult);
            Chronoresult.stop();
            Chronoresult.setTextColor(Color.BLUE);
        }


    }

