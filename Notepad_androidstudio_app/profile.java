package com.example.a12345;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class profile extends AppCompatActivity {

    EditText mMemoEdit =null;
    Textfile mTextfile = new Textfile(this);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.profile);

        mMemoEdit = (EditText)findViewById(R.id.memo_edit);

    }
    public void onClick1(View v){
        switch (v.getId()){
            case R.id.load_btn:{
                String memoData = mTextfile.load();
                mMemoEdit.setText(memoData);

                Toast.makeText(this, "메모를 불러왔습니다", Toast.LENGTH_SHORT).show();
                break;
            }
            case R.id.save_btn:{
                String memoData = mMemoEdit.getText().toString();
                mTextfile.save(memoData);
                mMemoEdit.setText("");

                Toast.makeText(this,"저장했습니다",Toast.LENGTH_SHORT).show();
                break;
            }
            case R.id.delete_btn:{
                mTextfile.delete();
                mMemoEdit.setText("");
                Toast.makeText(this,"삭제했습니다",Toast.LENGTH_SHORT).show();
            }
        }

    }
    public void backMain(View v){
        finish();

}}





