
package tp4ejercicio2a;

public class TP4ejercicio2a {

    public static void main(String[] args) {
        /*Llevar a cabo un programa que permite cargar completamente con números 5
una matriz de 4x5 (4 filas, 5 columnas).*/
   
        int numeros5[][] = new int[4][5]; 
    
    
        for (int fila = 0; fila < 4; fila++){
            for (int columna = 0; columna < 5; columna++){
                numeros5[fila][columna] = 5; 
            }
        }
    }
}
