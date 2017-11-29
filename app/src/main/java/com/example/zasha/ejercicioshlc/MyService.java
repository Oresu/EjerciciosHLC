package com.example.zasha.ejercicioshlc;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;

public class MyService extends Service {

    //Variable String que contiene el nombre de la clase para usarla luego en el LOG
    private static final String TAG = "MyService";

    public MyService() {
    }


    // ------------------------ METODOS -----------------


    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {

        Thread hilo = new Thread(new Runnable() {

            @Override
            public void run() {
                Log.d(TAG, "Primer Servicio iniciado");
                // El servicio se finaliza a sí mismo cuando finaliza su
                // trabajo.
                try {
                    Thread.sleep(15000);
                    Log.d(TAG, "sleep finished");
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }

            }
        });
        hilo.start();

        //El servicio se finaliza a si mismo cuando termina su trabajo
        this.stopSelf();
        return super.onStartCommand(intent, flags, startId);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "Primer Servicio finalizado");
    }

    //Al extender la clase de Service, nos obliga a implementar el metodo onBind(Intent intent) que dejamos a null pues no lo vamos a utilizar
    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }
}
