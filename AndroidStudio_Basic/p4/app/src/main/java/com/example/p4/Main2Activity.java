package com.example.p4;

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

        String abunyang = bundle.getString("number");
        Double pyung = Integer.parseInt(abunyang)/3.305;
        Calresult.setText("평수는 " + pyung + "입니다");
    }
    public void backmain(View v){
        finish();
    }
}
