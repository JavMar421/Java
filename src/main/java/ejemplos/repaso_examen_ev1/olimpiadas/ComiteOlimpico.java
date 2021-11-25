package ejemplos.repaso_examen_ev1.olimpiadas;

public class ComiteOlimpico {

    public ComiteOlimpico(){
        Pais p1 = new Pais("España", this);
        Pais p2 = new Pais("Francia", this);
        Pais p3 = new Pais("Alemania", this);
        p1.comenzarCarrera();
        p2.comenzarCarrera();
        p3.comenzarCarrera();
    }

    Pais paisGanador;

    public synchronized void notificarFinCarrera(Pais pais){
        if (paisGanador == null) {
            System.out.println("El país " + pais.nombre + " ha sido campeón");
            paisGanador = pais;
        } else {
            System.out.println("El país " + pais.nombre + " terminado como pededor");
        }
    }
}
