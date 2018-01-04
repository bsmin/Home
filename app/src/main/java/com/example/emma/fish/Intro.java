package com.example.emma.fish;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class Intro extends Activity {
    Handler handler = new Handler();
    Runnable r = new Runnable() {
        @Override
        public void run() {
            //3초뒤 화면 전환
            Intent intent = new Intent(getApplicationContext(),MainActivity.class);
            startActivity(intent);
            finish();
        }
    };
     @Override
    protected void onCreate(Bundle savedInstanceState) {
         super.onCreate(savedInstanceState);
         setContentView(R.layout.activity_intro);
     }
    @Override
    protected void onResume() {
        super.onResume();
        handler.postDelayed(r,3000);
    }

    @Override
    protected void onPause() {
        super.onPause();
        handler.removeCallbacks(r);
    }
}
