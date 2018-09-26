package com.example.jabels.senddatatolastactivity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

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

    }


    public void backToMainActivity(View v) {
        Intent intent = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(intent);
    }

    public void onShow(View v) {
        Toast toast = Toast.makeText(getApplicationContext(), "Hello!", Toast.LENGTH_LONG);
        toast.setGravity(Gravity.CENTER, 0, 0);
        toast.show();
    }

    public void onPosition(View v) {
        Context context = getApplicationContext();
        Configuration configuration = getResources().getConfiguration();

        if (configuration.orientation == Configuration.ORIENTATION_PORTRAIT) {
            Toast.makeText(context, "Now is Poartrait orientation.", Toast.LENGTH_LONG).show();
        }
        if (configuration.orientation == Configuration.ORIENTATION_LANDSCAPE) {
            Toast.makeText(context, "Now is LandScape orientation.", Toast.LENGTH_LONG).show();
        }
    }
}
