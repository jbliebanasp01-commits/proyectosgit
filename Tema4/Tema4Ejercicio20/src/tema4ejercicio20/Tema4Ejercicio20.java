/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema4ejercicio20;
import java.util.Scanner;
/**
 *
 * @author Juan
 */
public class Tema4Ejercicio20 {

    /**
     * @param args the command line arguments
     */
    //Primer metodo
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Examen de Cultura General");
        
        int nota = 0;
        nota += preguntaCapital(entrada);
        System.out.println();//Dejamos el espacio entre preguntas
        nota += preguntaDescubridor(entrada);
        
        System.out.println(" Nota del examen " + nota);
    }
    //Constantes con las respuestas correctas
     private static final String CAPITAL_ESPANA = "Madrid";
     private static final String DESCUBRIDOR_AMERICA = "Colon";
    
     //Segundo Metodo en el que hacemos la primera pregunta 
    public static int preguntaCapital(Scanner entrada){
        System.out.println("1 Pregunta  ¿Cual es la capital de Espana?");
          String respuesta = entrada.nextLine().trim();
        
        if (respuesta.equalsIgnoreCase(CAPITAL_ESPANA)){
            System.out.println("Muy bien, respuesta correcta.");
            return 5;
        }else{
            System.out.println("No es correcto . La respuesta correcta es" + CAPITAL_ESPANA);
            return 0;
        }
        
    }
    //Tercer metodo en el que hacemos la segunda pregunta
    public static int preguntaDescubridor(Scanner entrada){
        System.out.println("2 Pregunta: ¿QUien descubrió América?:");
        String respuesta = entrada.nextLine().trim();
        if(respuesta.equalsIgnoreCase(DESCUBRIDOR_AMERICA)){
            System.out.println("Muy bien , respuesta correcta.");
            return 5;
        }else{
            System.out.println("No es correcto. La respuesta correcta es " + DESCUBRIDOR_AMERICA);
            return 0;
        }
    }
}
