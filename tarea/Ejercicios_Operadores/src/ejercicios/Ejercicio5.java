package ejercicios;

import java.util.Scanner;

/**
 *
 *Crear una aplicacion que halle el promedio de 5 notas de un alumno
 * 
 */
public class Ejercicio5 {
    
    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
       float nota1 , nota2, nota3, nota4,nota5, promedio;
       
        System.out.println("Ingrese nota 1: ");
        nota1= entrada.nextFloat();
        
        System.out.println("Ingrese nota 2: ");
        nota2= entrada.nextFloat();
        
        System.out.println("Ingrese nota 3: ");
        nota3= entrada.nextFloat();
        
        System.out.println("Ingrese nota 4: ");
        nota4= entrada.nextFloat();
        
        System.out.println("Ingrese nota 5: ");
        nota5= entrada.nextFloat();
        
        promedio = (nota1+nota2+nota3+nota4+nota5)/5;
       
        System.out.print("EL PROMEDIO DEL ALUMNO ES= "+promedio);
        
    }
    
}
