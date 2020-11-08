
package Logica;


public class Producto {
    //atributos
    int codigo; 
    String talle; 
    String color; 
    String marca; 
    String material; 
    String tipo; 
    int cantidad; 

    public Producto() {
    }

    public Producto(int codigo, String talle, String color, String marca, String material, String tipo, int cantidad) {
        this.codigo = codigo;
        this.talle = talle;
        this.color = color;
        this.marca = marca;
        this.material = material;
        this.tipo = tipo;
        this.cantidad = cantidad;
    }
    
    public String avisarMarcaPedido (){
        return marca; 
    }
    
    public void anotarCodigoPedido (int codigo){
        int codigoPedido = codigo; 
        System.out.println("El código del pedido " + codigoPedido + " fue anotado");
    }
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getTalle() {
        return talle;
    }

    public void setTalle(String talle) {
        this.talle = talle;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    
}
