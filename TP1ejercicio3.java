
package tp1ejercicio3;

import java.util.Scanner;


public class TP1ejercicio3 {

    
    public static void main(String[] args) {
      /* Un comerciante realiza 5 ventas por día. Necesita de un programa que le
permita ingresar por teclado los montos de las 5 ventas y luego sumar el
total de todas ellas para mostrar por pantalla el resultado. ¿Podrías
ayudarlo a realizar el programa?*/ 
        System.out.println("Ingrese el monto de la primera venta: "); 
        Scanner venta1 = new Scanner(System.in); 
        double primeraVenta = venta1.nextDouble(); 
      
        System.out.println("Ingrese el monto de la segunda venta: ");
        Scanner venta2 = new Scanner(System.in); 
        double segundaVenta = venta2.nextDouble(); 
      
        System.out.println("Ingrese el monto de la tercera venta: ");
        Scanner venta3 = new Scanner(System.in);
        double terceraVenta = venta3.nextDouble();
        
        System.out.println("Ingrese el monto de la cuarta venta: ");
        Scanner venta4 = new Scanner(System.in); 
        double cuartaVenta = venta4.nextDouble(); 
        
        System.out.println("Ingrese el monto de la quinta venta: ");
        Scanner venta5 = new Scanner(System.in); 
        double quintaVenta = venta5.nextDouble(); 
        
        double sumaDeVentas; 
        sumaDeVentas = primeraVenta + segundaVenta + terceraVenta + cuartaVenta + quintaVenta; 
        System.out.println("El resultado de la suma de las ventas es: " + sumaDeVentas);
    }
    
}
