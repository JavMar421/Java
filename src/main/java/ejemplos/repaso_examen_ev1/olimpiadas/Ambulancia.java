package ejemplos.repaso_examen_ev1.olimpiadas;

public class Ambulancia extends Thread {

    private static boolean ambulanciaActiva = false;

    Corredor corredor;

    public Ambulancia(Corredor corredor){
        this.corredor = corredor;
    }

    @Override
    public void run() {
        try {
            sleep(5000);
            corredor.curar();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        ambulanciaActiva = false;
    }

    public static synchronized boolean estaAmbulanciaActiva(){
        if (!ambulanciaActiva){
            ambulanciaActiva= true;
            return false;
        }
        return true;
    }

    public static void atenderHerido(Corredor corredor) {
        if (!estaAmbulanciaActiva()){
            Ambulancia ambulancia = new Ambulancia(corredor);
            ambulancia.start();
        } else {
            System.out.println("La ambulacia está ocupada y no puede atender a " + corredor.nombre);
            System.out.println(corredor.pais.nombre + " ha sido descalificado");
        }
    }
}
