package com.cybercom_android_kn.chatapp_cybercom;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = MainActivity.class.getName();
    private EditText editTextUsername;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextUsername = (EditText) findViewById(R.id.editTextUserName);
    }

    public void onClick(View view) {

        if(view.getId() == R.id.buttonLogin)
        {
            String userNameInput = editTextUsername.getText().toString();
            editTextUsername.setText("Welcome " + userNameInput);
        }
    }
}
