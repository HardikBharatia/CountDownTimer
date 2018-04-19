package com.testing.hd.countdowntimer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Activity_one extends AppCompatActivity {

    TextView tvTimer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_one);

        tvTimer = (TextView) findViewById(R.id.timer);
    }

    @Override
    protected  void onResume() {
        super.onResume();
        CountDownTimerSingleton.getInstance().setTextView(tvTimer);
    }

    public void start(View view) {
        CountDownTimerSingleton.getInstance().startTimer(120);
    }

    public void next(View view) {
        Intent toNextActivity = new Intent(this, Activity_two.class);
        startActivity(toNextActivity);
    }

    public void stop(View view) {
        CountDownTimerSingleton.getInstance().stopTimer();
    }
}
