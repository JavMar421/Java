package ejemplos.ejercicio_hilos;

import java.util.ArrayList;
import java.util.Random;

class finalistas {
    static ArrayList<Hilotal> listaHilos = new ArrayList<>();

    public static void main(String[] args) {

        ArrayList<Hilotal> listaHilotals = new ArrayList<>();

        for (int i = 0; i < 10; i++){
            Hilotal h = new Hilotal(i);
            listaHilotals.add(h);
            h.start();
        }

        for (Hilotal h : listaHilotals) {
            try {
                h.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        //System.out.println(escribirFinalistas());
        //System.out.println(escribirSubCampeones());
    }
    public static String escribirFinalistas(){
        String finalistas="Hilos finalistas:\n";

        int max=0;
        for (Hilotal h : listaHilos){
            if(h.contador>max){
                max=h.contador;}
        }
        for (Hilotal h : listaHilos)
            if(h.contador == max){
                finalistas+= "Soy el hilo " + h.numero + " y he dormido " + h.contador + " veces\n";
            }

        return finalistas;
    }

    public static String escribirSubCampeones(){
        String subcampeones="Hilos subcampeones:\n";


        int max=0;
        int subcamp=0;
        for (Hilotal h : listaHilos){
            if(h.contador>max){
                max=h.contador;}
        }
        for (Hilotal h : listaHilos){
            if(h.contador>subcamp && h.contador<max){
                subcamp=h.contador;}
        }
        for (Hilotal h : listaHilos)
            if(h.contador == subcamp){
                subcampeones+="Soy el hilo " + h.numero + " y he dormido " + h.contador + " veces\n";
            }

        return subcampeones;
    }

}

