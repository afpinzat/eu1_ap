package uce.edu.ec.pa.extenciones;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped 
public class DescuentoTerceraEdadService implements Descuento{

    @Override
    public double calcular(double valOriginal) {
        return valOriginal-(valOriginal*0.15);
    }

}