package com.example.dell.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class RegistrationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);
        Toast.makeText(this, "hi n", Toast.LENGTH_SHORT).show();
       // Toast.makeText(this, "hi n ", Toast.LENGTH_SHORT).show();
    }
}
