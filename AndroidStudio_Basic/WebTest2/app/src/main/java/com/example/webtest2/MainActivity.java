package com.example.webtest2;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputMethodManager;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText address_edit;
    private WebView web_view;
    private Button move_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("웹 뷰 테스트");

        address_edit = findViewById(R.id.address_edit);
        web_view = findViewById(R.id.web_view);
        move_button = findViewById(R.id.move_button);

        WebSettings webSettings = web_view.getSettings();
        webSettings.setJavaScriptEnabled(true);

        web_view.setWebViewClient(new WebViewClient(){
            @Override
            public void onPageFinished(WebView view, String url) {
                Toast.makeText(MainActivity.this, "로딩 끝", Toast.LENGTH_LONG).show();
            }

            @Override
            public void onPageStarted(WebView view, String url, Bitmap favicon) {
            }
        });

        address_edit.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
                if(actionId== EditorInfo.IME_ACTION_SEARCH){
                    move_button.callOnClick();

                    InputMethodManager imm = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
                    imm.hideSoftInputFromWindow(v.getWindowToken(), 0);

                    return true;
                }
                return false;
            }
        });
    }

    public void onClick(View view) {
        String address = address_edit.getText().toString();
        if(address.startsWith("http://") ==false){
            address= "http://"+address;
        }
        web_view.loadUrl(address);
    }
    @Override
    public void onBackPressed(){
        if (web_view.canGoBack()) {
            web_view.goBack();
        }else{
            super.onBackPressed();
        }
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu_main,menu);
        return true;
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        switch(item.getItemId()){
            case R.id.action_back:
                web_view.goBack();
                return true;
            case R.id.action_forward:
                web_view.goForward();
                return true;
            case R.id.action_refresh:
                web_view.reload();
                return true;
        }
        return super.onOptionsItemSelected(item);
/*메뉴 메인 액티비티에 넣고 뒤로가기 앞으로가기 리로드 구동*/
    }
}
