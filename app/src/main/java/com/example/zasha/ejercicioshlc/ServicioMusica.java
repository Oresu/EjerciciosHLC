package com.example.zasha.ejercicioshlc;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;
import android.widget.Toast;

public class ServicioMusica extends Service {

    MediaPlayer reproductor;

    public ServicioMusica() {
    }

    @Override

    public void onCreate() {

        Toast.makeText(this, "Servicio creado",
                Toast.LENGTH_SHORT).show();

        reproductor = MediaPlayer.create(this, R.raw.musica);

    }


    @Override

    public int onStartCommand(Intent intenc, int flags, int idArranque) {

        Toast.makeText(this, "Servicio arrancado " + idArranque,
                Toast.LENGTH_SHORT).show();

        reproductor.start();

        return START_STICKY;

    }


    @Override

    public void onDestroy() {

        Toast.makeText(this, "Servicio detenido",
                Toast.LENGTH_SHORT).show();

        reproductor.stop();

    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }
}
