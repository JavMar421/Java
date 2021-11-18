package ejemplos.ejemplo_hilos;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        System.out.println("Comenzamos a las " + System.currentTimeMillis());

        Hilo h1 = new Hilo("Hilo 1");
        Hilo h2 = new Hilo("Hilo 2");



        try {
            h1.start();
            h1.join();
            h2.start();
            h2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        System.out.println("Terminamos a las " + System.currentTimeMillis());
    }

    public static Integer getRandomTimeInMills() {
        Random r = new Random();
        return (r.nextInt(3) + 2) * 1000;
    }

}
