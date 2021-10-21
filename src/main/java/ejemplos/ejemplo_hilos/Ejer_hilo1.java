package ejemplos.ejemplo_hilos;

import java.util.ArrayList;

public class Ejer_hilo1 {


    static ArrayList<Hilo> listaHilosOrdenada = new ArrayList<>();


    public static void ejer_hilo1(String[] args) {

        ArrayList<Hilo> listaHilos = new ArrayList<>();

        for (int i = 0; i < 100; i++){
            Hilo h = new Hilo(i);
            h.start();
            listaHilos.add(h);
        }

        for (Hilo h : listaHilos) {
            try {
                h.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        mostraListado();
    }

    private static void mostraListado() {
        for (Hilo hilo : listaHilosOrdenada){
            System.out.println("El hilo " + hilo.numero + " ha finalizado en el milisegundo " + hilo.tiempoFinalizacion);
        }
    }

}