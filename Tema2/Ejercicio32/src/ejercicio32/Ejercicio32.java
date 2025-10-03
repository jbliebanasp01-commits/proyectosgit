/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio32;
import java.util.Scanner;
/**
 *
 * @author juanb
 */
public class Ejercicio32 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner (System.in);
        
        //Pedimos cuanto dinero va a ser
        System.out.println("Por favor ,indique una cantidad de dinero");
        int cantidad = entrada.nextInt();
        
        //Luego calculamos los billetes y las monedas
        int dinero = cantidad;
        
        
        int billetes50 = cantidad / 50 ;
        cantidad = cantidad % 50 ;
        
        int billetes20 = cantidad / 20;
        cantidad = cantidad % 20 ;
        
        int billetes10 = cantidad / 10 ;
        cantidad = cantidad % 10 ;
        
        int billetes5 = cantidad / 5 ;
        cantidad = cantidad % 5 ;
        
        int monedas2 = cantidad / 2;
        cantidad = cantidad % 2;
        
        int monedas1 = cantidad; //Lo que quede son monedas de 1 euro
         
        System.out.println();
        System.out.println( dinero + " Euros se descomponen en: ");
        System.out.println(billetes50 + " billetes de 50 ");
        System.out.println(billetes20 + " billetes de 20 ");
        System.out.println(billetes10 + " billetes de 10 ");
        System.out.println(billetes5 + " billetes de 5 ");
        System.out.println(monedas2 + " monedas de 2 " );
        System.out.println(monedas1 + " monedas de 1 " );
        
        
        
        
    }
    
}
