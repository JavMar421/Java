import java.util.Random;

public class Hilo extends Thread {

    Random r = new Random();
    Boolean bool = false;
    int contador = 0;
    public final int numero;

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
            bool = r.nextBoolean();
            contador++;
            } catch (InterruptedException e) {
              e.printStackTrace();
             }
        }

        Main.listaHilos.add(this);
        System.out.println("Soy el hilo " + numero + " y he dormido " + contador + " veces");

    }


}
