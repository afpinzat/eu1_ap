package uce.edu.ec.pa.extenciones;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped 
public class DescuentoVipService implements Descuento{

    @Override
    public double calcular(double valOriginal) {
        return valOriginal-(valOriginal*0.1);
    }

}
