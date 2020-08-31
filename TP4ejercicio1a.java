
package tp4ejercicio1a;

import java.util.Scanner;


public class TP4ejercicio1a {

   
    public static void main(String[] args) {
        /*a) Llevar a cabo un programa que incluya un vector que almacene los siguientes
nombres: Alejandra, Leonardo, Rosa, Guillermo, Gabriel, Daniel, Luisa y
Ludmila. Realizar un recorrido del vector para cargar los datos y otro
recorrido para mostrar los mismos por pantalla.
    */
   
    
    String nombres[] = new String[8]; 
    Scanner teclado = new Scanner(System.in);
    for(int indice = 0; indice < nombres.length; indice++){
        System.out.println("Ingrese un nombre: "); 
        nombres[indice] = teclado.next(); 
    }
    
    for(int indice = 0; indice < nombres.length; indice++){
        System.out.println("El nombre ubicado en el índice " + indice + " es " + nombres[indice]);
    }
    
        
    }
}
