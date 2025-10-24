/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema4ejercicio6;
import java.util.Scanner;
/**
 *
 * @author Juan
 */
public class Tema4Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        
        System.out.println(" Por favor , introduzaca la nota del alumno ( 0 a 10) : ");
        int nota = entrada.nextInt();
        
        //Llamamos al método de l atra clase
        Notas.mostrarNotas(nota);
    }
    
}
