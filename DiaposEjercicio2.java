
package diapos.ejercicio2;

import java.util.Scanner;


public class DiaposEjercicio2 {

    
    public static void main(String[] args) {
        /*Realizar un programa que dado por teclado un límite numérico 
        (por ejemplo 100) muestre en pantalla todos los múmeros hasta 
        ese límite (empezando por 1)
        */ 
        System.out.println("Ingrese un número: ");
        Scanner num = new Scanner(System.in); 
        int numero = num.nextInt(); 
        
        System.out.println(" ");
        
        int contador = 1; 
        
        while (numero >= contador){ 
            System.out.println(contador);
            contador = contador + 1; 
            
        }
        
    }
    
}
