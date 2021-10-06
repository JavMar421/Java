package ejemplos.ejemplo_basicos;

public class ejemplo_basico2 {

    public static void main(String[] args) {
        leaningBooleans();
        learningChars();
        learningInt();
        learningFloat();
    }


    public static void leaningBooleans(){
        boolean myBoolean = true;
        System.out.print("El valor es: ");
        System.out.println(myBoolean);
        myBoolean = false;
        System.out.print("El valor ahora es: ");
        System.out.println(myBoolean);
    }

    public static void learningChars(){
        char myChar = 'a';
        System.out.print("El valor es: ");
        System.out.println(myChar);
        myChar = 'b';
        System.out.print("El valor ahora es: ");
        System.out.println(myChar);
    }

    public static void learningInt(){
        int myInt = 0;
        System.out.print("El valor es: ");
        System.out.println(myInt);
        myInt = 100;
        System.out.print("El valor ahora es: ");
        System.out.println(myInt);
    }

    public static void learningFloat(){
        float myFloat = 0.1f;
        System.out.print("El valor es: ");
        System.out.println(myFloat);
        myFloat = 100.09f;
        System.out.print("El valor ahora es: ");
        System.out.println(myFloat);
    }
}
