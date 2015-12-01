package com.example.javier.juego;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

/**
 * Created by Javier on 28/11/2015.
 */
public class MathTest extends AppCompatActivity {

    byte quizcount=1;
    byte correctans=0, wrongans=0;

    TextView mathnumb, mathquiz,totalcorr, totalwrong, correctcount, wrongcount;
    Button mathans1, mathans2, mathans3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mathtest);

        mathnumb = (TextView) findViewById(R.id.mathquestNum);
        mathquiz = (TextView) findViewById(R.id.mathquestQuiz);
        mathans1 = (Button) findViewById(R.id.mathans1);
        mathans2 = (Button) findViewById (R.id.mathans2);
        mathans3 = (Button) findViewById (R.id.mathans3);
        totalcorr = (TextView) findViewById(R.id.totalCorr);
        totalwrong = (TextView) findViewById(R.id.totalWrong);
        correctcount = (TextView) findViewById(R.id.correctans);
        wrongcount = (TextView) findViewById(R.id.wrongans);
    }

    public void mathPuls1 (View view){
        if(quizcount==1 || quizcount==7){
            //It´s correct, so add the correct counter +1.
            correctans++;
            Log.i("1.","1.");
            correctcount.setText(""+correctans);
            Log.i("1.1.","1.1.");

        }else{
            wrongans++;
            wrongcount.setText(""+wrongans);
        }
        quizcount++;
        //Changes all the text for the next question:
        //
        //
    }


    public void mathPuls2 (View view){

        if(quizcount==2 || quizcount == 6){
            correctans++;
            correctcount.setText(""+correctans);
        }else{
            wrongans++;
            wrongcount.setText(""+wrongans);
        }
        quizcount++;
        //Changes all the text for the next question:
        //
        //
    }
    public void mathPuls3 (View view){
        if(quizcount==3 || quizcount==4 || quizcount==5){
            correctans++;
            correctcount.setText(""+correctans);
        }else{
            wrongans++;
            wrongcount.setText(""+wrongans);
        }
        quizcount++;
        //Changes all the text for the next question:
        //
        //
    }




}

