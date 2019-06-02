package com.example.helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        if(getIntent().hasExtra("com.example.helloworld.Something")){
            TextView TV = (TextView) findViewById(R.id.secondTextView);
           // String name = getIntent().getExtras().getString("com.example.helloworld.Something");
            //TV.setText(name);
        }
    }
}
