
package diapos.ejerccio5;

import java.util.Scanner;


public class DiaposEjerccio5 {

    
    public static void main(String[] args) {
        /*Realizar un programa que muestre en pantalla palabras que sean 
        imgresadas por teclado hasta que se ingrese la palabra "salir"*/
        
        System.out.println("Ingresar una palabra: ");
        Scanner text = new Scanner(System.in); 
        String texto = text.nextLine(); 
        
        while (!texto.equals("salir")){
            System.out.println(" ");
            System.out.println(texto);
            System.out.println(" ");
            System.out.println("Ingrese otra palabra: ");
            Scanner textNuevo = new Scanner(System.in); 
            texto = textNuevo.nextLine(); 
            
        }
        
    }
    
}
