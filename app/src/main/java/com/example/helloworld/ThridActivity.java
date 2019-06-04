package com.example.helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ThridActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thrid);

        if(getIntent().hasExtra("com.example.helloworld.yes")){
            TextView FTV = (TextView) findViewById(R.id.finalTextView);
            String name = getIntent().getExtras().getString("com.example.helloworld.yes");
            FTV.setText(name);
        }
    }
}
