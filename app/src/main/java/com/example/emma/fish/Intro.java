package com.example.emma.fish;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class Intro extends AppCompatActivity {
    private ImageView imgAndroid;
    private Animation anim;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_intro);
        Handler handler = new Handler();
        initView();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(Intro.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        },3000);


    }
    private void initView(){
        imgAndroid = (ImageView) findViewById(R.id.fish_loding_img);
        anim = AnimationUtils.loadAnimation(this, R.anim.loading);
        imgAndroid.setAnimation(anim);
    }
}
