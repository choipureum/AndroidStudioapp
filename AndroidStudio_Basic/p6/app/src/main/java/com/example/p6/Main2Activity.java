package com.example.p6;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    TextView Calresult1;
    TextView Calresult2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Calresult1 = (TextView)findViewById(R.id.Calresult1);
        Calresult1 = (TextView)findViewById(R.id.Calresult2);
        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();

        String akorean = bundle.getString("number");
        String aenglish = bundle.getString("number");
        String amath = bundle.getString("number");


        int total = Integer.parseInt(akorean) + Integer.parseInt(amath)+ Integer.parseInt(aenglish);
        int avg = (Integer.parseInt(akorean) + Integer.parseInt(amath) + Integer.parseInt(aenglish))/3;
        Calresult1.setText("입력하신 점수의 총점은 " + total + "입니다");
        Calresult2.setText("입력하신 점수의 총점은 " + avg + "입니다");

    }
    public void backmain(View v){
        finish();
    }
}
