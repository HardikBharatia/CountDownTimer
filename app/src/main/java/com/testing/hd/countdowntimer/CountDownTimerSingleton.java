package com.testing.hd.countdowntimer;

import android.os.CountDownTimer;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.concurrent.TimeUnit;

public class CountDownTimerSingleton {

    private static CountDownTimerSingleton instance;
    private TextView timerText;
    CountDownTimer quizTimer;
    private CountDownTimerSingleton(){
    }

    public static CountDownTimerSingleton getInstance() {
        if(instance == null) {
            instance = new CountDownTimerSingleton();
        }
        return instance;
    }

    public void startTimer(int seconds) {
        quizTimer = new CountDownTimer(seconds*1000,1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                timerText.setText(String.format("%02d:%02d",
                        TimeUnit.MILLISECONDS.toMinutes(millisUntilFinished) % 60,
                        TimeUnit.MILLISECONDS.toSeconds(millisUntilFinished) % 60));
            }

            @Override
            public void onFinish() {
                    timerText.setText("Done");
            }
        };
        quizTimer.start();
    }

    public void stopTimer() {
        if(quizTimer != null) {
            quizTimer.cancel();
            quizTimer = null;
        }
    }

    public void setTextView(TextView timerText) {
        this.timerText = timerText;
    }
}
