/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema4ejercicio2;
import java.util.Scanner;
/**
 *
 * @author Juan
 */
public class Tema4Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        //Pedimos los dos numeros al usuario
        System.out.println(" Por favor introduzca el primer numero");
        int num1 = entrada.nextInt();
        
        System.out.println(" Ahora introduzca un segundo numero :");
        int num2 = entrada.nextInt();
        
        int resultado;
        
        if(num1 > 10){
            resultado =Calculos.multiplicar(num1 , num2 );
            System.out.println("La operacion que se realizo es el producto y el resultado es " + resultado);
        }else {
            resultado = Calculos.sumar(num1 , num2);
            System.out.println(" La operacion que se realizo es a la suma y el resultado es " + resultado);
            
        }
    }
    
}
