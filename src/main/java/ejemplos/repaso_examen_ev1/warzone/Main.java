package ejemplos.repaso_examen_ev1.warzone;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        ArrayList<Jugador> list = new ArrayList<>();
        System.out.println("-----Jugadores entran en Partida-----");
        for (int i = 0; i < 15; i++) {
            Jugador j = new Jugador();
            j.setName(""+i);
            j.start();
            list.add(j);
        }

        for (Jugador j : list){
            try {
                j.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("-----Ronda Final-----");
        int num=0;
        for (Jugador j : list){
            System.out.println(j.getName() + " ha sacado un " + j.getPuntacion());

            if (j.getPuntacion()>num)
            num=j.getPuntacion();

        }
        for (Jugador j : list)
            if(j.getPuntacion() == num){
                System.out.println("===============|    "+j.getName() + " es el Ganador    |===============");
            }



    }
}
