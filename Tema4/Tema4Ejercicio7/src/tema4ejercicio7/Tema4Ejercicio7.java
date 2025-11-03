/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema4ejercicio7;
import java.util.Scanner;
/**
 *
 * @author Juan
 */
public class Tema4Ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        //Decimos al usuario que introduzca cuatro numeros
        System.out.println( " Por favor , introduzca el primer numero");
        int num1 = entrada.nextInt();
        
        System.out.println( " Por favot , introduzca el segundo numero ");
        int num2 = entrada.nextInt();
        
        System.out.println( " Introduzca el tercer numero");
        int num3 = entrada.nextInt();
        
        System.out.println(" Por ultimo ;introduzca un cuarto numero");
        int num4 = entrada.nextInt();
        
        //LLamamos al metodo para ordenarlos
        Orden.mostrarOrdenados(num1,num2,num3,num4);
    }
    
}
