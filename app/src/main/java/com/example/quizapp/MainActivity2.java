package com.example.quizapp;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {

    Button quesbtn, mcqbtn, btfbtn, showbtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        quesbtn =(Button) findViewById(R.id.quesprep);
        mcqbtn =(Button) findViewById(R.id.mcqquiz);
        btfbtn =(Button) findViewById(R.id.tf);
        showbtn =(Button) findViewById(R.id.showmore);


    }

    public void demo1(View view)
    {
        Intent intent= new Intent(MainActivity2.this,MainActivity4.class);
        startActivity(intent);
    }

    public void demo2(View view) {
        Intent in=new Intent(MainActivity2.this,MainActivity7.class);
        startActivity(in);
    }

    public void demo3(View view) {
        Intent intent=new Intent(MainActivity2.this,MainActivity9.class);
        startActivity(intent);

    }
    public void demo4(View view) {
        Uri uri=Uri.parse("https://developer.android.com/");
        Intent in=new Intent(Intent.ACTION_VIEW,uri);
        startActivity(in);
    }

}