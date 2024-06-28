package ejercicios;

import java.util.Scanner;

/**
 * Realizar la carga del lado de un cuadrado, mostrar por pantalla del perimetro del mismo
 * (el perimetro de un cuadrado se calcula multiplicando el valor del lado por cuatro)
 */
public class Ejercicio3 {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int lado, perimetro;
        
        System.out.println("Ingrese el valor del lado del cuadrado = ");
        lado = entrada.nextInt();        
        
        perimetro= lado * 4;
        
        System.out.println("El perimetro del cuadrado es : "+ perimetro);
        
    }
    
}
