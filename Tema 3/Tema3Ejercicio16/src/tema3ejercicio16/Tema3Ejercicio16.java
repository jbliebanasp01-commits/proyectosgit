/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema3ejercicio16;

/**
 *
 * @author alumno
 */
public class Tema3Ejercicio16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //Contador de los numeros impares
        int contador = 0;
        
        //Ponemos en el mensaje el rango de numeros
        System.out.println("Los numeros impares existentes entre el numero 20 y el 160 son:");
        
        //Hacemos un for porque sabemos hasta cuando se tiene que hacer 
        for (int i = 21; i < 160 ; i +=2 ){
            System.out.println(i + "");
            contador++;
        }
    }
    
}
