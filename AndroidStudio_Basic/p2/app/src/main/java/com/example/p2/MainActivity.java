package com.example.p2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText degree;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
        public void calculate(View v){
            degree = (EditText)findViewById(R.id.degree);

            Intent intent = new Intent(MainActivity.this,Main2Activity.class);
            Bundle bundle = new Bundle();
            bundle.putString("number",degree.getText().toString());

            intent.putExtras(bundle);

            startActivity(intent);

        }


    }

