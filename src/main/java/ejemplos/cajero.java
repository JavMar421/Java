package ejemplos;

public class cajero extends Thread {
    private static int total;
    public static synchronized String cobrar(int hilo) throws InterruptedException {
            total += hilo;

        return "El dinero recaudado es "+ total;
    }
    public static String Resultado() {
        return "Dinero recaudado: "+ total;
    }
}