package uce.edu.ec.pa.interceptores;

import jakarta.interceptor.AroundInvoke;
import jakarta.interceptor.Interceptor;
import jakarta.interceptor.InvocationContext;
import uce.edu.ec.pa.Pedido;

@Notificacion 
@Interceptor 

public class NotificacionInterceptor {

     @AroundInvoke 
    public Object auditar (InvocationContext context) throws Exception {


        Pedido p = (Pedido) context.getParameters()[0];

        Object resultado = context.proceed();

        System.out.println("NOTIFICACION:"+ p.getCodigo());

        return resultado;
    }

}
