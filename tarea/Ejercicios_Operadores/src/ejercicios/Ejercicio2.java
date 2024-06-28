package ejercicios;

import java.util.Scanner;

/**
 * Hallar la suma de tres numeros conociendo los numeros 
 */
public class Ejercicio2 {
   
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int nro1,nro2,nro3,suma;
        
        System.out.println("Ingrese el valor del primer nro: ");
        nro1 = entrada.nextInt();
        
        System.out.println("Ingrese el valor del segundo nro: ");
        nro2 = entrada.nextInt();
        
        System.out.println("Ingrese el valor del tercer nro: ");
        nro3= entrada.nextInt();
        
        suma = nro1+nro2+nro3;
        
        System.out.println("la suma de los 3 nros es = "+ suma);
        
    }    
}
