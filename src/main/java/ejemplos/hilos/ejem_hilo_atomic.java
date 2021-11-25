package ejemplos.hilos;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

class ejer_hilo_atomic {

    public static void main(String[] args) {
        EjemploAtomicos a = new EjemploAtomicos();
    }


}
class Persona {

    String nombre;
    String apellido;

    Persona(String nombre, String apellido) {
        this.apellido = apellido;
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                '}';
    }

}

class EjemploAtomicos {
    //Atomic Variables: variables que no pueden tener mismo valor solo el inicializado
    //usar compareAndExchange para que no entren 2 hilos a la vez
    AtomicBoolean aBoolean = new AtomicBoolean(true);
    AtomicInteger aInteger = new AtomicInteger(1);
    AtomicLong aLong = new AtomicLong(1);
    AtomicReference<String> bString = new AtomicReference<>("Hola");
    AtomicReference<Persona> bPersona = new AtomicReference<>(new Persona("A", "B"));

    boolean nBoolean = true;
    int nInt = 1;
    long nLong = 1;
    String nString = "Hola";
    Persona nPersona = new Persona("A", "B");


    EjemploAtomicos(){
        probarBoolean();
        probarInt();
        probarLong();
        probarString();
        probarPersona();
    }

    private void probarBoolean() {
        // Mal
        if (nBoolean) {
            nBoolean = false;
        }
        // Bien
        aBoolean.compareAndExchange(true, false);
        System.out.println(aBoolean.get());
    }

    private void probarInt() {
        // Mal
        if (nInt == 1) {
            nInt = 6;
        }
        // Bien
        aInteger.compareAndExchange(1, 6);
        System.out.println(aInteger.get());
    }

    private void probarLong() {
        // Mal
        if (nLong == 1) {
            nLong = 9;
        }
        // Bien
        aLong.compareAndExchange(1, 9);
        System.out.println(aLong.get());
    }

    private void probarString() {
        // Mal
        if (nString.contentEquals("Hola")) {
            nString = "Adios";
        }
        // Bien
        bString.compareAndExchange("Hola", "Adios");
        System.out.println(bString.get());
    }

    private void probarPersona() {
        // Mal
        if (nPersona.nombre.contentEquals("A") && nPersona.apellido.contentEquals("B")) {
            nPersona = new Persona("C", "D");
        }
        // Bien
        bPersona.compareAndExchange(new Persona("A","B"), new Persona("C","D"));
        System.out.println(bPersona.get());

    }
}

