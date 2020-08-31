
package tp4ejercicio1b;

import java.util.Scanner;


public class TP4ejercicio1b {

    
    public static void main(String[] args) {
        /*Realizar un programa que permita la carga por teclado de 10 números en un
vector. Una vez cargados, se necesita que el programa determine cuál es el
mayor y cuál es el menor de ellos*/
        int numeros[] = new int[10]; 
        Scanner teclado = new Scanner(System.in); 
        
        for (int indice = 0; indice < numeros.length; indice++){
            System.out.println("Ingrese un número");
            numeros[indice] = teclado.nextInt(); 
           
        }
        int mayor = 0;
        
       for (int indice = 0; indice < numeros.length; indice++){ 
           if (numeros[indice] > mayor){
               mayor = numeros[indice];
           }
           
       }
        
       System.out.println("El mayor número es: " + mayor);
    }
    
}
