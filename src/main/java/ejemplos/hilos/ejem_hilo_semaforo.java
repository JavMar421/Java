package ejemplos.hilos;
import java.util.Random;
import java.util.concurrent.Semaphore;

public class ejem_hilo_semaforo {

    // Imagina que tenemos una piscina con 4 personas de aforo.
    // Nuestros bañistas son hilos
    // Un bañista se queda un rato en la piscina (Tiempo aleatorio)
    // Cuando uno se va, entra otro
    // Semáforos: se especifica los que deja pasar y cuando tal no entran mas hasta que añadas más, (se pueden ordenar por entrada)

    public static void main(String[] args) {
        for (int i = 0; i<10; i++){
            Banista b = new Banista(String.valueOf(i));
            b.start();
        }
    }
}


class Piscina {
    //semaforo de 10 tickets
    private static final int NUM_ACCESO_SIMULTANEOS = 10;
    static Semaphore semaphore = new Semaphore(NUM_ACCESO_SIMULTANEOS,true);

    static void solicitadAcceso(Banista banista){
        System.out.println("El " + banista.nombre + " quiere entrar");
        try {
            //pide un ticket y lo resta al total
            semaphore.acquire(1);
            banarse(banista);
            //incrementa en total los tickets del semaforo
            semaphore.release(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private static void banarse(Banista banista){
        System.out.println("Comienza el baño el banista " + banista.nombre);
        try {
            Thread.sleep(((new Random().nextInt(4) ) + 1) * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        banista.sucio = false;
        System.out.println("Finaliza el baño el banista " + banista.nombre);

    }
}

class Banista extends Thread {

    boolean sucio = true;
    String nombre;
    public Banista(String nombre){
        this.nombre = nombre;
    }

    @Override
    public void run() {
        Piscina.solicitadAcceso(this);
        System.out.println("El "+ nombre + "ya se ha bañado y está Sucio = " + sucio);
    }
}