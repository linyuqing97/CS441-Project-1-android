package com.example.helloworld;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Button yesButton= (Button)findViewById(R.id.YesButton);
        TextView TV = (TextView)findViewById(R.id.secondTextView);

            String name = getIntent().getExtras().getString("com.example.helloworld.Something");
            TV.setText("Hello" + name+ " are you from Binghamton University? ");


        yesButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent starIntent = new Intent(getApplicationContext(), ThridActivity.class);
                String name = getIntent().getExtras().getString("com.example.helloworld.Something");
                starIntent.putExtra("com.example.helloworld.yes","HELLO WORLD FROM "+ name);
                startActivity(starIntent);
            }
        });

    }


}
