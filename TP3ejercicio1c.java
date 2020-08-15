
package tp3ejercicio1c;


public class TP3ejercicio1c {

    
    public static void main(String[] args) {
       /*c) Realizar un algoritmo que muestre por pantalla los números del 200 al 250
saltando de 2 en dos. La secuencia debería ser: 200...202...204...etc.*/
       int limiteInferior, limiteSuperior; 
       limiteInferior = 200; 
       limiteSuperior = 250; 
       
       while (limiteInferior <= limiteSuperior){
           System.out.println(limiteInferior);
           limiteInferior = limiteInferior + 2;
       }
    }
    
}
