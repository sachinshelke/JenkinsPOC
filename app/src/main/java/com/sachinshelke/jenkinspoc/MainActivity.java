package com.sachinshelke.jenkinspoc;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        TextView tv = ((TextView) findViewById(R.id.txt));
        tv.setText("Hi This Damini's First Demo");


    }
}
