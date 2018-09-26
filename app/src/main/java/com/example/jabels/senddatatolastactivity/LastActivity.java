package com.example.jabels.senddatatolastactivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class LastActivity extends Activity {

    private TextView userLogin;
    private TextView userPassword;
    private Button backButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.last_layout);

        userLogin = (TextView) findViewById(R.id.userLogin);
        userPassword = (TextView) findViewById(R.id.userPassword);
        backButton = (Button) findViewById(R.id.backButton);

        userLogin.setText(getIntent().getStringExtra("login"));
        userPassword.setText(getIntent().getStringExtra("pass"));

        /*backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                backToMainActivity(v);
            }
        });*/
    }


    public void backToMainActivity(View v) {
        Intent intent = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(intent);
    }
}
