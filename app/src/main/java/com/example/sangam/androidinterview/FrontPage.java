package com.example.sangam.androidinterview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class FrontPage extends AppCompatActivity {
    private Button interview;
    private Button simple;
    private Button amazing;
    private Button rate;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_front_page);
        interview=(Button) findViewById(R.id.button_interview);
        simple = (Button) findViewById(R.id.button_simple);
        amazing = (Button) findViewById(R.id.button_amazing);
        rate = (Button) findViewById(R.id.button_rate);

        interview.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Interviewclicked",Toast.LENGTH_SHORT).show();
            }
        });
        simple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"SimpleClicked",Toast.LENGTH_SHORT).show();
            }
        });
        amazing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"AmazingClicked",Toast.LENGTH_SHORT).show();
            }
        });
        rate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"RateClicked",Toast.LENGTH_SHORT).show();
            }
        });


    }

}
