
package tp3ejercicio1b;

import java.util.Scanner;


public class TP3ejercicio1b {

    public static void main(String[] args) {
        /*b) Realizar un algoritmo que dado por teclado un límite numérico (por ejemplo
100) muestre en pantalla todos los números hasta ese límite (empezando por
1).*/
        System.out.println("Ingrese un número: ");
        Scanner teclado = new Scanner(System.in); 
        int limite = teclado.nextInt();
        
        System.out.println("");
        
        int base = 1; 
        while (limite >= base){
            System.out.println(base);
            base = base + 1; 
        }
    }
    
}
