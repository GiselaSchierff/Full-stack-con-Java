
package tp1ejercicio6;

import java.util.Scanner;

public class TP1ejercicio6 {

  
    public static void main(String[] args) {
        /*Realizar un programa que permita calcular el área de un triángulo. Se
recuerda que la fórmula para calcular el área de un triángulo es: (base *
altura) / 2. Se debe permitir al usuario ingresar la base y la altura,
mientras que el programa debe calcular el área y mostrar el resultado por
pantalla.*/
        System.out.println("Ingrese la base del triángulo: ");
        Scanner base = new Scanner(System.in); 
        double baseDelTriangulo = base.nextDouble(); 
        
        System.out.println("Ingrese la altura del triángulo: "); 
        Scanner altura = new Scanner(System.in); 
        double alturaDelTriangulo = altura.nextDouble(); 
        
        double areaDelTriangulo; 
        areaDelTriangulo = (baseDelTriangulo * alturaDelTriangulo) / 2; 
        System.out.println("El área del triángulo dado es: " + areaDelTriangulo); 
    }
    
}
