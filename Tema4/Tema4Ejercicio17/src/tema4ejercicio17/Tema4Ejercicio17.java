/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema4ejercicio17;
import java.util.Scanner;
/**
 *
 * @author Juan
 */
public class Tema4Ejercicio17 {

    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
       
       //Generamos una letra entre la 'a' y 'z'
       char letraSecreta = (char) (Math.random() * (122-97+1)+97);
       
       char letraUsuario;
       int intentos= 0;
       System.out.println("He pensado en una letra entre la 'a' y 'z' Adivina cual es!");
       //Hacemos un bucle que se repite hasta que el usario no acierte la letra
       do {
            System.out.print("Introduce una letra: ");
            letraUsuario = entrada.nextLine().charAt(0);
            intentos++;
            
            
            if (letraUsuario < letraSecreta) {
                System.out.println("La letra esta despues en el alfabeto.");
            } else if (letraUsuario > letraSecreta) {
                System.out.println("La letra esta antes en el alfabeto.");
            } else {
                System.out.println("¡Correcto! Era '" + letraSecreta + "'.");
                System.out.println("Has necesitado " + intentos + " intentos.");
            }

        } while (letraUsuario != letraSecreta);//El bucle se repite mientras no acierte
    }
    
}
