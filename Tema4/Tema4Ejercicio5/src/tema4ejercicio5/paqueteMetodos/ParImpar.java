/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema4ejercicio5.paqueteMetodos;
/**
 *
 * @author Juan
 */
public class ParImpar {
   
    // Método estático que dice si un número es par o impar
    
    public static void comprobarParImpar(int num) {
        if (num % 2 == 0) { // Si el resto de dividir por 2 es 0
            System.out.println("El número introducido es par");
        } else {
            System.out.println("El número introducido es impar");
        }
    }
}
