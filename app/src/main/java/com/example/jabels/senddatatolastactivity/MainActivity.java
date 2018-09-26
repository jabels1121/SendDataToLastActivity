package com.example.jabels.senddatatolastactivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity {

    private EditText loginInputField;
    private EditText passwordInputField;
    private Button dataSendButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_layout);

        loginInputField = (EditText) findViewById(R.id.loginInputField);
        passwordInputField = (EditText) findViewById(R.id.passInputField);
        dataSendButton = (Button) findViewById(R.id.dataSendButton);

        /*dataSendButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sendData(v);
            }
        });*/
    }

    public void sendData(View v) {
        Intent intent = new Intent(getApplicationContext(), LastActivity.class);
        intent.putExtra("login", loginInputField.getText().toString());
        intent.putExtra("pass", passwordInputField.getText().toString());
        startActivity(intent);
    }
}
