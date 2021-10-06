package teoria;

public class Cadenas {
    //(STRING ARGS[])
    public static void main(String[] args){
        String cad1="Peepo";
        //IMPRIMIR CADENA: System.out.println(cad1);
        //IMPRIMIR sin SALTO DE LINEA: System.out.print(cad1);

        //LONGITUD: cad.length()
        System.out.println("Longitud de la cadena: "+cad1+ " " +cad1.length());
        //Caracter que esta en la posicion () de la Cadena (0 es el primero): cad1.charAt(0)
        System.out.println(cad1+ " es " +cad1.charAt(0));
        //Posicion del caracter() en la Cadena: cad.indexOf("p"))
        System.out.println(cad1+ " es " +cad1.indexOf("p"));
        //Especificar desde que posicion comenzar a buscar: Ejemplo: busca desde 3ª posicion:
        System.out.println(cad1+ " es " +cad1.indexOf("p",2));
        //Posicion del Ultimo Caracter (""): cad1.lastIndexOf("e")
        System.out.println(cad1+ " es " +cad1.lastIndexOf("e"));

        //Cadena Mayus y CadenaMinus: cad1.toUpperCase() y cad1.toLowerCase()
        System.out.println("Normal: "+cad1+ " Mayus: " +cad1.toUpperCase()+ " Minus: " +cad1.toLowerCase());

        //COMPARAR (Boolean): cad1.equals(cad2)
        String cad2="peepo";
        System.out.println(cad1.equals(cad2));
        //COMPARAR IGNORA MAYUS y Minus: ...IgnoreCase(...)
        System.out.println(cad1.equalsIgnoreCase(cad2));

        //CONCATENAR: cad1.concat(cad2)
        System.out.println(cad1.concat(cad2));
        //Subcadena se ponen 2 valores, comienzo y fin(si no lo pones va hasta el final):
        //cad1.substring(0,3)
        System.out.println(cad1.substring(0,3)+" " +cad1.substring(3));

        //Comparar Cadenas: Si son Iguales da 0; cad1>cad2 da >0; cad1<cad2 da <0;
        //cad1.compareTo(cad2)
        System.out.println(cad1.compareTo(cad2));
        //Ignorar Mayus y Minus: cad1.compareToIgnoreCase(cad2)
        System.out.println(cad1.compareToIgnoreCase(cad2));

        //Elimina Espacios del inicio y final de casena: cad3.trim()
        String cad3="  Pe pe ga  ";
        System.out.println(cad3.trim()+ "<-No Espacios. Si Espacios->"+cad3);

        //CADENA VACIA (Boolean): cad3.isEmpty()
        System.out.println(cad3.isEmpty());

        //Boolean COMPROBAR CADENA EMPIEZA POR (SUBCADENA): cad1.startsWith(cad3)
        System.out.println(cad1.startsWith(cad3));
        System.out.println(cad1.startsWith("Pee"));

        //Remplazar Cadenas enteras o partes de ellas:  cad3.replace(cad3,cad1)
        System.out.println(cad3.replace("pe", "MonkaS"));
        System.out.println(cad3.replace(cad3,"LUL"));

    }
}
