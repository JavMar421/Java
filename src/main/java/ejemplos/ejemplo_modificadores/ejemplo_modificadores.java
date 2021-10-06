package ejemplos.ejemplo_modificadores;

public class ejemplo_modificadores {

    public static void main(String[] args) {
        sumandoNumerosFamosos();
        sumandoNumerosFamososDeFormaEstatica();
        sumandoNumerosFamososDeFormaMixta();
    }

    private static void sumandoNumerosFamosos(){
        System.out.println("Sumando numeros famosos");
        int numero1 = 1;
        int numero2 = 2;
        SumarNumerosFamosos sumarNumerosFamosos = new SumarNumerosFamosos();
        float resultado1 = sumarNumerosFamosos.sumarE(numero1);
        float resultado2 = sumarNumerosFamosos.sumarPi(numero2);
        System.out.println("Si al numero " + numero1 + ", le sumamos E, el resultado es " + resultado1);
        System.out.println("Si al numero " + numero2 + ", le sumamos Pi, el resultado es " + resultado2);
    }

    private static void sumandoNumerosFamososDeFormaEstatica(){
        System.out.println("Sumando numeros famosos de forma estática");
        int numero1 = 1;
        int numero2 = 2;
        float resultado1 = SumarNumerosFamososDeFormaEstatica.sumarE(numero1);
        float resultado2 = SumarNumerosFamososDeFormaEstatica.sumarPi(numero2);
        System.out.println("Si al numero " + numero1 + ", le sumamos E, el resultado es " + resultado1);
        System.out.println("Si al numero " + numero2 + ", le sumamos Pi, el resultado es " + resultado2);
    }

    private static void sumandoNumerosFamososDeFormaMixta(){
        System.out.println("Sumando numeros famosos de forma mixta");
        int numero1 = 1;
        int numero2 = 2;
        float resultado1 = SumarNumerosFamososDeFormaMixta.sumarE(numero1);
        // al sumarPi no ser estática
        // float resultado2 = SumarNumerosFamososDeFormaMixta.sumarPi(numero2);
        // por tanto habría que crear un objeto
        SumarNumerosFamososDeFormaMixta sumarNumerosFamososDeFormaMixta = new SumarNumerosFamososDeFormaMixta();
        float resultado2 = sumarNumerosFamososDeFormaMixta.sumarPi(numero2);
        System.out.println("Si al numero " + numero1 + ", le sumamos E, el resultado es " + resultado1);
        System.out.println("Si al numero " + numero2 + ", le sumamos Pi, el resultado es " + resultado2);
    }
}
