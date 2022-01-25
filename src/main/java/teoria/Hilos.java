/*
package teoria;

import java.util.Random;

public class Hilossss {
    public static void main(String[] args) throws InterruptedException {
        //crear 100 hilos
        for (int i = 0; i < 10; i++) {
            Hilo h = new Hilo(i);
            //start llama al run()
            h.start();
        }
    }
}
class Hilo extends Thread {

    public Integer namenum = 0;
    public Integer num;
    public Hilo(Integer namenum){
        this.namenum = namenum;
    }

    @Override
    public void run() {
        System.out.println("Soy el hilo " + namenum + " y me voy a dormir.");
        try {

            Random r = new Random();
            num =r.nextInt(3000);
            //Sleep bloquea al hilo
            Thread.sleep(num);
            //Tambien existe wait :)
            //wait(100);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Soy el hilo " + namenum + " he dormido "+ num +" milis y me he despertado.");

    }
}*/
