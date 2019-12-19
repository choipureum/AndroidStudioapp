package com.example.upnavigation;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class ChildActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_child);
        setTitle("Child");
    }


    public void moveMain(View view) {
        Intent intent = new Intent(ChildActivity.this,MainActivity.class);
        startActivity(intent);
    }
}
