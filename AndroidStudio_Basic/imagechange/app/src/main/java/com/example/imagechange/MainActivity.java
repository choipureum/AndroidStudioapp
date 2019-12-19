package com.example.imagechange;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    int i=0;

    ImageView imageView;
    Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void ChangeImage(View view) {
        button = (button)findViewById(R.id.button);
        imageView = (imageView)findViewById(R.id.ImageView);

        i = i+1;
        if(i%3 ==0){
            imageView.setImageResource(R.drawable.image1);
        }else if(i%3 ==1){
            imageView.setImageResource(R.drawable.image2);
        }else if(i%3 ==2){
            imageView.setImageResource(R.drawable.image3);
        }
    }
}
