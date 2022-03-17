 package com.example.quizapp;

 import android.os.Bundle;
 import android.view.View;
 import android.widget.ImageView;
 import android.widget.TextView;
 import android.widget.Toast;

 import androidx.appcompat.app.AppCompatActivity;

 public class MainActivity4 extends AppCompatActivity  {

     TextView XX, YY;
     ImageView backimg, revealans, nextimg;
     TextView ques, ans;
     String [] simple_quest,simple_ans;
     int index=0;
     @Override
     protected void onCreate(Bundle savedInstanceState) {
         super.onCreate(savedInstanceState);
         setContentView(R.layout.activity_main4);
         XX =findViewById(R.id.xxtxt);
         YY =findViewById(R.id.yytxt);
         backimg =findViewById(R.id.backimg);
         revealans =findViewById(R.id.revealimg);
         nextimg =findViewById(R.id.nextimg);
         ques =findViewById(R.id.questxt);
         ans =findViewById(R.id.anstxt);
         simple_quest= getResources().getStringArray(R.array.ques);
         simple_ans=getResources().getStringArray(R.array.ans);

         ques.setText(simple_quest[index]);
         ans.setText("Press A Button for the Answer:");
         XX.setText(String.valueOf(index+1)+"/");
         YY.setText(String.valueOf(simple_quest.length));

         backimg.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 if(index==0) {
                     Toast.makeText(MainActivity4.this,"NO Questions:",Toast.LENGTH_SHORT).show();
                     }
                 else
             {
                 index--;
                 ques.setText(simple_quest[index]);
                 ans.setText("Press \"A\" Button for the Answer:");
                 XX.setText(String.valueOf(index + 1) + "/");
                 }

             }
         });

         revealans.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 ans.setText(simple_ans[index]);
             }
         });

         nextimg.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 if(index== simple_quest.length-1) {
                     Toast.makeText(MainActivity4.this,"No More Questions:",Toast.LENGTH_SHORT).show();
                 }
                 else
                 {
                     index++;
                     ques.setText(simple_quest[index]);
                     ans.setText("Press \"A\" Button for the Answer:");
                     XX.setText(String.valueOf(index + 1) + "/");
                 }
             }
         });
     }
 }