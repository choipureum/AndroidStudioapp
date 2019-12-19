package com.example.intent_test;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText apple_num;
    EditText apple_price;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void priceCal(View v){
        apple_num = (EditText)findViewById(R.id.apple_num);
        apple_price = (EditText)findViewById(R.id.apple_price);

        Intent intent = new Intent(MainActivity.this,appleActivity.class);

        Bundle bundle = new Bundle();
        bundle.putString("number",apple_num.getText().toString());
        bundle.putString("prince",apple_price.getText().toString());

        intent.putExtras(bundle);
        /*번들로 하는법*/
        /*인텐트로 하는법*/
        /* intent.putExtra("number",apple_num.getText().toString());
        intent.putExtra("price",apple_price.getText().toString());  */

        startActivity(intent);
        /*    중괄호 사이에 들어가야된다. 이후 액티비티 실행이기때문   */

    }


}
