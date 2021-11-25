package ejemplos.repaso_examen_ev1.warzone;
public class Jugador extends Thread {

    private boolean esPrimero = false;
    private boolean esPrimeraRonda = false;
    private boolean esCampeonPrimeraRonda = false;

    private int puntacion = 0;

    @Override
    public void run() {
        System.out.println("jugador "+getName() + " buscando partida");
        CampoDeBatalla.addParticipante(this);
    }

    public void setEsPrimero(boolean esPrimero) {
        this.esPrimero = esPrimero;
    }

    public void setEsPrimeraRonda(boolean esPrimeraRonda) {
        this.esPrimeraRonda = esPrimeraRonda;
    }

    public boolean isEsPrimeraRonda() {
        return esPrimeraRonda;
    }

    public boolean isEsPrimero() {
        return esPrimero;
    }

    public int getPuntacion() {
        return puntacion;
    }

    public void setPuntacion(int puntacion) {
        this.puntacion = puntacion;
    }

    public boolean isEsCampeonPrimeraRonda() {
        return esCampeonPrimeraRonda;
    }

    public void setEsCampeonPrimeraRonda(boolean esCampeonPrimeraRonda) {
        this.esCampeonPrimeraRonda = esCampeonPrimeraRonda;
    }
}
