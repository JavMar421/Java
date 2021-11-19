package ejemplos.hilos;
import java.util.Random;

    class Hilos1 {

        public static void main(String[] args) {
            System.out.println("Comenzamos a las " + System.currentTimeMillis());

            Hilo1 h1 = new Hilo1("Hilo 1");
            Hilo1 h2 = new Hilo1("Hilo 2");



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

class Hilo1 extends Thread {

    public String nombre;

    public Hilo1(String nombre){
        this.nombre = nombre;
    }

    @Override
    public void run() {
        System.out.println("Soy el hilo " + nombre + " y me voy a dormir.");
        try {
            Thread.sleep(Hilos1.getRandomTimeInMills());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Soy el hilo " + nombre + "y me he despertado.");

    }
}
