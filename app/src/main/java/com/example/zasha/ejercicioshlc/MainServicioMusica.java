package com.example.zasha.ejercicioshlc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainServicioMusica extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_servicio_musica);

        Button arrancar = (Button) findViewById(R.id.boton_arrancar);

        arrancar.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {

                startService(new Intent(MainServicioMusica.this, ServicioMusica.class));

            }

        });

        Button detener = (Button) findViewById(R.id.boton_detener);

        detener.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {

                stopService(new Intent(MainServicioMusica.this, ServicioMusica.class));

            }

        });
    }
}
