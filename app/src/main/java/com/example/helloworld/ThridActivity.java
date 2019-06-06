package com.example.helloworld;

import android.graphics.BitmapFactory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.view.Display;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class ThridActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thrid);

        if(getIntent().hasExtra("com.example.helloworld.yes")){
            TextView FTV = (TextView) findViewById(R.id.finalTextView);
            ImageView img = (ImageView)findViewById(R.id.myImage);
            img.setVisibility(View.VISIBLE);
            String name = getIntent().getExtras().getString("com.example.helloworld.yes");
            FTV.setText(name);


        }
        else if(getIntent().hasExtra("com.example.helloworld.no")){
            TextView FTV = (TextView) findViewById(R.id.finalTextView);
            String name = getIntent().getExtras().getString("com.example.helloworld.no");
            FTV.setText(name);
        }
    }



}
