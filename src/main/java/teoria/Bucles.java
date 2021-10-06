package teoria;

public class Bucles {
    public static void main(String[] args) {
        int num=0;

        //SI
        System.out.println("If :D");
        if (num>0)
            System.out.println(num+" es positivo");
        else if (num<0)
            System.out.println(num+" es negativo");
        else
            System.out.println(num+ " es nulo");

        //MIENTRAS

        while (num<10) {System.out.println("Bucle Mientras "+num); num++;
        }

        //REPETIR

        do {System.out.println("Bucle Repetir "+num);
            num--;
        }
        while (num>0);

        //PARA

        for (int i=0; i<=10; i++)
            System.out.println("Bucle Para "+i);

        num=2;
        switch (num){
            case 1: {System.out.println("Caso 1: num="+num); break;}
            case 2: {System.out.println("Caso 2: num="+num); break;}
            default: {System.out.println("Caso por Defecto: num="+num); break;}


        }
    }
}
