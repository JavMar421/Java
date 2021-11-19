package teoria;


public class Hilos {
    public static void main(String[] args) throws InterruptedException {
        //crear 100 hilos
        for (int i = 0; i < 10; i++) {
            Hilo h = new Hilo(i);
            //start->Override
            h.start();
        }
    }
}
class Hilo extends Thread {

    public Integer num;

    public Hilo(Integer num){
        this.num = num;
    }

    @Override
    public void run() {
        System.out.println("Soy el hilo " + num + " y me voy a dormir.");
        try {
            //int num=Hilos.getRandomTimeInMills();
            Thread.sleep(num);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Soy el hilo " + num + " he dormido "+num+" milis y me he despertado.");

    }
}
