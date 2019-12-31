import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;


public class AroundInterceptor implements MethodInterceptor
{
     public Object invoke(MethodInvocation invocation) throws Throwable
 {
         System.out.println("���÷���֮ǰ: invocation����[" + invocation + "]");
         Object rval = invocation.proceed();
         System.out.println("���ý���...");
         return rval;
    }
}