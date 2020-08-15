
package tp3ejercicio1e;

import java.util.Scanner;

public class TP3ejercicio1e {

    public static void main(String[] args) {
        /*e) Un gerente de una empresa prestadora de servicios de internet necesita un
algoritmo que permita realizar el cálculo del monto a pagar de la factura
de consumo de internet de 5 clientes de una empresa. Para ello, el algoritmo
debe solicitar por teclado dos datos: Dni del cliente y tipo de servicio.
Los tipos de servicio son 3:
1. Internet 30 megas (cuyo valor es de $750 – 10% de descuento)
2. Internet 50 megas (Cuyo valor es de $930 – 5% de descuento)
3. Internet 100 megas (Cuyo valor fijo es de $1200)
El algoritmo debe poder calcular el monto a pagar (dependiendo del tipo de
servicio con el que cuente el cliente) e informar por pantalla el dni del
mismo junto con el monto a pagar y el número de servicio con el que cuenta.*/
    
    int tipo; 
    double monto, descuento; 
    String dni; 
    
    int contador = 1; 
    
    while (contador <= 5){ 
        System.out.println("Ingrese su número de DNI: ");
        Scanner teclado = new Scanner(System.in); 
        dni = teclado.next(); 
        
        System.out.println("Ingrese el número correspondiente a su tipo de servicio:"
                + " 1. Internet 30 megas" 
                + " 2. Internet 50 megas" 
                + " 3. Internet 100 megas");
        
        tipo = teclado.nextInt(); 
        
        if (tipo == 1) { 
            descuento = 750 * 0.10; 
            monto = 750 - descuento; 
            System.out.println("El usuario con DNI " + dni + " posee el tipo de servicio número " + tipo + " y debe pagar $" + monto);
        }
        else {
            if (tipo == 2){
                descuento = 930 * 0.05; 
                monto = 930 - descuento; 
                System.out.println("El usuario con DNI " + dni + " posee el tipo de servicio número " + tipo + " y debe pagar $" + monto);
            }
            else {
                if (tipo == 3){ 
                    monto = 1200; 
                    System.out.println("El usuario con DNI " + dni + " posee el tipo de servicio número " + tipo + " y debe pagar $" + monto);
                }
                else {
                    System.out.println("No ha ingresado un tipo de servicio válido");
                    contador = contador - 1; 
                }
            
        }
        }
        contador = contador + 1; 
    }
   
    }
}
