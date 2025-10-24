/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema4ejercicio1;
import java.util.Scanner;
/**
 *
 * @author Juan
 */
public class Tema4Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        
        System.out.println("Por favor , introduzca un número :");
        int numero = entrada.nextInt();
        
        comprobarNumero(numero);
        
    
    }
    //Metodo que muestra si el numero es positivo o negativo
    
     public static void comprobarNumero(int num){
         if (num > 0) {
             System.out.println(" El numero introducido es positivo ");
             
         }else if (num < 0 ){
             System.out.println(" El numero introducido es negativo");
             
         }else {
             System.out.println(" El numero introducido es cero");
         }
     }
}
