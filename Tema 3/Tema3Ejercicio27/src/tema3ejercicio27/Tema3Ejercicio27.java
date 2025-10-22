/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema3ejercicio27;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Tema3Ejercicio27 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        int num1 , num2;
        int opcion;
        //Pedimos los dos números al usuario
        System.out.println(" Introduzca el primer numero" );
         num1 = entrada.nextInt();
        
        System.out.println(" Introduce el segundo numero " );
         num2 = entrada.nextInt();
       
        //Hacemos el bucle do porque es un menu 
        do{
            System.out.println(" Pulse 1 para sumar los numeros ");
            System.out.println( " Pulse 2 para restas los numeros ");
            System.out.println(" Pulse 3 para multiplicar los numeros " );
            System.out.println(" Pulse 4 para dividir los numeros ");
            System.out.println(" Pulse 5 para salir del programa ");
            System.out.println(" Elige una opcion :");
            
            
                opcion = entrada.nextInt();
                //Ahora evaluamos la opción seleccionada
                switch (opcion) {
                    case 1: 
                        int suma = num1 + num2 ;
                        System.out.println(" La suma es " + suma );
                        break;
                    
                    case 2: 
                        int resta = num1 - num2 ;
                        System.out.println(" La resta es :" + resta );
                        break;
                    
                    case 3 :
                        int multiplicar = num1 * num2 ;
                        System.out.println(" La multiplicacion es " + multiplicar);
                    
                    case 4 : 
                        try {
                         if (num2 == 0) {
                            throw new ArithmeticException("No se puede dividir entre 0.");
                        }
                        System.out.println("La division es: " + (num1 / num2));
                    }    catch (ArithmeticException e) {
                             System.out.println("Error: " + e.getMessage());
                    }
                    break;
                    
                    case 5:
                      System.out.println("Saliendo del programa...");
                      break;
                      
                    default:
                      System.out.println("Opción no válida. Inténtalo de nuevo.");
            }
        } while (opcion != 5);//Se repite hasta que el usuario elija salir que es la opcion 5

       
    }
}