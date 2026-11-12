package uce.edu.ec.pa;

public class Pedido {

    private String codigo;
    private String producto;
    private double valorOriginal;
    private String cliente;
    private double valorFinal;


   


    public Pedido(String codigo, String producto, double valorOriginal, String cliente) {
        this.codigo = codigo;
        this.producto = producto;
        this.valorOriginal = valorOriginal;
        this.cliente = cliente;
        this.valorFinal = valorOriginal;
    }


    public String getCodigo() {
        return codigo;
    }


    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }


    public String getProducto() {
        return producto;
    }


    public void setProducto(String producto) {
        this.producto = producto;
    }


    public double getValorOriginal() {
        return valorOriginal;
    }


    public void setValorOriginal(double valorOriginal) {
        this.valorOriginal = valorOriginal;
    }


     public String getCliente() {
        return cliente;
    }


    public void setCliente(String cliente) {
        this.cliente = cliente;
    }


    public double getValorFinal() {
        return valorFinal;
    }


    public void setValorFinal(double valorFinal) {
        this.valorFinal = valorFinal;
    }


   

    

    
}
