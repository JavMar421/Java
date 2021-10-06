package ejemplos.ejemplo_modificadores;

public class SumarNumerosFamosos {

    private final float valorPi = 3.1416f;
    private final float valorE = 2.71828f;

    private float sumarNumero(int numero1, float numeroFamoso){
        return numero1 + numeroFamoso;
    }
    public float sumarPi(int numero){
        return sumarNumero(numero,valorPi);
    }

    public float sumarE(int numero){
        return sumarNumero(numero,valorE);
    }
}
