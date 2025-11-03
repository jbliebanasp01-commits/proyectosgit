/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema4ejericico3;

/**
 *
 * @author Juan
 */
public class CalculoMayor {
    
    //Es un metodo estatico que muestra el mayor de los tres números
    
    public static void mostrarmayor(int a , int b , int c ){
        int mayor;
        
        if (a >= b && a >= c) {
            mayor = a;
        } else if (b >= a && b >= c) {
            mayor = b;
        } else {
            mayor = c;
        }
        System.out.println(" El numero mayor de los introducidos es el " + mayor);
        
    }
}
