/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema3ejercicio1;
import java.util.Scanner;
/**
 *
 * @author Juan
 */
public class Tema3Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner  (System.in);
        System.out.println("Por favor introduzca un numero");
        int numero = entrada.nextInt();
        
        if (numero >= 0){
            System.out.println("El numero es positivo");
        }
        
        else if (numero < 0){
            System.out.println("Es un numero negativo");
        }
        
        else{
            System.out.println("El numero introducido es");
        }
    }
    
}
