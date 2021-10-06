package ejemplos.ejemplo_basicos;

public class ejemplo_basico3 {

    public static void main(String[] args) {
        operationsBooleans();
        operationsChars();
        operationsInt();
        operationsFloat();
        otherRelationalOperations();
    }


    public static void operationsBooleans(){
        boolean myBoolean1 = true;
        boolean myBoolean2 = false;
        // El operador ! significa la negación. Si tienes true, y aplicas !, obtendrás false. Funciona igual a la inversa.
        boolean myBoolean3 = !myBoolean1;
        System.out.println("El valor de myBoolean3 es: " + myBoolean3);
        // El operador & significa la "y". Solo si todos los elementos son true, el resultado final será true.
        boolean myBoolean4 = myBoolean1 & myBoolean2;
        System.out.println("El valor de myBoolean4 es: " + myBoolean4);
        // El operador | significa la "o". Si al menos un elemento es true, el resultado final será true.
        boolean myBoolean5 = myBoolean1 | myBoolean2;
        System.out.println("El valor de myBoolean5 es: " + myBoolean5);

        // Consejo: El operador || y el && significan que parará de evaluar la expresión en el momento que se cumpla.
    }

    public static void operationsChars(){
        char myChar1 = 'a';
        // El operador ++ significa incremento, devolviendo la siguiente letra representada en el estandar UTF-16.
        myChar1++;
        System.out.println("El valor myChar1 es: " + myChar1);

        char myChar2 = 'z';
        // El operador -- significa incremento, devolviendo la letra anterior representada en el estandar UTF-16.
        myChar2--;
        System.out.println("El valor myChar2 es: " + myChar2);
    }

    public static void operationsInt(){
        int myInt1 = 0;
        int myInt2 = myInt1 + 1; // myInt2 toma el valor 1
        System.out.println("El valor myInt2 es: " + myInt2);
        int myInt3 = 3 - myInt2; // myInt3 toma el valor 2
        System.out.println("El valor myInt3 es: " + myInt3);
        int myInt4 = myInt3 * myInt3; // myInt4 toma el valor 4
        System.out.println("El valor myInt4 es: " + myInt4);
        int myInt5 = myInt4 / 2; // myInt5 toma el valor 2
        System.out.println("El valor myInt5 es: " + myInt5);
        int myInt6 = myInt4 % 2; // myInt6 toma el valor 0
        System.out.println("El valor myInt6 es: " + myInt6);

        System.out.println("Es myInt6 mayor que myInt5: " + (myInt6 > myInt5));
        System.out.println("Es myInt6 mayor que 0: " + (myInt6 > 0));
        System.out.println("Es myInt5 mayor o igual que 0: " + (myInt6 >= 0));
    }

    public static void operationsFloat(){
        float myFloat1 = 0;
        float myFloat2 = myFloat1 + 1; // myFloat2 toma el valor 1
        System.out.println("El valor myFloat2 es: " + myFloat2);
        float myFloat3 = 3 - myFloat2; // myFloat3 toma el valor 2
        System.out.println("El valor myFloat3 es: " + myFloat3);
        float myFloat4 = myFloat3 * myFloat3 + 1; // myFloat4 toma el valor 5
        System.out.println("El valor myFloat4 es: " + myFloat4);
        float myFloat5 = myFloat4 / 2; // myFloat5 toma el valor 2,5
        System.out.println("El valor myFloat5 es: " + myFloat5);
        float myFloat6 = myFloat4 % 2; // myFloat6 toma el valor 1
        System.out.println("El valor myFloat6 es: " + myFloat6);

        System.out.println("Es myFloat6 mayor que myFloat5: " + (myFloat6 > myFloat5));
        System.out.println("Es myFloat6 mayor que 0: " + (myFloat6 > 0));
        System.out.println("Es myFloat5 mayor o igual que 0: " + (myFloat6 >= 0));
    }


    private static void otherRelationalOperations() {
        System.out.println("¿El primer número es mayor que el segundo número? " + (2 > 1.5f));
        System.out.println("¿El primer número es igual que el segundo número? " + (2 == 2f));
        System.out.println("¿El primer número es diferente que el segundo número?" + (2 != 2f));
    }

}
