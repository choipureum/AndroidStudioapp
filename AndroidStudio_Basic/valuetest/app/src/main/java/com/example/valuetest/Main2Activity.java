package com.example.valuetest;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    TextView Totalprice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent intent = getIntent();
        int apple_num = Integer.parseInt(intent.getStringExtra("number"));
        int apple_price = Integer.parseInt(intent.getStringExtra("price"));

        int total = apple_num * apple_price;
        Totalprice = (TextView)findViewById(R.id.Totalprice);
        Totalprice.setText(total);

    }
    public void btnClickBack(View v){
        //Intent intent = new Intent(Main2Activity.this, MainActivity.class);
        //startActivity(intent);
        finish();
    }
}
