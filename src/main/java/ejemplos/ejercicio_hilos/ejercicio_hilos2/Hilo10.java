package ejemplos.ejercicio_hilos.ejercicio_hilos2;

import java.util.Random;

public class Hilo10 extends Thread {

    Random r = new Random();
    Boolean bool = false;
    int contador = 0;
    public final int numero;

    public long tiempoFinalizacion;


    public Hilo10(int numero){
        this.numero = numero;
    }

    @Override
    public void run() {
        long comienzo = System.currentTimeMillis();
        while (!bool){
        try {
            Thread.sleep(1000);
            bool = r.nextBoolean();
            contador++;
            } catch (InterruptedException e) {
              e.printStackTrace();
             }
        }

        //finalistas.listaHilos.add(this);
        System.out.println("Soy el hilo " + numero + " y he dormido " + contador + " veces");

    }


}
