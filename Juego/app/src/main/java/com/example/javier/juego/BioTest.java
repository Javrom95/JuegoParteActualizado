package com.example.javier.juego;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by Javier on 28/11/2015.
 */
public class BioTest extends AppCompatActivity {

    byte quizcount=1;
    byte correctans=0, wrongans=0;

    TextView bionumb, bioquiz, totalcorr, totalwrong, correctcount, wrongcount;
    Button bioans1, bioans2, bioans3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.biotest);

        bionumb = (TextView) findViewById(R.id.bioquestNum);
        bioquiz = (TextView) findViewById(R.id.bioquestQuiz);
        bioans1 = (Button) findViewById(R.id.bioans1);
        bioans2 = (Button) findViewById(R.id.bioans2);
        bioans3 = (Button) findViewById(R.id.bioans3);
        totalcorr = (TextView) findViewById(R.id.totalCorr);
        totalwrong = (TextView) findViewById(R.id.totalWrong);
        correctcount = (TextView) findViewById(R.id.correctans);
        wrongcount = (TextView) findViewById(R.id.wrongans);

    }

    public void bioPuls1 (View view){
        if(quizcount==5 || quizcount==7){
            //It´s correct, so add the correct counter +1.
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


    public void bioPuls2 (View view){

        if(quizcount==1 || quizcount == 2){
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
    public void bioPuls3 (View view){
        if(quizcount==3 || quizcount==4 || quizcount==6){
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
