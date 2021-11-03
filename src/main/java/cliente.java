import java.util.Random;

public class cliente extends Thread {

    Random r = new Random();
    int compras = 0;
    int i;
    String item;
    int dinero;
    final int numero;


    public cliente(int numero) {
        this.numero = numero;
        dinero = dinero;
    }



    @Override
    public void run() {
        try {
            do {
                Thread.sleep(r.nextInt(1000));
                i = r.nextInt(9)+1;
                item = "Item Nº" + r.nextInt(1000000);
                dinero += r.nextInt(99) + 1;
                compras += 1;
            } while (i >= compras);
            cajero.cobrar(dinero);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    main.clilistaOrdenada.add(this);
    }

    }


