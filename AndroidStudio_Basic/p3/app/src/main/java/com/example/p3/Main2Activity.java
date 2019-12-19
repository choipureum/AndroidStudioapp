package com.example.p3;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    TextView Calresult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Calresult = (TextView) findViewById(R.id.Calresult);
        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();

        String agaro = bundle.getString("number");
        String asero = bundle.getString("number");

        int agarosero = Integer.parseInt(agaro) * Integer.parseInt(asero)
        Calresult.setText("직사각형의 넓이는 " + agarosero + "입니다");
    }

    public void backmain(View v) {
        finish();
    }
}