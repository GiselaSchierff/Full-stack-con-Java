
package tp4ejercicio2b;

import java.util.Scanner;

public class TP4ejercicio2b {

    
    public static void main(String[] args) {
        /*b) Llevar a cabo un programa que permita cargar mediante teclado una matriz de
3 x 3 (3 filas, 3 columnas) con razas de perros. Una vez cargada la misma,
será necesario realizar un recorrido por la misma y mostrar los datos
cargados por pantalla.
*/
        String razasDePerros[][] = new String[3][3];
        Scanner teclado = new Scanner(System.in); 
        
        for (int fila = 0; fila < 3; fila++){
            for (int columna = 0; columna < 3; columna++){
                System.out.println("Ingrese el nombre de una raza de perros: ");
                razasDePerros[fila][columna] = teclado.nextLine(); 
            }
        }
        System.out.println(" ");
        System.out.println("Los nombres de las razas de perros ingresados son: ");
        for (int fila = 0; fila <3; fila++){
            for (int columna =0; columna < 3; columna++){
                System.out.println(razasDePerros[fila][columna]);
            }
        }        
       
    }
    
}
