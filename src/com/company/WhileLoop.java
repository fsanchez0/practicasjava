package com.company;

import java.io.File;

public class WhileLoop {
    static boolean isTurnOnLight = false;
    public static void main(String[] args) {

    }
    public static void printSOS(){
        System.out.println(" . . . _ _ _ . . .");
    }

    public static boolean turnOnOffLight(){
        isTurnOnLight = !isTurnOnLight;
        return isTurnOnLight;
    }
}
