package com.example.intent_test;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class appleActivity extends AppCompatActivity {

    TextView Calresult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_apple);

        Calresult = (TextView)findViewById(R.id.Calresult);
        Intent intent = getIntent();

        Bundle bundle = intent.getExtras();

        String aNum = bundle.getString("number");
        String aPrice = bundle.getString("price");

        /*
        String aNum = intent.getStringExtra("number");
        String aPrice = intent.getStringExtra("prince");
        */

        int totalPrice = Integer.parseInt(aNum) * Integer.parseInt(aPrice);
        Calresult.setText("사과의 가격은" + totalPrice + "입니다");
     /* 액티비티가 실행되면 가장먼저 실행되는 중갈호 전에 들어가야된다 */
    }

    public void backMain(View v){
        finish();

      /*  Intent intent = new Intent(appleActivity.this,MainActivity.class);
        startActivity(intent);  */
    }
}
