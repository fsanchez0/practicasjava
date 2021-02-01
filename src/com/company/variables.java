package com.company;
import java.io.File;

public class variables {
    public static final int PERRO = 56;
    public static void main(String[] args) {
        int velocidad = 10;
        velocidad = velocidad * 10;
        String texto = "Perrrroooos";
        texto += texto;
        texto = texto+2;
        texto = texto+velocidad;
        texto = texto.replace('r','R');
        texto = texto.toUpperCase();
        // tipo_de_dato nombre = valor;
        System.out.println(velocidad);
        System.out.println(texto);
        System.out.println(texto + velocidad);
        texto = texto.replace('O', 'A');
        System.out.println(texto);
        for (int i = 0; i < 10; i++) {
            System.out.println(i + " : " + texto);
        }
        System.out.println(PERRO);
        System.out.println(System.getProperty("user.dir"));
        File file = new File("src/com.company");
        if (file.exists() && !file.isDirectory()) {
            System.out.println("El archivo Existe!!");
        }else {
            System.out.println("El archivo no existe!!");
            if (file.isDirectory()) {
                System.out.println("Es un directorio!");
            }
        }
    }
}
