import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

public class AfterAdvice implements AfterReturningAdvice
{
     public void afterReturning(Object returnValue, Method m, Object[] args, Object target)throws Throwable
 {
    	  System.out.println("�ڷ�������֮��");
    	  System.out.println("ִ�еķ�����:" + m);
    	  System.out.println("�����Ĳ����ǣ�" + args[0]);
    	  System.out.println("Ŀ������ǣ�" + target);
    }
}