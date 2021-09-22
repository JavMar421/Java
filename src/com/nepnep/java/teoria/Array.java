package com.nepnep.java.teoria;

import java.util.Arrays;
public class Array {
    public static void main(String[] args){
        int array1 [] = new int [6];
        int matriz [] [] = new int [5] [5];

        System.out.println(array1[0]+" "+array1[1]);
        Arrays.fill(array1,1);
        System.out.println(array1[0]+" "+array1[1]);

    }
}
