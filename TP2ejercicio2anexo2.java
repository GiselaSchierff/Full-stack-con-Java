
package tp2ejercicio2anexo2;

import java.util.Scanner;

public class TP2ejercicio2anexo2 {

    
    public static void main(String[] args) {
        /*2) Una mercería vende canutillos y mostacillas al por mayor mediante su página
web. Como se trata de una mercería mayorista, solicita la cantidad de paquetes
en cada venta y dependiendo de esta realiza los siguientes controles:
a) Si la cantidad de productos es menor a 5: Se debe emitir un mensaje indicando
que no se permiten compras inferiores a 5 productos.
b) Si la cantidad de productos es mayor o igual a 5 pero menor o igual a 15:
Se debe emitir un mensaje que el costo de envío es de $200.
c) Si la cantidad de productos es mayor o igual a 5 y es mayor a 15: Se debe
emitir un mensaje de que el envío es gratuito.
Realizar un programa para llevar a cabo los 3 controles citados. */
        System.out.println("Ingrese la cantidad de paquetes que desea comprar: ");
        Scanner teclado = new Scanner(System.in); 
        int cantidadDePaquetes = teclado.nextInt(); 
        
        if (cantidadDePaquetes < 5 && cantidadDePaquetes >= 0){ 
            System.out.println("Lo sentimos, no se permiten compras menores a 5 paquetes");
        }
        else {
            if(cantidadDePaquetes <= 15 && cantidadDePaquetes >= 5){ 
                System.out.println("El costo del envío es de $200");
            }
            else { 
                if (cantidadDePaquetes > 15){
                    System.out.println("El envío es gratuito");
                }
                else { 
                    System.out.println("No ha ingresado una cantidad de paquetes válida");
                }
            }
        }
    }
}
