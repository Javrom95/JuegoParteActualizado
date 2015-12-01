package com.example.javier.juego;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    public void geoPuls(View view){
        Intent geoIntent = new Intent(getApplicationContext(),GeoTest.class);
        startActivity(geoIntent);
    }

    public void bioPuls(View view){
        Intent bioIntent = new Intent(getApplicationContext(),BioTest.class);
        startActivity(bioIntent);
    }

    public void mathPuls(View view){
        Intent mathIntent= new Intent(getApplicationContext(),MathTest.class);
        startActivity(mathIntent);
    }

    public void asrtoPuls(View view){
        Intent astroIntent= new Intent(getApplicationContext(),AstroTest.class);
        startActivity(astroIntent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
