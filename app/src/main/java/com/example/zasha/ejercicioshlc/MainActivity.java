package com.example.zasha.ejercicioshlc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }//fin onCreate


    public void servicioSimple(View view) {
        Intent servicio = new Intent(this, MyService.class);
        startService(servicio);
    }
}
