package service;

public class CheckUser {
   //�ж��û��Ƿ����
	     public static boolean isUser(String username, String password)
	     {
	         String name = username.trim();
	         String pwd = password.trim();
	        
	         if(name.equals("Java") && pwd.equals("StrutsIntercept"))
	         {
	             return true;
	         }
	         return false;
	     }
	}    
