package ejemplos;

public class ejemplo_funciones {
    public static void main(String[] args) {
        function1();
        System.out.println("Esta línea se ejecuta en tercer lugar");
        function3();
    }

    public static void function1(){
        System.out.println("Esta línea se ejecuta en primer lugar");
        function2();
    }

    public static void function2(){
        System.out.println("Esta línea se ejecuta en segundo lugar");
    }

    public static void function3(){
        System.out.println("Esta línea se ejecuta en cuarto lugar");
    }

}

