
package tp3ejercicio1d;


public class TP3ejercicio1d {

    
    public static void main(String[] args) {
        /*d) Realizar un algoritmo que lleve a cabo la cuenta regresiva para el año
nuevo. La cuenta debe comenzar en 10 y terminar en 1.*/ 
        int limiteSuperior, limiteInferior; 
        limiteSuperior = 10; 
        limiteInferior = 1; 
        
        while (limiteSuperior >= limiteInferior){
            System.out.println(limiteSuperior);
            limiteSuperior = limiteSuperior - 1; 
        }
    }
    
    
}
