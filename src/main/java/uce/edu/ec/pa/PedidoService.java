package uce.edu.ec.pa;

import jakarta.enterprise.context.ApplicationScoped;
import uce.edu.ec.pa.extenciones.Descuento;
import uce.edu.ec.pa.interceptores.Notificacion;
import uce.edu.ec.pa.interceptores.TiempoAuditoria;

@ApplicationScoped 
public class PedidoService {

    @TiempoAuditoria 
    @Notificacion 
    public void procesar (Pedido pedido, Descuento descuento){

       
       // System.out.println("Codigo: "+ pedido.getCodigo());
       // System.out.println("Producto: "+ pedido.getProducto());
       // System.out.println("Valor original: "+ pedido.getValorOriginal());
      //  System.out.println("Cliente: "+pedido.getCliente());

      pedido.setValorFinal( descuento.calcular(pedido.getValorOriginal()));
        System.out.println("PEDIDO:"+ pedido.getCodigo()+ "|TOTAL: "+ pedido.getValorFinal());


    }
}
