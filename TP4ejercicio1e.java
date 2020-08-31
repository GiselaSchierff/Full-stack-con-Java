
package tp4ejercicio1e;

import java.util.Scanner;

public class TP4ejercicio1e {

    public static void main(String[] args) {
        /*e) En tres vectores diferentes se guardan los datos de temperaturas máximas y
mínimas de 5 ciudades de Misiones. En el primer vector se guardan los
nombres de las ciudades, en el segundo las temperaturas mínimas alcanzadas
y en el tercero las temperaturas máximas alcanzadas en la última semana. Se
necesita un programa que permita la carga de las ciudades, sus temperaturas
mínimas y máximas; además, deberá poder informar por pantalla cual fue la
ciudad con la temperatura más baja y cual con la temperatura más alta (dando
a conocer al mismo tiempo la cantidad de grados).*/
        
        String ciudades[] = new String[5]; 
        double temperaturasMaximas[] = new double[5]; 
        double temperaturasMinimas[] = new double[5]; 
        Scanner teclado = new Scanner(System.in); 
        
        
        
        for (int indice = 0; indice < ciudades.length; indice++){
            System.out.println("Ingrese la ciudad correspondiente al indice " + indice + ": ");
            ciudades[indice] = teclado.nextLine(); 
            
        }
        
        for (int indice = 0; indice < temperaturasMinimas.length; indice++){
            System.out.println("Ingrese la temperatura mínima de la ciudad " + ciudades[indice] + ": ");
            temperaturasMinimas[indice] = teclado.nextDouble(); 
        }
        
        for (int indice = 0; indice < temperaturasMaximas.length; indice++){
            System.out.println("Ingrese la temperatura máxima de la ciudad " + ciudades[indice] + ": ");
            temperaturasMaximas[indice] = teclado.nextDouble(); 
            
        }
        
        double temperaturaMasBaja = 100; // considerando que es un número alto y cualquier temperatura baja en Celsius es menor a él 
        double temperaturaMasAlta = 0; 
        String ciudadMasFria = ""; 
        String ciudadMasCaliente = ""; 
        
        for (int indice = 0; indice < temperaturasMinimas.length; indice++){
            if (temperaturaMasBaja > temperaturasMinimas[indice]){
                temperaturaMasBaja = temperaturasMinimas[indice]; 
                ciudadMasFria = ciudades[indice];                
            }
        }
        
        for (int indice = 0; indice < temperaturasMaximas.length; indice++){
            if (temperaturaMasAlta < temperaturasMaximas[indice]){
                temperaturaMasAlta = temperaturasMaximas[indice];
                ciudadMasCaliente = ciudades[indice];
            } 
        }
        System.out.println("La ciudad con la temperatura más baja es " + ciudadMasFria + " y su temperatura mínima es " + temperaturaMasBaja);
        System.out.println("La ciudad con la temperatura más alta es " + ciudadMasCaliente + " y su temperatura máxima es " + temperaturaMasAlta);
    }
    
    
}
