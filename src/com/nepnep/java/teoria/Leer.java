package com.nepnep.java.teoria;

import java.io.InputStreamReader;
import java.io.BufferedReader;
public class Leer {

    public static void main(String[] args)throws java.io.IOException {
        //INICIALIZAR
        BufferedReader teclado= new BufferedReader(new InputStreamReader (System.in,"UTF-8"));
        String cad="a";
        int num=0;
        System.out.println("Cadena y numero: ");

        //READLINE
        cad=teclado.readLine();
        num=Integer.parseInt(teclado.readLine());
        System.out.println("Resultado: "+cad+ " " +num);

        //CONVERSION
        String cad2="150";
        int num2=0;
        float deci1=0;
        deci1=Float.parseFloat(cad2);
        num2=Integer.parseInt(cad2);
        System.out.println("cadena: " +cad2+" int: " +num2+ " decimal: " +deci1);
    }
}
