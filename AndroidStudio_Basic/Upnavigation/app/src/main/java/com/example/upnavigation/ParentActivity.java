package com.example.upnavigation;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class ParentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_paraent);
        setTitle("Parent");
    }

    public void moveChild(View view) {
        Intent intent = new Intent(ParentActivity.this,ChildActivity.class);
        startActivity(intent);
    }
}
