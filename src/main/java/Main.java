
import java.util.ArrayList;

public class main {

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
