import java.util.Random;

public class hilos {

    public static void main(String[] args) {

        System.currentTimeMillis();
        for (int i=0; i<=10; i++){
        hilo h$i = new hilo("Hilo "+i);




        try {
            h$i.start();
            h$i.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        System.currentTimeMillis();
    }
    }
    public static Integer getRandomTimeInMills() {
        Random r = new Random();

        return (r.nextInt(3001));
    }

}
