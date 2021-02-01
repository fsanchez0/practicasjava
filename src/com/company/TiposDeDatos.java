package com.company;

public class TiposDeDatos {
    public static void main(String[] args) {
        char c = 'z';
        int cInt = c;
        // implícito
        System.out.println(cInt);
        // explícito
        System.out.println((int)c);
        int i = 250;
        long iLong = i;
        // implícito
        System.out.println(iLong);
        // Explícito
        System.out.println((long) i);
        short iShort = (short) i;
        // Explícito
        System.out.println(iShort);
        double d = 301.067;
        long dLong = (long)d; // no se puede de manera impícita
        System.out.println(dLong);
        i = 100;
        float iFloat = (float) ((float) i + 5000.66);
        System.out.println(iFloat);
        i = 737;
        i *= 100;
        byte iByte = (byte) i;
        System.out.println(iByte);
        d = 298.638;
        dLong = (long) d/25;
        System.out.println(dLong);
    }
}
