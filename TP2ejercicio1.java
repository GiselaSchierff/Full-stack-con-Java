
package tp2ejercicio1;


public class TP2ejercicio1 {

    
    public static void main(String[] args) {
        /* a.Declarar una variable de tipo entero, otra de tipo double y otra de tipo
String.*/ 
        int variableEntero; 
        double variableDouble; 
        String variableString; 
        /*b.Asignar un valor a la variable de tipo entero y asignar esta última a
la variable de tipo double. ¿Existe un error? ¿Se puede hacer esta
operación? RTA: se puede hacer la operación, no exite ningún error */
        variableEntero = 10; 
        variableDouble = variableEntero; 
        /*c.Asignar un valor a la variable de tipo double y asignar esta última a
la variable de tipo entero. ¿Existe un error? ¿Se puede hacer esta
operación? RTA: Existe un un error de incompatibilidad de tipos de datos */
        //variableDouble = 2.5; 
       // variableEntero = variableDouble; 
       /*d.Asignar el valor 35 a la variable de tipo String. ¿Existe un error? ¿Se
puede hacer esta operación? RTA: Poniendo al dato entre comillas no se visualiza
       ningún error, pero cuando no se hace esto, se visualiza un error de 
       incompatibilidad de tipos de datos */
       //variableString = 35; 
       variableString = "35"; 
       /*e.Si quiero almacenar el número 48 en la variable String. ¿Cómo debo
realizar la asignación? RTA: se debe encerrar al dato numérico entre comillas 
       para realizar la asignación */
       variableString = "48"; 
    }
    
}
