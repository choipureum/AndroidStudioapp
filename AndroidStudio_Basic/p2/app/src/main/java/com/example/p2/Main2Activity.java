package com.example.p2;

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
        Bundle bundle = intent.getExtras();

        String aNum = bundle.getString("number");

        Double Hwadegree = (Integer.parseInt(aNum)*1.8)+32;
        Calresult.setText("화씨온도는 " + Hwadegree + "입니다");
    }
    public void backMain(View v){
        finish();
}
