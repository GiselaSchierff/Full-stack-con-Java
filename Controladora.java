
package Logica;


public class Controladora {
    String nombres[] = new String[5]; 
    public void agregarNombre( String nombreAgregar){ 
        for (int i = 0; i < nombres.length; i++){
             
            if (nombres[i] == null){ 
                nombres[i] = nombreAgregar; 
                
                System.out.println("se llena el i (interno) " + i  + " y el nombre es " + nombres[i] );
                i = nombres.length; 
            }
        }
    }

    public boolean buscarNombre(String nombreBuscar){ 
        boolean estaONoEsta = false; 
        for (int i = 0; i < nombres.length; i++){
            if (nombres[i].equals(nombreBuscar)){
                estaONoEsta = true; 
                
            }
        }
                    
        return estaONoEsta;        
                
    }    
}
