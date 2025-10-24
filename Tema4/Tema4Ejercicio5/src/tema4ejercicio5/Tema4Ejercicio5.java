/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema4ejercicio5;
import java.util.Scanner;
import tema4ejercicio5.paqueteMetodos.ParImpar;

/**
 *
 * @author Juan
 */
public class Tema4Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner entrada = new Scanner (System.in);
       
       System.out.println(" Por favor , introduzca un numero :");
       int numero = entrada.nextInt();
       
       //Llamamos al metodo que esta en otro paquete
       
       ParImpar.comprobarParImpar(numero);
    }
    
}
