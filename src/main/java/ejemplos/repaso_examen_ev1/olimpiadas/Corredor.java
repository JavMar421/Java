package ejemplos.repaso_examen_ev1.olimpiadas;

import java.util.Random;

public class Corredor extends Thread {

    Pais pais;
    String nombre;
    Random r = new Random();

    public Corredor(Pais pais, String nombre) {
        this.nombre = pais.nombre + nombre;
        this.pais = pais;
    }

    @Override
    public void run() {
        System.out.println(nombre + " empieza a correr");

        int tiempoCarrera = r.nextInt(4000) +1000;
        try {
            sleep(tiempoCarrera);
            if (superarObstaculo()){
                System.out.println(nombre +" supera el obstaculo");
                pais.notificarExito();
            } else {
                System.out.println(nombre + " no supera el obstaculo. Llamamos a la ambulancia");
                Ambulancia.atenderHerido(this);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private boolean superarObstaculo(){
        return r.nextInt(100) < 90;
    }

    public void curar(){
        System.out.println("El corredor "+ nombre +" se ha curado");
        pais.notificarExito();
    }
}