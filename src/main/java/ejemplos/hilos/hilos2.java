package ejemplos.hilos;
import java.util.Random;
import java.util.ArrayList;

public class hilos2 {


    static ArrayList<Hilo2> listaHilosOrdenada = new ArrayList<>();


    public static void main(String[] args) {

        ArrayList<Hilo2> listaHilos = new ArrayList<>();

        for (int i = 0; i < 100; i++){
            Hilo2 h = new Hilo2(i);
            h.start();
            listaHilos.add(h);
        }

        for (Hilo2 h : listaHilos) {
            try {
                h.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        mostraListado();
    }

    private static void mostraListado() {
        for (Hilo2 hilo : listaHilosOrdenada){
            System.out.println("El hilo " + hilo.numero + " ha finalizado en el milisegundo " + hilo.tiempoFinalizacion);
        }
    }

}



class Hilo2 extends Thread {

    Random r = new Random();

    public final int numero;

    public long tiempoFinalizacion;


    public Hilo2(int numero){
        this.numero = numero;
    }

    @Override
    public void run() {
        long comienzo = System.currentTimeMillis();
        try {
            Thread.sleep(r.nextInt(3000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        tiempoFinalizacion = System.currentTimeMillis();
        hilos2.listaHilosOrdenada.add(this);
        long tiempoDormido = tiempoFinalizacion - comienzo;
        System.out.println("Soy el hilo nº " + numero + " y he dormido por " + tiempoDormido + " milisegundos");
    }


}