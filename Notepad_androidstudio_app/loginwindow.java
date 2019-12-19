package com.example.a12345;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class loginwindow extends DialogFragment {


    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        LayoutInflater inflater = getActivity().getLayoutInflater();
        View view = inflater.inflate(R.layout.login_window, null);
        builder.setView(view);
        final Button submit = (Button) view.findViewById(R.id.btn_login);
        final EditText email = (EditText) view.findViewById(R.id.edittextEmailAddress);
        final EditText password = (EditText) view.findViewById(R.id.edittextPassword);

        submit.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                String strEmail = email.getText().toString();
                String strPassword = password.getText().toString();

                Intent intent = new Intent();
                intent.putExtra("id", strEmail);
                intent.putExtra("pass", strPassword);

                getTargetFragment().onActivityResult(getTargetRequestCode(), Activity.RESULT_OK, intent);
                dismiss();


            }


        });

        return builder.create();


    }

}