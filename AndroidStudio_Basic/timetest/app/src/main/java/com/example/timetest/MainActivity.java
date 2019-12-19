package com.example.timetest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.TimePicker;

public class MainActivity extends AppCompatActivity {

    TimePicker timePicker;
    TextView timeresult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void getTime(View v){
        timePicker = (TimePicker)findViewById(R.id.timePicker);
        timeresult = (TextView)findViewById(R.id.timeresult);

        timeresult.setText(timePicker.getCurrentHour()+"시"+timePicker.getCurrentMinute()+"분을 선택하셨습니다.");

    }
}
