import java.util.ArrayList;
import java.util.Random;
import java.util.TreeMap;

public class hilo extends Thread {
    public String nombre;

    public hilo(String nombre){
        this.nombre = nombre;
    }

    @Override
    public void run() {
    int i=hilos.getRandomTimeInMills();

        try {

            Thread.sleep(i);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Soy el hilo " + nombre + " he dormido por " +i+ " milisegundos");
    }

}
