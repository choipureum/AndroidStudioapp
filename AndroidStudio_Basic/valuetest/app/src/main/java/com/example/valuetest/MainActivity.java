package com.example.valuetest;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText apple_num;
    EditText apple_price;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void btnClickedNext(View v){
        Intent intent = new Intent(MainActivity.this, Main2Activity.class);


        apple_num = (EditText)findViewById(R.id.apple_num);
        apple_price = (EditText)findViewById(R.id.apple_price);

        intent.putExtra("number",apple_num.getText().toString());
        intent.putExtra("price",apple_price.getText().toString());
        startActivity(intent);
        // int apple_num = Integer.parseInt(apple_num:getText().toString());
        //int apple_price = Integer.parseInt(apple_price.getText().toString());

        Toast.makeText(getApplicationContext(),"사과의 개수는 입니다",Toast.LENGTH_LONG).show();
    }
}
