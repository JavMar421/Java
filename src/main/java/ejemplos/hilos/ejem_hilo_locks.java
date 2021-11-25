package ejemplos.hilos;

import java.util.concurrent.locks.ReentrantLock;
import java.util.Random;

class ejem_locks {
    //tryLock: intenta acceder al lock y si no puede da boolean False
    static ReentrantLock lock = new ReentrantLock();

    public static void main(String[] args) {
        for (int i = 0; i <15; i++) {
            Hilo l = new Hilo();
            l.start();
        }

    }

    public static void atenderAlHilo(Hilo hilo){
        try {
            System.out.println("Comienzo " + hilo.id);
            //Locks: cerrado el recorrido hasta que unlock
            lock.lock();

            System.out.println("Cierro la puerta " + hilo.id);
            Thread.sleep(1000);
            System.out.println("Abro la puerta " + hilo.id);
            //Abre
            lock.unlock();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
    public static class Hilo extends Thread {

        Random r = new Random();
        int id = r.nextInt();


        @Override
        public void run() {
            ejem_locks.atenderAlHilo(this);
        }

    }
}
//El trylock y tal
/*

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
 */


