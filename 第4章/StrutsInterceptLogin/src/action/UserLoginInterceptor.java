package action;

import java.util.Map;
import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;
import action.LoginAction;

public class UserLoginInterceptor extends AbstractInterceptor {

	private static final long serialVersionUID = 1L;

	public String intercept(ActionInvocation arg0) throws Exception {
    	// �ж��Ƿ�����Ϊ��¼����(login),�����������
        if (LoginAction.class == arg0.getAction().getClass())
        {
             return arg0.invoke();
        }
        
       // �������������ҳ�棬��������
         Map sessionMap = arg0.getInvocationContext().getSession();
         if (null == sessionMap.get("username"))
         {
             System.out.println("in LoginInterceptor, the Username is null.");
        	 return Action.LOGIN;
         }
 
         return arg0.invoke();
     }
}
