package com.example.p6;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText korean;
    EditText english;
    EditText math;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
        public void calculate(View v){
            korean = (EditText)findViewById(R.id.korean);
            english = (EditText)findViewById(R.id.english);
            math = (EditText)findViewById(R.id.math);

            Intent intent = new Intent(MainActivity.this,Main2Activity.class);
            Bundle bundle = new Bundle();
            bundle.putString("number",korean.getText().toString());
            bundle.putString("number",english.getText().toString());
            bundle.putString("number",math.getText().toString());
            intent.putExtras(bundle);
            startActivity(intent);

        }
}
