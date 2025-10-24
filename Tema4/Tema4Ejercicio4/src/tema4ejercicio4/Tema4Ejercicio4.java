/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema4ejercicio4;
import java.util.Scanner;
/**
 *
 * @author Juan
 */
public class Tema4Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        
        System.out.println(" Por favor , introduzca el primer número : ");
        int num1 = entrada.nextInt();
        
        System.out.println(" Ahora , introduzca un segundo numero :");
        int num2 = entrada.nextInt();
        
        System.out.println( " Por ultimo , introduzca un tercer numero:");
        int num3 = entrada.nextInt();
        
        //LLamamos al metodo de la otra clase ( que esta en le mismo paquete)
        Calculo.mostrarmenor(num1,num2,num3);
    }
    
}
