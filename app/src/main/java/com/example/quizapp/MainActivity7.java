package com.example.quizapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity7 extends AppCompatActivity {

    TextView xxtxt, yytxt;
    TextView ques;
    RadioButton r1,r2,r3,r4;
    String[] question,op1,op2,op3,op4,solution;
    ImageView left,right;
    Button submit;
    int index=0;
    int correct=0,incorrect=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);
        xxtxt =findViewById(R.id.XXtxt);
        yytxt =findViewById(R.id.YYtxt);
        ques=findViewById(R.id.questiontxt);
        r1=findViewById(R.id.radiobtn1);
        r2=findViewById(R.id.radiobtn2);
        r3=findViewById(R.id.radiobtn3);
        r4=findViewById(R.id.radiobtn4);
        left=findViewById(R.id.Backimg);
        right=findViewById(R.id.Nextimg);
        submit=findViewById(R.id.submitbtn);

        solution=getResources().getStringArray(R.array.sol);
        question=getResources().getStringArray(R.array.mcqs);
        op1=getResources().getStringArray(R.array.one);
        op2=getResources().getStringArray(R.array.two);
        op3=getResources().getStringArray(R.array.three);
        op4=getResources().getStringArray(R.array.four);

        ques.setText(question[index]);
        xxtxt.setText(String.valueOf(index+1)+"/");
        yytxt.setText(String.valueOf(question.length));
        r1.setText(op1[index]);
        r2.setText(op2[index]);
        r3.setText(op3[index]);
        r4.setText(op4[index]);

        left.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(index==0) {
                    Toast.makeText(MainActivity7.this,"NO MCQS:",Toast.LENGTH_SHORT).show();
                }
                else
                {
                    index--;
                    ques.setText(question[index]);
                    xxtxt.setText(String.valueOf(index+1)+"/");
                    r1.setText(op1[index]);
                    r2.setText(op2[index]);
                    r3.setText(op3[index]);
                    r4.setText(op4[index]);
                }
            }
        });
        right.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(index==question.length-1)
                {
                    Intent in=new Intent(MainActivity7.this,quizResult.class);
                    in.putExtra("Correct",correct);
                    in.putExtra("Incorrect",incorrect);
                    startActivity(in);
                }
                else
                {
                    index++;
                    ques.setText(question[index]);
                    xxtxt.setText(String.valueOf(index+1)+"/");
                    r1.setText(op1[index]);
                    r2.setText(op2[index]);
                    r3.setText(op3[index]);
                    r4.setText(op4[index]);
                    if(r1.isChecked())
                    {
                        if(r1.getText().equals(solution[index]))
                        {
                            correct++;
                        }
                        else
                        {
                            incorrect++;
                        }
                    }
                    else if(r2.isChecked())
                    {
                        if(r2.getText().equals(solution[index]))
                        {
                            correct++;
                        }
                        else
                        {
                            incorrect++;
                        }
                    }
                    else if(r3.isChecked())
                    {
                        if(r3.getText().equals(solution[index]))
                        {
                            correct++;
                        }
                        else
                        {
                            incorrect++;
                        }
                    }
                    else if(r4.isChecked())
                    {
                        if(r4.getText().equals(solution[index]))
                        {
                            correct++;
                        }
                        else
                        {
                            incorrect++;
                        }
                    }
                    else
                    {
                        Toast.makeText(MainActivity7.this,"Please select any option",Toast.LENGTH_SHORT).show();
                    }
                }
            }


        });



    }
}