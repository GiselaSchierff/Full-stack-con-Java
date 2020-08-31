
package tp4ejercicio1d;

import java.util.Scanner;


public class TP4ejercicio1d {

    
    public static void main(String[] args) {
        /*d) Un empleado desea almacenar en un vector sus 12 sueldos del año. A partir
de esa carga, necesita un programa que determine y muestre por pantalla la
suma total de sus 12 sueldos y el promedio de sueldo que tuvo en el año*/
        double sueldos[] = new double[12]; 
        Scanner teclado = new Scanner(System.in); 
        
        for (int indice = 0; indice < sueldos.length; indice++){ 
            System.out.println("Ingrese su sueldo del mes " + (indice +1) + ": ");
            sueldos[indice] = teclado.nextDouble(); 
        }
        
        double sumaDeSueldos = 0; 
        
        for (int indice = 0; indice < sueldos.length; indice++){
            sumaDeSueldos = sumaDeSueldos + sueldos[indice];
        }
        
        double promedioDeSueldos = sumaDeSueldos / 12; 
        
        System.out.println("La suma total de los 12 sueldos ingresados es: " + sumaDeSueldos);
        System.out.println("El promedio de los 12 sueldos ingresados es: " + promedioDeSueldos);
    }
    
}
