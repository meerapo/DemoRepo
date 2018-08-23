package com.example.protectdental.mydemogithubrepo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
        Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=(Button)findViewById(R.id.button1);
        button.setOnClickListener(this);
        creatTask();
    }

    private void creatTask() {
        Toast.makeText(this,"Hi",Toast.LENGTH_SHORT).show();
//hiiiiiiiiiiiiiiiii
        //meera
        //How are you?
    //Want to update new comments
    }

    @Override
    public void onClick(View v) {
        Intent intent=new Intent(this,OneActivity.class);
        startActivity(intent);
    }
}
