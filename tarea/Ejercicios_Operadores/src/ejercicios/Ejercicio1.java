package ejercicios;
import java.util.Scanner;


// Hallar la superficie de un cuadrado conociendo el valor de un lado

public class Ejercicio1 {

    public static void main(String[] args) {
       Scanner teclado = new Scanner(System.in);
       float lado;
       float resultado;
       
        System.out.println("Ingrese el valor del lado=");
        lado = teclado.nextFloat();
        
        System.out.println("La superficie del cuadro es : "+lado*lado);      
       
    }
    
}
