package com.example.a12345;

import android.app.Activity;
import android.app.DialogFragment;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;


public class MainFragment extends Fragment {

    private static final int DIALOG_REQUEST_CODE = 1234;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view =  inflater.inflate(R.layout.fragment_main, container, false);

        Button button = (Button)view.findViewById(R.id.button);
        ImageView imageView = (ImageView)view.findViewById(R.id.imageView);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                show();
            }
        });

        return view;
    }

    void show()
    {
        DialogFragment newFragment = new loginwindow();
        newFragment.setTargetFragment(this, DIALOG_REQUEST_CODE );
        newFragment.show(getFragmentManager(), "dialog");
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == DIALOG_REQUEST_CODE) {

            if (resultCode == Activity.RESULT_OK) {
                String id = data.getExtras().getString("id");
                String pass = data.getExtras().getString("pass");

                Toast.makeText(getActivity(), "푸름's Memo에 로그인 되었습니다",Toast.LENGTH_LONG).show();
            }
        }



        }
}