/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema3ejercicio6;
import java.util.Scanner;
/**
 *
 * @author Juan
 */
public class Tema3Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        System.out.println("Introduzca la nota del examen");
        int nota = entrada.nextInt();
        
        if (nota < 0 || nota > 10){
            System.out.println("Error la nota debe estar entre 0 y 10"); 
        }
        else if (nota > 0 & nota <=4){
           System.out.println("Estas suspenso");
        }
        else if (nota >=5 & nota <=6){
            System.out.println("Tienes un bien");
        }
        else if (nota >=7 & nota <=8) {
            System.out.println("Tienes un notable");
        }
        else  {
            System.out.println("Tienes un sobresaliente");
         }
      }  
    }  
