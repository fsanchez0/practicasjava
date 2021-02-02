package com.company;

import java.util.Scanner;

public class Funciones {
    public static int suma(int a, int b){
        return a+b;
    }

    private static Scanner input = new Scanner(System.in);
    /**
     *
     * @param a Primer Parámetro Perrrooosss
     * @param b Segundo Parámetro Perrroossss
     * @return Regresa una suma lol
     */
    public static float suma2(float a, float b){
        do {
            System.out.println(a+b);
            a++;
            b++;
        }while (b < 20);
        return a+b;
    }
    public static void main(String[] args) {
        System.out.println(suma(5,69));
        System.out.println(suma2((float)5.6, (float)6.6));
        int numero = 0;
        numero = input.nextInt();
        System.out.println("El numero ingresado es: " + numero);
        numero = 69;
        System.out.println("Pero de cualquier manera es: " + numero + " para mi equisde");
    }
}
