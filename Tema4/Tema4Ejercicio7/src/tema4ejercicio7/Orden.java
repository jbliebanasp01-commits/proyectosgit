/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema4ejercicio7;

/**
 *
 * @author Juan
 */
public class Orden {
    
    public static void mostrarOrdenados(int a, int b, int c, int d) {
        int temp;

        // Vamos a repetir el proceso de comparación varias veces con un bucle
        for (int i = 0; i < 4; i++) {
            if (a > b) { temp = a; a = b; b = temp; }
            if (b > c) { temp = b; b = c; c = temp; }
            if (c > d) { temp = c; c = d; d = temp; }
        }

        System.out.println("El orden de los números introducidos es: "
                + a + " - " + b + " - " + c + " - " + d);
    }
}
