
package diapos.ejercicio3;

public class DiaposEjercicio3 {

    
    public static void main(String[] args) {
        /*Realizar un programa que muestre por pantalla los números del 
        200 al 250 saltando de dos en dos. La secuencia debería ser: 
        200...201...204...etc.*/
        int numero = 200; 
        while (numero >= 200 && numero <= 250){
            System.out.println(numero);
            numero = numero + 2; 
        }
    }
    
}
