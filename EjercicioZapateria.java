
package Logica;

public class EjercicioZapateria {

    
    public static void main(String[] args) {
        //creo un objeto mediante un constructor con parámetros
        Cliente cli = new Cliente("12345678", "Hugo", "Jujuy", "0375515986532"); 
        //creo un objeto mediante un constructor vacio
        Cliente cliVacio = new Cliente();  
        
        
        System.out.println("---Antes---");
        System.out.println(cli.getApellido());
        System.out.println(cliVacio.getApellido());
        
        
        cliVacio.setDni("15236589");
        cliVacio.setNombre("Gustavo");
        cliVacio.setApellido("Fring");
        cliVacio.setCel("0376154889653");
        
        System.out.println("---Después---");
        System.out.println(cliVacio.getApellido());
        
        cli.setApellido("Rodriguez");
        System.out.println("---Después---");
        System.out.println(cli.getApellido());
       
    }
    
}
