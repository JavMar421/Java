package teoria;

import java.util.Random;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicInteger;

public class Main {
    static final int numJug=10;
    static int cola=0;


    static AtomicInteger entero2 = new AtomicInteger(0);
    static AtomicInteger entero = new AtomicInteger(0);
    static Semaphore s = new Semaphore(0);

    public static void main(String[] args) {
        for (int i = 0; i < 20; i++) {
            Hilos hilo = new Hilos(0, 0);
            hilo.setName("Jugador "+ i );
            hilo.start();
        }
    }
}



class Hilos extends Thread {
    int suerte;
    int jugadorescola;

    public Hilos(int suerte, int jugadorescola) {
        this.suerte = suerte;
        this.jugadorescola=jugadorescola;
    }
    @Override
    public void run() {
        Pruebas.prueba1(this);
    }
}



class Pruebas{
    public static void prueba1(Hilos hilo){
        try {
            Thread.sleep((new Random().nextInt(3) +1)  * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        hilo.suerte = (new Random().nextInt(10) );
        if (hilo.suerte==0){
            System.out.println("El " +hilo.getName()+" ha sido descalificado en la PRUEBA 1\n");
            return;
        }
        System.out.println("El "+ hilo.getName()+" ha completado la prueba1 \n");
        prueba2(hilo);
    }

    public static void prueba2(Hilos hilo){

        Main.entero.getAndIncrement();
        if (Main.entero.get() <= 10){
            System.out.println("El "+ hilo.getName()+" ha llegado a tiempo y pasa a la prueba 2\n");
            prueba2Real(hilo);
        }
        else{
            System.out.println("El "+hilo.getName()+" no ha completado a tiempo la prueba1 y sera descalificado\n");
        }
    }
    public static void prueba2Real(Hilos hilo){
        System.out.println("El  " + hilo.getName() + " está en cola para empezar\n");
        Main.cola++;
        try {
            if (Main.cola == Main.numJug)
                Main.s.release(Main.numJug);
            Main.s.acquire();
            Thread.sleep((new Random().nextInt(3) +1)  * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        hilo.suerte = (new Random().nextInt(10) );
        if (hilo.suerte==0){
            System.out.println("El " +hilo.getName()+" ha sido descalificado en la PRUEBA 2\n");
            return;
        }
        System.out.println("El "+ hilo.getName()+" ha completado la prueba2 \n");
        ganador(hilo);
    }

    public static void ganador(Hilos hilo){
        Main.entero2.getAndIncrement();
        if (Main.entero2.get() == 1){
            System.out.println("Enhorabuena, el "+hilo.getName()+" ha ganado la partida!!!!!!!!!!!!\n");
            return;
        }
        else{
            if (Main.entero2.get() <= 5){
                System.out.println("El " + hilo.getName()+ " ha terminado en "+Main.entero2.get()+ "ª lugar\n");
                return;
            }
        }
        System.out.println("El "+hilo.getName()+" no ha llegado a tiempo y ha sido descalificado de la final\n");
    }
}