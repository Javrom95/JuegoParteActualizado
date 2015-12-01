package com.example.javier.juego;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by Javier on 28/11/2015.
 */
public class GeoTest extends AppCompatActivity {

    byte quizcount=1, correctans=0, wrongans=0;
    TextView geonumb,totalcorr, totalwrong, geoquiz, correctcount, wrongcount;
    Button geoans1, geoans2, geoans3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.geotest);

        geonumb = (TextView) findViewById(R.id.geoquestNum);
        geoquiz = (TextView) findViewById(R.id.geoquestQuiz);
        geoans1 = (Button) findViewById(R.id.geoans1);
        geoans2 = (Button) findViewById (R.id.geoans2);
        geoans3 = (Button) findViewById (R.id.geoans3);
        totalcorr = (TextView) findViewById(R.id.totalCorr);
        totalwrong = (TextView) findViewById(R.id.totalWrong);
        correctcount = (TextView) findViewById(R.id.correctnum);
        wrongcount = (TextView) findViewById(R.id.wrongnum);
    }


    public void geoPuls1 (View view){
        if(quizcount==1 || quizcount==4){
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


    public void geoPuls2 (View view){

        if(quizcount==3 || quizcount == 5){
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
    public void geoPuls3 (View view){
if(quizcount==2 || quizcount==6 || quizcount==7){
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

