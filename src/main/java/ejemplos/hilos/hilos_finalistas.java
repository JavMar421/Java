package ejemplos.hilos;
import java.util.ArrayList;
import java.util.Random;

class hilos_finalistas {
    static ArrayList<hilo_f> listaHilos = new ArrayList<>();

    public static void main(String[] args) {

        ArrayList<hilo_f> listaHilos = new ArrayList<>();

        for (int i = 0; i < 100; i++){
            hilo_f h = new hilo_f(i);
            listaHilos.add(h);
            h.start();
        }

        for (hilo_f h : listaHilos) {
            try {
                h.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(escribirFinalistas());
        System.out.println(escribirSubCampeones());
    }
    public static String escribirFinalistas(){
        String finalistas="Hilos finalistas:\n";

        int max=0;
        for (hilo_f h : listaHilos){
            if(h.contador>max){
                max=h.contador;}
        }
        for (hilo_f h : listaHilos)
            if(h.contador == max){
                finalistas+= "Soy el hilo " + h.numero + " y he dormido " + h.contador + " veces\n";
            }

        return finalistas;
    }

    public static String escribirSubCampeones(){
        String subcampeones="Hilos subcampeones:\n";


        int max=0;
        int subcamp=0;
        for (hilo_f h : listaHilos){
            if(h.contador>max){
                max=h.contador;}
        }
        for (hilo_f h : listaHilos){
            if(h.contador>subcamp && h.contador<max){
                subcamp=h.contador;}
        }
        for (hilo_f h : listaHilos)
            if(h.contador == subcamp){
                subcampeones+="Soy el hilo " + h.numero + " y he dormido " + h.contador + " veces\n";
            }

        return subcampeones;
    }

}

class hilo_f extends Thread {

    Random r = new Random();
    Boolean bool = false;
    int contador = 0;
    public final int numero;

    public long tiempoFinalizacion;


    public hilo_f(int numero){
        this.numero = numero;
    }

    @Override
    public void run() {
        long comienzo = System.currentTimeMillis();
        while (!bool){
            try {
                Thread.sleep(1000);
                bool = r.nextBoolean();
                contador++;
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        hilos_finalistas.listaHilos.add(this);
        System.out.println("Soy el hilo " + numero + " y he dormido " + contador + " veces");

    }


}