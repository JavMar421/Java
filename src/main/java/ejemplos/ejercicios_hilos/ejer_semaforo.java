package ejemplos.ejercicios_hilos;

import java.util.Random;
import java.util.concurrent.Semaphore;

//Main
class ejemplo_semaforo {

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++){
            Luchador l = new Luchador("Luchador " + i);
            l.start();
        }
    }
}

//ejemplos.Luchador
class Luchador extends Thread {
    String nombre="";

    public Luchador(String nombre){
        this.nombre=nombre;
    }
    @Override
    public void run() {
        Cuadrilatero.AddParticipante(this);
    }
}

//ejemplos.Cuadrilatero
class Cuadrilatero {
    static String vencedor = null;
    private static final int num = 1;
    //el semaforo(tickets,ordenacion)
    static Semaphore semaphore = new Semaphore(num, false);

    static void AddParticipante(Luchador luchador) {
        Luchador luchador1;
        try {
            //pide un ticket total-1
            semaphore.acquire(1);
            luchador1 = luchador;
            lucha(luchador1);
            //incrementa en x el total de tickets
            semaphore.release(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }

    static void lucha(Luchador luchador) throws InterruptedException {

        System.out.println(luchador.nombre + " entra");
        if (vencedor == null) {
            vencedor = luchador.nombre;
        } else {
            if (new Random().nextBoolean()) {
                System.out.println(vencedor + " a perdido");
                vencedor = luchador.nombre;
                System.out.println("Gana " + vencedor);
            } else {
                System.out.println(luchador.nombre + " a perdido");
                System.out.println("Gana " + vencedor);
            }
        }
    }
}