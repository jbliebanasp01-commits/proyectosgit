/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema4ejercicio6;

/**
 *
 * @author Juan
 */
public class Notas {
    public static void mostrarNotas(int nota){
        
        if (nota < 0 || nota > 10) {
            System.out.println("Error: la nota debe estar entre 0 y 10.");
        } else if (nota >= 0 && nota <= 4) {
            System.out.println("Suspenso");
        } else if (nota >= 5 && nota <= 6) {
            System.out.println("Bien");
        } else if (nota >= 7 && nota <= 8) {
            System.out.println("Notable");
        } else { // 9 o 10
            System.out.println("Sobresaliente");
        }
    }
}
