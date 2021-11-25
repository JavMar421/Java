package ejemplos.repaso_examen_ev1.olimpiadas;

import java.util.ArrayList;

public class Pais {

    String nombre;
    ArrayList<Corredor> listaCorredores = new ArrayList<>();
    Integer corredorEnCurso;
    ComiteOlimpico manager;

    public Pais(String nombre, ComiteOlimpico manager) {
        this.nombre = nombre;
        corredorEnCurso = 0;
        listaCorredores.add(new Corredor(this, "1"));
        listaCorredores.add(new Corredor(this, "2"));
        listaCorredores.add(new Corredor(this, "3"));
        listaCorredores.add(new Corredor(this, "4"));
        this.manager = manager;
    }

    public void comenzarCarrera(){
        corredorEnCurso = 0;
        listaCorredores.get(corredorEnCurso).start();
    }

    public void notificarExito(){
        corredorEnCurso++;
        if (!soyUltimo()) {
            listaCorredores.get(corredorEnCurso).start();
        } else {
            manager.notificarFinCarrera(this);
        }
    }

    boolean soyUltimo() {
        return corredorEnCurso == listaCorredores.size();
    }
}
