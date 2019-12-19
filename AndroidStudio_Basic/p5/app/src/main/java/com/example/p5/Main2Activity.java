package com.example.p5;

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

        String analjja = bundle.getString("number");


        int second = Integer.parseInt(analjja)*24*60*60;
        Calresult.setText("날 수에 해당되는 시간은 " + second + "입니다");

    }
    public void backmain(View v){
        finish();
    }
}
