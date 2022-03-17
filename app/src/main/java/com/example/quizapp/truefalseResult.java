package com.example.quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class truefalseResult extends AppCompatActivity {

    Button end,Try;
    TextView correct,wrong;
    int s1,s2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_truefalse_result);
        end=findViewById(R.id.endbtn);
        Try=findViewById(R.id.tryagainbtn);
        correct=findViewById(R.id.correctans);
        wrong=findViewById(R.id.wrongans);

        Intent in=getIntent();
        s1=in.getIntExtra("Correct",0);
        correct.setText("CORRECT ANSWERS = "+s1);

        s2=in.getIntExtra("Incorrect",0);
        wrong.setText("INCORRECT ANSWERS = "+s2);

        end.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(truefalseResult.this,MainActivity2.class);
                startActivity(intent);
            }
        });
        Try.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(truefalseResult.this,MainActivity9.class);
                startActivity(intent);
            }
        });




    }
}