package com.lucie.countdowntimer;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;

import java.util.Date;

public class MainActivity extends AppCompatActivity {
TextView secs;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        secs = (TextView) findViewById(R.id.textView5);
        //secs.setText("done");
        new CountDownTimer(30000, 1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                secs.setText("" +millisUntilFinished/1000);
            }

            @Override
            public void onFinish() {
                secs.setText("done");

            }
        }.start();

    }
}
