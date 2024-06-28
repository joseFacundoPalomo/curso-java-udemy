
package ejercicios;

import java.util.Scanner;

/**
 * Crear una aplicacion que calcule la edad de una persona , para calcular 
 * su edad necesitaremos su fecha de nacimiento y la fecha actual
 * 
 */
public class Ejercicio6 {


    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int fechaNacimiento,fechaActual, edad;
        
        System.out.println("Ingrese la fecha de actual: ");
        fechaActual= entrada.nextInt();
        
        System.out.println("Ingrese la fecha de nacimiento: ");
        fechaNacimiento= entrada.nextInt();
        
        
        
        edad= fechaActual - fechaNacimiento ;
        
        System.out.println("La edad es = " + edad);
        
        
        
    }
    
}
