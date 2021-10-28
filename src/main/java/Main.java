import java.util.ArrayList;


public class Main {
    static ArrayList<Hilo> listaHilos = new ArrayList<>();

    public static void main(String[] args) {

        ArrayList<Hilo> listaHilos = new ArrayList<>();

        for (int i = 0; i < 100; i++){
            Hilo h = new Hilo(i);
            listaHilos.add(h);
            h.start();
        }

        for (Hilo h : listaHilos) {
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
            for (Hilo h : listaHilos){
                if(h.contador>max){
                    max=h.contador;}
            }
        for (Hilo h : listaHilos)
            if(h.contador == max){
                finalistas+= "Soy el hilo " + h.numero + " y he dormido " + h.contador + " veces\n";
            }

        return finalistas;
    }

    public static String escribirSubCampeones(){
        String subcampeones="Hilos subcampeones:\n";


        int max=0;
        int subcamp=0;
        for (Hilo h : listaHilos){
            if(h.contador>max){
                max=h.contador;}
        }
        for (Hilo h : listaHilos){
            if(h.contador>subcamp && h.contador<max){
                subcamp=h.contador;}
        }
        for (Hilo h : listaHilos)
            if(h.contador == subcamp){
                subcampeones+="Soy el hilo " + h.numero + " y he dormido " + h.contador + " veces\n";
            }

        return subcampeones;
    }

}
