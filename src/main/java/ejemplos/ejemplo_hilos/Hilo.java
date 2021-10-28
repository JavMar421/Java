package ejemplos.ejemplo_hilos;

public class Hilo extends Thread {

    public String nombre;

    public Hilo(String nombre){
        this.nombre = nombre;
    }

    @Override
    public void run() {
        System.out.println("Soy el hilo " + nombre + " y me voy a dormir.");
        try {
            Thread.sleep(Main.getRandomTimeInMills());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Soy el hilo " + nombre + "y me he despertado.");

    }
}
