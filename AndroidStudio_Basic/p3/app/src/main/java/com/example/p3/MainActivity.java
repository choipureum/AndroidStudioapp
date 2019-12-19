package com.example.p3;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText garo;
    EditText sero;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void calculate(View v) {
        garo = (EditText) findViewById(R.id.garo);
        sero = (EditText) findViewById(R.id.sero);

        Intent intent = new Intent(MainActivity.this, Main2Activity.class);
        Bundle bundle = new Bundle();
        bundle.putString("number",garo.getText().toString());
        bundle.putString("prince",sero.getText().toString());

        intent.putExtras(bundle);
        startActivity(intent);
    }
}