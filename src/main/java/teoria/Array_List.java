package teoria;

import java.util.ArrayList;

public class Array_List {

    public static void main(String[] args) {
        java.util.ArrayList<Integer> listaNumeros = new java.util.ArrayList<>();
        int num=1;
        listaNumeros.add(num);
        listaNumeros.add(++num);
        //anadirNumerosConsecutivos(listaNumeros, 3);
        mostrarLista(listaNumeros);
        //eliminarNumerosPorPosicion(listaNumeros, 0);
        //mostrarLista(listaNumeros);
    }

    private static void anadirNumerosConsecutivos(java.util.ArrayList<Integer> listaNumeros, int numero){
        listaNumeros.add(numero);
        listaNumeros.add(++numero);
        listaNumeros.add(++numero);
    }

    private static void eliminarNumerosPorPosicion(java.util.ArrayList<Integer> listaNumeros, int posicion){
        listaNumeros.remove(posicion);
    }

    private static void mostrarLista(java.util.ArrayList<Integer> listaNumeros){
        System.out.println("---- Mostrando la lista ----");
        for (int i = 0; i < listaNumeros.size(); i++){
            System.out.println("En la posicion " + i + " hay un " + listaNumeros.get(i));
        }
    }
}
