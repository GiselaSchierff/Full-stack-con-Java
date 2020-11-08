
package Logica;

import java.util.Date;

public class Pedido {
    //atributos
    int numero; 
    Date fechaPedido; 

    public Pedido() {
    }

    public Pedido(int numero, Date fechaPedido) {
        this.numero = numero;
        this.fechaPedido = fechaPedido;
    }
    
    public Date avisarFechaPedido (){
        return fechaPedido; 
        
    }
    
    public void anotarNumeroPedido (int numero) {
        int numeroPedido = numero; 
        System.out.println("El número del pedido " + numeroPedido + " fue anotado exitosamente");
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Date getFechaPedido() {
        return fechaPedido;
    }

    public void setFechaPedido(Date fechaPedido) {
        this.fechaPedido = fechaPedido;
    }
    
    
}

