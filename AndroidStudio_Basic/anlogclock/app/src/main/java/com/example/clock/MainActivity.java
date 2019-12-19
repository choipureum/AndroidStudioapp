package com.example.clock;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AnalogClock;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    AnalogClock analogTime;
    TextView timeresult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);\

        setTitle("아날로그 시계");

        analogTime = (AnalogClock)findViewById(R.id.analogTime);
        timeresult = (TextView)findViewById(R.id.timeresult);

        analogTime.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                final Calendar c = Calendar.getInstance();

                int Hour = c.get(Calendar.HOUR_OF_DAY);
                int Minute = c.get(Calendar.MINUTE);

                timeresult.setText("지금시간은 "+  Hour+"시 "+Minute+"분 입니다.");

                Toast.makeText(getApplicationContext(), "지금시간은 "+  Hour+"시 "+Minute+"분 입니다.",Toast.LENGTH_LONG).show();
            }
        }

    };
}
