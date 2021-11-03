import teoria.Array;

import java.util.Random;
import java.util.ArrayList;
public class Hilo extends Thread {

    Random r = new Random(100);
    Random i = new Random(1000);
    Random precio = new Random(100);
    int porcen =100;
    boolean bool = false;
    int contador = 0;
    public final int numero;
    ArrayList Lista = new ArrayList();
    public long tiempoFinalizacion;


    public Hilo(int numero){
        this.numero = numero;
    }

    @Override
    public void run() {
        long comienzo = System.currentTimeMillis();
        while (!bool){
            try {
                Thread.sleep(1000);
                porcen-=1;
                int num = r.nextInt();
                if (num<porcen)
                {bool=false;
                    String item="item"+i.nextInt();
                Lista.add(precio.nextInt(),item);
                }

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        Main.listaHilos.add(this);
        System.out.println("Soy el hilo " + numero + " y he dormido " + contador + " veces");

    }


}

