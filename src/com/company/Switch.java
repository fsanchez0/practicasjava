package com.company;

public class Switch {
    public static void main(String[] args) {
        String colorModeSelected = "Oscuro";

        switch (colorModeSelected){
            case "Claro":
                System.out.println("Seleccionaste el modo Luz");
                break;
            case "Noche":
                System.out.println("Seleccionaste modo noche");
                break;
            case "Blue Dark":
                System.out.println("Seleccionaste Azul");
                break;
            case "Oscuro":
                System.out.println("Seleccionaste Oscuro (Por defecto)");
                break;
            default:
                System.out.println("Eres un imbécil wexd");
                break;
        }
    }
}
