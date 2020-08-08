
package tp1ejercicio2;

import java.util.Scanner;


public class TP1ejercicio2 {

    
    public static void main(String[] args) {
        /*Una estudiante está dando sus primeros pasos en la programación y quiere
realizar un programa que permita calcular cualquier porcentaje de un número.
Para ello necesita que el usuario ingrese por teclado el número a calcular
el porcentaje (por ejemplo 2500) y también el porcentaje que se desea
calcular (por ejemplo si quiere calcular 10% debería ingresar 0,10). A
partir de estos valores, necesita que el algoritmo calcule el porcentaje
(multiplicar el primer número por el valor del porcentaje), lo guarde en
una variable y se muestre por pantalla. ¿Podrías ayudarla a realizar el
programa?*/
        System.out.println("Ingrese el número al cuál quiere sacar el porcentaje: ");
        Scanner numero = new Scanner(System.in); 
        int num = numero.nextInt(); 
        
        System.out.println("Ingrese el porcentaje que quiere sacar, en formato 0,xx: "); 
        Scanner porcentaje = new Scanner(System.in); 
        double porcent =  porcentaje.nextDouble(); 
        
        double resultado; 
        resultado = num * porcent; 
        System.out.println("El porcentaje pedido para el número dado es: " + resultado);
    }
    
}
