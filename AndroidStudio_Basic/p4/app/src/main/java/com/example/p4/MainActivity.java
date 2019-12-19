package com.example.p4;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText bunyang;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void calculate(View v){
        bunyang = (EditText)findViewById(R.id.bunyang);

        Intent intent = new Intent(MainActivity.this,Main2Activity.class);
        Bundle bundle = new Bundle();
        bundle.putString("number",bunyang.getText().toString());


        intent.putExtras(bundle);

        startActivity(intent);
    }
}
