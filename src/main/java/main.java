class Main {


        public static void Main() {
            int num=0;

            //SI
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

            int i=0;
            for (i=0; i<=10; i++)
                System.out.println("Bucle Para "+i);
        }

    }
