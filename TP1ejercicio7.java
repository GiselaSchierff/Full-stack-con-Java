
package tp1ejercicio7;


public class TP1ejercicio7 {

   
    public static void main(String[] args) {
        /* Realizar un programa que permita intercambiar el valor de dos variables.
Por ejemplo, si la variable1 vale 5 y la variable2 vale 12, hacer que la
variable1 valga 12 y la variable2 valga 5. Tener en cuenta que al asignar
un valor a una variable se sobrescribe el valor anterior.*/
        double variable1; 
        double variable2; 
        double variableIntermedia; 
        
        variable1 = 5; 
        variable2 = 12; 
        
        System.out.println("La variable 1 vale: " + variable1);
        System.out.println("La variable 2 vale: " + variable2);
        
        variableIntermedia = variable2; 
        variable2 = variable1; 
        variable1 = variableIntermedia; 
        
        System.out.println("La variable 1 ahora vale: " + variable1);
        System.out.println("La variable 2 ahora vale: " + variable2);
                
    }
    
}
