/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema4ejercicio4;

/**
 *
 * @author Juan
 */
public class Calculo {
    //Metodo estatico que nos escribe el menor de los tres numeros
    
    public static void mostrarmenor(int a, int b, int c) {
        int menor;

        if (a <= b && a <= c) {
            menor = a;
        } else if (b <= a && b <= c) {
            menor = b;
        } else {
            menor = c;
        }

        System.out.println("El número menor de los introducidos es: " + menor);
    }
}
