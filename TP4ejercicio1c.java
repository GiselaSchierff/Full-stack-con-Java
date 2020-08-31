
package tp4ejercicio1c;

import java.util.Scanner;


public class TP4ejercicio1c {

    public static void main(String[] args) {
        /*c) Realizar un programa que permita la carga por teclado de 15 números en un
vector. Una vez cargados, se necesita que el programa cuente e informe por
pantalla cuántas veces se cargó el número 3 (si es que fue cargado alguna
vez).
*/
        int numeros[] = new int[15]; 
        Scanner teclado = new Scanner(System.in); 
        
        for (int indice = 0; indice < numeros.length; indice++){
            System.out.println("Ingrese un número: ");
            numeros[indice] = teclado.nextInt();
        }
        
        int cuentaNroBuscado = 0; 
        
        for (int indice = 0; indice < numeros.length; indice++){
            if (numeros[indice] == 3){ 
            cuentaNroBuscado++; 
            }
        }
        System.out.println("La cantidad de veces que se escribió el número 3 es: " + cuentaNroBuscado);
        
    }
    
}
