package ejemplos.repaso_examen_ev1.warzone;

import java.util.Random;
import java.util.concurrent.Semaphore;

public class CampoDeBatalla {

    private static final Semaphore semaphore = new Semaphore(10, false);

    private static boolean hayPrimero = false;
    private static int plazasEnPrimeraRonda = 10;
    private static int campeonesPrimeraRonda = 5;

    public static void addParticipante(Jugador jugador) {
        try {
            semaphore.acquire();
            System.out.println("--> "+jugador.getName() + " ha entrado partida");
            calcularPrimeroRonda(jugador);

            Random r = new Random();
            int tiempoDeEspera = r.nextInt(4000) + 1000;
            System.out.println(jugador.getName() + " dormirá por " + tiempoDeEspera);
            Thread.sleep(tiempoDeEspera);
            calcularPrimeroEnLlegar(jugador);
            calcularSiEsDeLos5Primeros(jugador);

            calcularPuntuacion(jugador);
            semaphore.release();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private static synchronized void calcularSiEsDeLos5Primeros(Jugador jugador) {
        if (campeonesPrimeraRonda > 0) {
            campeonesPrimeraRonda--;
            jugador.setEsCampeonPrimeraRonda(true);
        }
    }

    private static void calcularPuntuacion(Jugador jugador) {
        Random r = new Random();
        int puntuacion = r.nextInt();


        if (jugador.isEsPrimeraRonda()) {
            if (jugador.isEsCampeonPrimeraRonda()) {
                if (jugador.isEsPrimero()) {
                    puntuacion *= 2;
                }
                jugador.setPuntacion(puntuacion);
            }
            //else {
            // la puntuación de este jugador se queda en 0
            //}
        } else {
            jugador.setPuntacion(puntuacion);
        }
    }


    private static synchronized void calcularPrimeroRonda(Jugador jugador) {
        if (plazasEnPrimeraRonda > 0) {
            plazasEnPrimeraRonda--;
            jugador.setEsPrimeraRonda(true);
        }
    }


    private static synchronized void calcularPrimeroEnLlegar(Jugador jugador) {
        if (!hayPrimero) {
            System.out.println(jugador.getName() + " es el primero y lleva el bonus");
            jugador.setEsPrimero(true);
            hayPrimero = true;
        }
    }

}