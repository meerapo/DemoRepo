package com.example.protectdental.mydemogithubrepo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class OneActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_one);

        Intent intent=new Intent(this,TwoActivity.class);
        startActivity(intent);
        //Hey Click me to see magic
    }
}
