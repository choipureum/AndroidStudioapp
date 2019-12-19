package com.example.p1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText YearInput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
        public void YearCal(View v){
            YearInput = (EditText)findViewById(R.id.YearInput);

            Intent intent = new Intent(MainActivity.this,Main2Activity.class);

            Bundle bundle = new Bundle();
            bundle.putString("number", YearInput.getText().toString());

            intent.putExtras(bundle);

            startActivity(intent);
    }
}
