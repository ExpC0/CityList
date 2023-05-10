package com.example.citylist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ShowActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show);

        /**
         * now we need to catch that intent from main activity
         * and setting the value of string to textview
         */
        Intent intent=getIntent();
        String s = intent.getStringExtra("cityname");

        TextView textView=findViewById(R.id.textView);
        textView.setText(s);

        /**
         * for returning to main activity by back button
         */
        Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(ShowActivity.this,MainActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}