

package tp3ejercicio1a;


public class TP3ejercicio1a {

    
    public static void main(String[] args) {
        /*a) Realizar un programa que muestre en pantalla los números del 1 al 35 (uno
abajo del otro). Utilizar para esto alguna estructura repetitiva.*/
        int limiteInferior = 1; 
        int limiteSuperior = 35; 
        
        while (limiteInferior <= limiteSuperior) { 
            System.out.println(limiteSuperior);
            limiteSuperior = limiteSuperior - 1; 
        }
        
    }
    
}
