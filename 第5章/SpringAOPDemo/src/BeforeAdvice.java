import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

public class BeforeAdvice implements MethodBeforeAdvice
{
     public void before(Method m, Object[] args, Object target) throws Throwable
 {
  System.out.println("�ڷ�������֮ǰ");
  System.out.println("ִ�еķ�����:" + m);
  System.out.println("�����Ĳ����ǣ�" + args[0]);
  System.out.println("Ŀ������ǣ�" + target);
     }
}
