package com.example.p1;

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

        Calresult = (TextView)findViewById(R.id.Calresult);
        Intent intent = getIntent();

        String aNum = intent.getStringExtra("number");

        int Year =2019-Integer.parseInt(aNum)+1
        Calresult.setText("당신의 나이" + Year + "입니다");
    }

    public void backMain(View v){
        finish();

}
