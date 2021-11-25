package ejemplos.hilos;

import java.util.ArrayList;
import java.util.concurrent.locks.ReentrantLock;

public class ejem_trylock {


    public static void main(String[] args) {
        ArrayList<Jugador> listaJugadores = new ArrayList<>();
        ReentrantLock lockBanio1 = new ReentrantLock();
        ReentrantLock lockBanio2 = new ReentrantLock();

        for (int i = 0; i < 6; i++){
            listaJugadores.add(new Jugador("nombre = " + i + " ", lockBanio1, lockBanio2));
        }

        for (int i = 0; i < listaJugadores.size(); i++){
            listaJugadores.get(i).start();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}


class Jugador extends Thread {

    private String nombre;
    private boolean pisEncima = false;
    //el lock
    ReentrantLock lockBanio1;
    ReentrantLock lockBanio2;

    Jugador(String nombre, ReentrantLock lockBanio1, ReentrantLock lockBanio2){
        this.nombre = nombre;
        this.lockBanio1 = lockBanio1;
        this.lockBanio2 = lockBanio2;
    }

    @Override
    public void run() {
        //si lock-true hace tal si no si lock2-true hace tal si no cual
        if (lockBanio1.tryLock()) {
            System.out.println("El jugador " + nombre + "ha entrado al baño 1");
            hacerPisEnBanio();
            System.out.println("El jugador " + nombre + "ha terminado con el baño 1");
            lockBanio1.unlock();
        } else {
            if (lockBanio2.tryLock()) {
                System.out.println("El jugador " + nombre + "ha entrado al baño 2");
                hacerPisEnBanio();
                System.out.println("El jugador " + nombre + "ha terminado con el baño 2");
                lockBanio2.unlock();
            } else {
                System.out.println("El jugador " + nombre + "no ha encontrado baño");
                hacerPisEncima();
                System.out.println("El jugador " + nombre + "se ha hecho pis encima");
            }
        }
    }

    public void hacerPisEnBanio(){
        try {
            Thread.sleep(3000);
            pisEncima = false;
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void hacerPisEncima(){
        try {
            Thread.sleep(3000);
            pisEncima = true;
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
