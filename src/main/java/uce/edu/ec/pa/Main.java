package uce.edu.ec.pa;

import io.quarkus.runtime.Quarkus;
import io.quarkus.runtime.QuarkusApplication;
import io.quarkus.runtime.annotations.QuarkusMain;
import jakarta.inject.Inject;
import uce.edu.ec.pa.extenciones.DescuentoNormalService;
import uce.edu.ec.pa.extenciones.DescuentoTerceraEdadService;
import uce.edu.ec.pa.extenciones.DescuentoVipService;

@QuarkusMain 
public class Main implements QuarkusApplication{

    @Inject 
    private PedidoService pedidoService;
    
    @Inject 
    private DescuentoNormalService descN;


    @Inject 
    private DescuentoTerceraEdadService descTer;

    @Inject 
    private DescuentoVipService descV;

    public static void main(String[] args) {
        Quarkus.run(Main.class, args);
    }

    @Override
    public int run(String... args) throws Exception {
        System.out.println("INICIO_EVALUACION");

        Pedido p1 = new Pedido("P001", "Laptop", 1000.00, "VIP");
        Pedido p2 = new Pedido("P002", "Mouse", 100.00, "NORMAL");
        Pedido p3 = new Pedido("P003", "Teclado", 200.00, "TERCERA_EDAD");

        pedidoService.procesar(p1, descV);
        pedidoService.procesar(p2, descN);
        pedidoService.procesar(p3, descV);


         System.out.println("FIN_EVALUACION");

        System.out.println("172219-ec");


        return 0;  
    }

}
