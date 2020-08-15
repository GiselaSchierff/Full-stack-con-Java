
package tp2ejercicio2anexo1;

import java.util.Scanner;


public class TP2ejercicio2anexo1 {

    
    public static void main(String[] args) {
       
    /*1) Una pequeña despensa desea calcular los sueldos de sus empleados. Los puestos
de los mismos pueden tener 3 categorías: 1- repositor, 2-cajero y 3-supervisor.
a) Los repositores cobran $15.890 + un bono de 10%.
b) Los cajeros cobran $25.630,89 fijos.
c) Los supervisores cobran $35.560,20 en bruto al cual se les descuenta un 11%
de jubilación.
Se necesita un programa que, dependiendo el tipo de empleado del que se trate,
calcule y muestre en pantalla el correspondiente sueldo.*/ 
        System.out.println("Ingrese el número correspondiente al tipo de empleado: "
                + "1: repositor "
                + "2: cajero "
                + "3: supervisor");
        Scanner teclado = new Scanner(System.in); 
        int tipoDeEmpleado; 
        tipoDeEmpleado = teclado.nextInt(); 
        
        if (tipoDeEmpleado == 1){
            double bono = 15890 * 0.10; 
            double sueldo; 
            sueldo = 15890 + bono; 
            System.out.println("El empleado es un repositor, por lo tanto debe cobrar $" + sueldo);
        }
        else { 
            if (tipoDeEmpleado == 2){
                double sueldo; 
                sueldo = 25630.89; 
                System.out.println("El empleado es un cajero, por lo tanto debe cobrar $" + sueldo);
            }
            else { 
                if (tipoDeEmpleado == 3) {
                    double descuentoJubilacion; 
                    descuentoJubilacion = 35560.20 * 0.11; 
                    double sueldo; 
                    sueldo = 35560.20 - descuentoJubilacion;
                    System.out.println("El empleado es un supervisor, por lo tanto debe cobrar $" + sueldo);
                }
                else { 
                    System.out.println("El tipo de empleado ingresado es incorrecto");
                }
            }
        } 
    }
    
}
