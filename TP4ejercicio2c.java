
package tp4ejercicio2c;

import java.util.Scanner;


public class TP4ejercicio2c {

    public static void main(String[] args) {
        /*c) En una tabla de 4 filas y 4 columnas se guardan las notas de 4 alumnos de
secundario. Cada fila corresponde a las notas y al promedio de cada alumno.
• Se necesita un programa que permita a un profesor cargar en las 3
primeras posiciones de cada fila las notas del alumno y que en la última
columna se calculen los promedios.
• Una vez realizados los cálculos, se desea mostrar las 3 notas de cada
alumno y el promedio correspondiente recorriendo la matriz. */
        
        double notas[][] = new double[4][4]; 
        Scanner teclado = new Scanner(System.in); 
        double sumaDeNotas;
        
        for (int fila = 0; fila < 4; fila++){
            System.out.println("Ingrese las notas del alumno " + (fila + 1) + ": ");
            for (int columna = 0; columna < 3; columna++){
                System.out.println("Nota " + (columna + 1) + ": ");
                notas[fila][columna] = teclado.nextDouble();                
            }
        }
        
        for (int fila = 0; fila < 4; fila++){
            sumaDeNotas = 0; 
            for (int columna = 0; columna < 3; columna++){
                sumaDeNotas = sumaDeNotas + notas[fila][columna];
            }
            notas[fila][3] = sumaDeNotas / 3; 
        }
        
        for (int fila = 0; fila < 4; fila++){
            System.out.println("Las notas del alumno " + (fila + 1));
            for (int columna = 0; columna < 3; columna++){
                System.out.println("Nota " + (columna + 1) + ": " + notas[fila][columna]);
            }
            System.out.println("Y su promedio es: " + notas[fila][3]);
        }
    }
    
}
