package com.company;

public class SentenciaIf {
    public static void main(String[] args) {
        boolean isZorrita = false;
        boolean isPerrita = true;
        //int isZorritaInt = (char) isZorrita;
        if (isZorrita) {
            System.out.println("Si es zorrita pero ya no más");
            int i = 1;
            i++;
            isZorrita = false;
        }else
        {
            System.out.println("No es zorrita pero es perrita jaja nosierto");
        }
        if (!isZorrita) {
            // No está declarada aquí :v
            /*i--;*/
            System.out.println("Ya no es una zorrita la qlera equisde");
        }
        if (isZorrita || isPerrita)
        {
            System.out.println("Es una de las 2, lo 100to");
        }
        if (isPerrita && isZorrita)
        {
            System.out.println("lo 100to, es las dos :c");
        }
        // Operadores Asignación == !=
        // Operadores Relacionales < > <= >=
    }
}