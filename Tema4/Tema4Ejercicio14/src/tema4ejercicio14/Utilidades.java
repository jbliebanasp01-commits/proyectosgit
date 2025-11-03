/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema4ejercicio14;
import java.util.Scanner;
/**
 *
 * @author Juan
 */
public class Utilidades {
    public static int pedirNumero(){
        Scanner entrada = new Scanner(System.in);
        int numero;
        //Hacemos un bucle 
        do {
            System.out.print("Introduce un numero mayor que 0: ");
            numero = entrada.nextInt();

            if (esMayorQueCero(numero) == false) {
            System.out.println(" Error: el numero debe ser mayor que 0.");
            }

        } while (esMayorQueCero(numero) == false);

        return numero;
    }

    // Método booleano para comprobar que el número sea mayor que 0
    public static boolean esMayorQueCero(int numero) {
        if (numero > 0) {
            return true;
        } else {
            return false;
        }
    }

    // Método que muestra los múltiplos de 3 entre 1 y el número dado
    public static void mostrarMultiplosDeTres(int numero) {
        int contador = 0;

        System.out.println("Multiplos de 3 entre 1 y " + numero + ":");

        for (int i = 1; i <= numero; i++) {
            if (i % 3 == 0) {
                System.out.print(i + " ");
                contador++;
            }
        }

        System.out.println("\nTotal de multiplos de 3 mostrados: " + contador);//\n es un salto de linea 
    }
}
