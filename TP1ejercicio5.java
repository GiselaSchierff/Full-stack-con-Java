
package tp1ejercicio5;

import java.util.Scanner;


public class TP1ejercicio5 {

    
    public static void main(String[] args) {
        /* Realizar un programa que permita a un profesor calcular el promedio de un
alumno. Para esto, el algoritmo debe permitir ingresar las 4 notas del
mismo(por ejemplo, 8, 7, 9.50 y 10), luego calcular el promedio de las
mismas y mostrar el resultado por pantalla. Se recuerda que el promedio es
la suma de todas las notas dividido la cantidad, en el ejemplo sería:
(8+7+9.50+10)/4.*/
        System.out.println("Ingrese la primera nota: ");
        Scanner nota1 = new Scanner(System.in); 
        double primeraNota = nota1.nextDouble(); 
        
        System.out.println("Ingrese la segunda nota: ");
        Scanner nota2 = new Scanner(System.in); 
        double segundaNota = nota2.nextDouble(); 
        
        System.out.println("Ingrese la tercera nota: ");
        Scanner nota3 = new Scanner(System.in); 
        double terceraNota = nota3.nextDouble(); 
        
        System.out.println("Ingrese la cuarta nota: ");
        Scanner nota4 = new Scanner(System.in);
        double cuartaNota = nota4.nextDouble(); 
        
        double promedio;
        double suma; 
        suma = primeraNota + segundaNota + terceraNota + cuartaNota; 
        promedio = suma / 4; 
        System.out.println("El promedio de las cuatro notas es: " + promedio);
    }
    
}
