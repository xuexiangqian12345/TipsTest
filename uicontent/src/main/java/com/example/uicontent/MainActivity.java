package com.example.uicontent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText login = findViewById(R.id.testView2);
        String loginText = login.getText().toString();
        Log.i("xxqtest","loginText = " + loginText);

    }

    public void onClick(View view) {
        Toast.makeText(MainActivity.this, "button test", Toast.LENGTH_SHORT).show();
    }
}
