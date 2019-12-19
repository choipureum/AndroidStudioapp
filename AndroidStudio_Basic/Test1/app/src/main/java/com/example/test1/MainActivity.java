package com.example.test1;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onButtonClicked1(View v){
        Toast.makeText(getApplicationContext(), "시작버튼을 눌렀어요", Toast.LENGTH_LONG).show();
    }
    public void onButtonClicked2(View v) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://m.naver.com"));
        startActivity(intent);
    }
    public void onButtonCliked3(View v){
        Intent intent = new Intent(Intent. ACTION_VIEW, Uri.parse("tel:010-1000-1000"));
        startActivity(intent);
    }
    public void onButtonCliked4(View v){
        Intent intent = new Intent(getApplicationContext(), MenuActivity.class);
        startActivity(intent);
    }
}
