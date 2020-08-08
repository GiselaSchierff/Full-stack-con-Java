
package tp1ejercicio4;

import java.util.Scanner;


public class TP1ejercicio4 {

 
    public static void main(String[] args) {
       /* Realizar un programa que calcule el IVA de un producto. Para esto, el
usuario debe poder ingresar por teclado el valor del producto y el programa
debe informarle por pantalla qué monto equivale al IVA. Recordar que el IVA
es igual al 21% (0,21).*/ 
       
        System.out.println("Ingrese el valor del producto: ");
        Scanner valProd = new Scanner(System.in); 
        double valorDelProducto = valProd.nextDouble(); 
        
        double iva = 0.21; 
       
        double ivaDelProducto; 
        ivaDelProducto = valorDelProducto * iva; 
        System.out.println("El IVA del producto es de: " + ivaDelProducto);
    }
    
}
