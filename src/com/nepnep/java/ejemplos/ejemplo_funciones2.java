package com.nepnep.java.ejemplos;

public class ejemplo_funciones2 {

    public static void main(String[] args) {
        int entero1 = 1;
        float float1 = 0.1f;
        functionEscribirReal(float1);
        System.out.println(functionTextoConEntero(entero1));
        float suma = functionSuma(entero1, float1);
        functionEscribirReal(suma);
    }

    /**
     * Esta función recibe un entero y devuelve un String que contiene ese entero
     * @param myInt número que añadir
     * @return el String junto al número
     */
    public static String functionTextoConEntero(int myInt){
        return "Soy un String y he recibido como parámetro un " + myInt;
    }

    /**
     * Esta función recibe un real lo escribe por pantalla
     * @param myFloat
     */
    public static void functionEscribirReal(float myFloat){
        System.out.println("Soy la functionEscribirReal y he recibido como parámetro un " + myFloat);
    }

    /**
     * Esta función suma un entero y un real y devuelve el resultado
     * @param myInt operando de la suma
     * @param myFloat operando de la suma
     * @return reultado de la suma
     */
    public static float functionSuma(int myInt, float myFloat){
        return myFloat + myInt;
    }
}
