package uce.edu.ec.pa.interceptores;

import jakarta.interceptor.AroundInvoke;
import jakarta.interceptor.Interceptor;
import jakarta.interceptor.InvocationContext;
import uce.edu.ec.pa.Pedido;

@TiempoAuditoria
@Interceptor

public class TiempoAuditoriaInterceptor {

    @AroundInvoke
    public Object auditar(InvocationContext context) throws Exception {

        Pedido p = (Pedido) context.getParameters()[0];

        long init = System.currentTimeMillis();
        Object resultado = context.proceed();
        long fin = System.currentTimeMillis() - init;

        System.out.println("DURACION:" + p.getCodigo() + " | MS:" + fin);
        System.out.println("TIEMPO:" + p.getCodigo() + " | OK");
        

        return resultado;
    }
}
