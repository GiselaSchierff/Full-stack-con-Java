
package Logica;


public class Cliente {
    //atributos
    String dni; 
    String nombre; 
    String apellido; 
    String cel; 

    public Cliente() {
    }

    public Cliente(String dni, String nombre, String apellido, String cel) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.cel = cel;
    }
    
    public String avisarCelular(){
        return cel; 
    }
    
    public void anotarNombreYApellido(String nombre, String apellido){
        String nombreCliente = nombre; 
        String apellidoCliente = apellido; 
        System.out.println("El nombre completo del cliente es: " + nombre + " " + apellido);
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCel() {
        return cel;
    }

    public void setCel(String cel) {
        this.cel = cel;
    }
    
    
    
}
