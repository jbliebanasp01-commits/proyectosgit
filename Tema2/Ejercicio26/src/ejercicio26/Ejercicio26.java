/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio26;
import java.util.Scanner;
/**
 *
 * @author Juan
 */
public class Ejercicio26 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
       //Pedimos el numero de 4 cifras
       System.out.println("Por favor , introduzca un número de 4 cifras :");
       int numero = entrada.nextInt();
       
       //Ahora extraemos las cifras
       
       int cifra1 = numero / 1000;
       int cifra2 = (numero /100) % 10;
       int cifra3 = (numero /10) % 10;
       int cifra4 = numero % 10;
       
       // Por último mostramos los resultados
       
       System.out.println("La primera cifra es " + cifra1 );
       System.out.println("La segunda cifra es " + cifra2 );
       System.out.println("La tercera cifra es " + cifra3 );
       System.out.println("La cuarta cifra es " + cifra4 );
       
       
       
       
    }
    
}
