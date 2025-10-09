/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema3ejercicio9;
import java.util.Scanner;
/**
 *
 * @author Juan
 */
public class Tema3Ejercicio9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
       int a ,b,c,d,temp;
       
       System.out.println("Por favor ,introduzca el primer numero:");
       a=entrada.nextInt();
       
       System.out.println("Por favor, introduzca el segundo numero:");
       b=entrada.nextInt();
       
       System.out.println("Por favor, introduzca el tercer numero:");
       c=entrada.nextInt();
       
       System.out.println("Por favor , introduzca el cuarto numero:");
       d=entrada.nextInt();
       
       if (a > b) {temp = a; a = b ; b = temp ;}
       if (a > c) {temp = a; a = c ; c = temp ;}
       if (a > d) {temp = a; a = d ; d = temp ;}
       if (b > c) {temp = b; b = c ; c = temp ;}
       if (b > d) {temp = b; b = d ; d = temp ;}
       if (c > d) {temp = c; c = d ; d = temp ;}
       
       System.out.println("El orden de los numeros introducidos es : " + a + "-" + b + "-" + c + "-" + d);
       
       
       
    }
    
}
