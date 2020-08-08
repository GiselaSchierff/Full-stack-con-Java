
package diapos.ejercicio4;


public class DiaposEjercicio4 {

    
    public static void main(String[] args) {
        /*Realizar un programa que lleve a cabo ka cuenta regresiva para el 
        año nuevo. La cuenta debe comenzar en 10 y terminar en 1       
        */
        int maximoCuenta = 10; 
        int minimoCuenta = 1; 
        while (maximoCuenta >= minimoCuenta){ 
            System.out.println(maximoCuenta);
            maximoCuenta = maximoCuenta - 1; 
        }
        
    }
    
}
