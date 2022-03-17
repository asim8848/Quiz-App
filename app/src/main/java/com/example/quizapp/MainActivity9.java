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

public class MainActivity9 extends AppCompatActivity {

    TextView xxtxt, yytxt;
    TextView ques;
    RadioButton r1,r2;
    String[] question,solution;
    ImageView backbtn, nextbtn;
    Button submit;
    int index=0;
    int correct=0,incorrect=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main9);
        xxtxt =findViewById(R.id.xxtf);
        yytxt =findViewById(R.id.yytf);
        ques=findViewById(R.id.tfquestion);
        r1=findViewById(R.id.truebtn);
        r2=findViewById(R.id.falsebtn);
        backbtn =findViewById(R.id.tfbackbtn);
        nextbtn =findViewById(R.id.tfnextbtn);
        submit=findViewById(R.id.tfsubmit);

        question=getResources().getStringArray(R.array.tf);
        solution=getResources().getStringArray(R.array.solution);

        ques.setText(question[index]);
        xxtxt.setText(String.valueOf(index+1)+"/");
        yytxt.setText(String.valueOf(question.length));
        r1.setText("True");
        r2.setText("False");

        backbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(index==0) {
                    Toast.makeText(MainActivity9.this,"NO More Questions:",Toast.LENGTH_SHORT).show();
                }
                else
                {
                    index--;
                    ques.setText(question[index]);
                    xxtxt.setText(String.valueOf(index+1)+"/");
                    r1.setText("True");
                    r2.setText("False");

                }
            }
        });

        nextbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(index==question.length-1)
                {
                    Intent in=new Intent(MainActivity9.this,truefalseResult.class);
                    in.putExtra("Correct",correct);
                    in.putExtra("Incorrect",incorrect);
                    startActivity(in);
                }
                else if (r1.isChecked() || r2.isChecked() ){
                    index++;
                    ques.setText(question[index]);
                    xxtxt.setText(String.valueOf(index+1)+"/");
                    r1.setText("True");
                    r2.setText("False");

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

                }else{
                    Toast.makeText(MainActivity9.this,"Kindly Select An Option:",Toast.LENGTH_SHORT).show();

                }
            }
        });
    }
}