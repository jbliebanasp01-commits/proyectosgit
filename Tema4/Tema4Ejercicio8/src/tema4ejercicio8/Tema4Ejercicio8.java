/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema4ejercicio8;
import java.util.Scanner;
/**
 *
 * @author Juan
 */
public class Tema4Ejercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println(" Por favor ,indique una cantidad de dinero :");
        int euros = entrada.nextInt();
        
        Desglose.mostrarDesglose(euros);
        
    }
    
}
