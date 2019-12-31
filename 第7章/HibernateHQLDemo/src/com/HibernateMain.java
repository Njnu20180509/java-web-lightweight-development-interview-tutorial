package com;


import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;


public class HibernateMain {
	public static void main(String[] args) {
		
		StandardServiceRegistry registry = null;
        SessionFactory sessionFactory = null;
        try{
            registry = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
            sessionFactory = new MetadataSources(registry).buildMetadata().buildSessionFactory();
        }catch(Exception ex){
            ex.printStackTrace();
            StandardServiceRegistryBuilder.destroy(registry);
        }
        
        Session session = sessionFactory.openSession();
        
        //1 ��Object�������ʽ�����ֶ�        
        List<Object[]> accountList = (List<Object[]>)session.createQuery("select name,bank,balance from Account where balance < :highBalance and balance > :lowBalance").setParameter("highBalance",800.0f).setParameter("lowBalance", 50.0f).list();

        for(int i=0;i<accountList.size();i++)
        {
        	Object[] one = accountList.get(i);
        	System.out.println(one[0] + "\t" + one[1]  + "\t" + one[2]);
        }
        
        //2 ��group by����ʽ
        List<Object[]> groupbyDemoList = (List<Object[]>)session.createQuery("select name,bank,count(*) from Account group by name,bank having count(*)>1").list();
        
        for(int i=0;i<groupbyDemoList.size();i++)
        {
        	Object[] one = groupbyDemoList.get(i);
        	System.out.println(one[0] + "\t" + one[1]  + "\t" + one[2]);
        }
        
        session.close();
		sessionFactory.close(); 
   
	}
}
