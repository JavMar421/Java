package ejemplos.ejercicios_hilos;
import java.util.Random;
import java.util.ArrayList;

class Main {


    static ArrayList<Hilo> listaHilosOrdenada = new ArrayList<>();


    public static void main(String[] args) {

       ArrayList<Hilo> listaHilos = new ArrayList<>();
        //Se crean los hilos
        for (int i = 0; i < 10; i++){
            Hilo h = new Hilo(i);
            //start
            h.start();
           listaHilos.add(h);
        }
        // cada hilo dice por pantalla lo que ha dormido
        for (Hilo h : listaHilos) {
            try {
                //join
                h.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        //hilos ordenados
        mostraListado();
    }

    private static void mostraListado() {
        for (Hilo hilo : listaHilosOrdenada){
            System.out.println("El hilo " + hilo.numero + " ha finalizado en el milisegundo " + hilo.tiempoFinalizacion);
        }
    }

}


class Hilo extends Thread {

    Random r = new Random();

    public final int numero;

    public long tiempoFinalizacion;


    public Hilo(int numero){
        this.numero = numero;
    }

    @Override
    public void run() {
        //se guarda el tiempo de inicio
        long comienzo = System.currentTimeMillis();
        try {
            //duerme r entre 0 y 3000
            Thread.sleep(r.nextInt(3001));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //se guarda el tiempo de fin
        tiempoFinalizacion = System.currentTimeMillis();
        //se guarda ahora  (para que se ordenen por ejecución)
        Main.listaHilosOrdenada.add(this);
        //total tardado:
        long tiempoDormido = tiempoFinalizacion - comienzo;
        System.out.println("Soy el hilo nº " + numero + " y he dormido por " + tiempoDormido + " milisegundos");
    }


}
