package ejemplos.hilos;
import java.util.Random;

    class ejem_hilo_join {

        public static void main(String[] args) throws InterruptedException {
            System.out.println("Comenzamos a las " + System.currentTimeMillis());

            HilosJoin h1 = new HilosJoin("Hilo 1");
            HilosJoin h2 = new HilosJoin("Hilo 2");



            //se puede quitar el try catch poniendo el throw InterruptedException
            //join sirve para ordenar entradas de hilos
                h1.start();
                h1.join();
                h2.start();
                h2.join();






            System.out.println("Terminamos a las " + System.currentTimeMillis());
        }

        public static Integer getRandomTimeInMills() {
            Random r = new Random();
            return (r.nextInt(3) + 2) * 1000;
        }

    }

class HilosJoin extends Thread {

    public String nombre;

    public HilosJoin(String nombre){
        this.nombre = nombre;
    }

    @Override
    public void run() {
        System.out.println("Soy el hilo " + nombre + " y me voy a dormir.");
        try {
            Thread.sleep(ejem_hilo_join.getRandomTimeInMills());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Soy el hilo " + nombre + " y me he despertado.");

    }
}
