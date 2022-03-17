package com.example.quizapp;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    ImageView img;
    TextView text;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        img =(ImageView) findViewById(R.id.img);

        text=(TextView) findViewById(R.id.text1);

        @SuppressLint("ResourceType") Animation anim= AnimationUtils.loadAnimation(getApplicationContext(),R.animator.fade);
        img.startAnimation(anim);

        @SuppressLint("ResourceType") Animation textanim= AnimationUtils.loadAnimation(getApplicationContext(),R.animator.moveup);
        text.startAnimation(textanim);

            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                    startActivity(intent);
                }
            },4000);

    }
}