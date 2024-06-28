
package ejercicios;

import java.util.Scanner;

/**
 *Crear una aplicación que calcule el area de un triangulo, conociendo
 * su base y altura
 * 
 */
public class Ejercicio4 {

    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double base, altura, area;
        
        System.out.print("Ingrese la base: ");
        base = entrada.nextDouble();
        
        System.out.print("Ingrese la altura: ");
        altura = entrada.nextDouble();
        
        area = (base * altura)/2;
        
        System.out.print("El area del triangulo es: "+ area);
        
    }
    
}
