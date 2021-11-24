package ejemplos.ejercicios_hilos;

import java.util.ArrayList;
import java.util.Random;

class ejer_hilos_cajero {

    static ArrayList<cliente> clilistaOrdenada = new ArrayList<>() {
    };

    public static void main(String args[]) throws InterruptedException {
        ArrayList<cliente> clilista = new ArrayList<>();
        int total=0;
        for (int i = 0; i < 100; i++) {
            cliente h = new cliente(i);
            h.start();
            clilista.add(h);
        }
        for (cliente h : clilista) {
            try {
                h.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        for (cliente hilo: clilistaOrdenada) {
             total += hilo.dinero;
        }
        System.out.println(cajero.Resultado());
    }
}

class cajero extends Thread {
    private static int total;
    public static synchronized String cobrar(int hilo) throws InterruptedException {
        total += hilo;

        return "El dinero recaudado es "+ total;
    }
    public static String Resultado() {
        return "Dinero recaudado: "+ total;
    }
}

//hilo
class cliente extends Thread {

    Random r = new Random();
    int compras = 0;
    int i;
    String item;
    int dinero;
    final int numero;


    public cliente(int numero) {
        this.numero = numero;
        dinero = dinero;
    }



    @Override
    public void run() {
        try {
            do {
                Thread.sleep(r.nextInt(1000));
                i = r.nextInt(9)+1;
                item = "Item Nº" + r.nextInt(1000000);
                dinero += r.nextInt(99) + 1;
                compras += 1;
            } while (i >= compras);
            cajero.cobrar(dinero);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        ejer_hilos_cajero.clilistaOrdenada.add(this);
    }

}