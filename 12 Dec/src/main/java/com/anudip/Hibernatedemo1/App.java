package com.anudip.Hibernatedemo1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;



/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       Employee e1 = new Employee();
       e1.setEid(5);
       e1.setEname("Kaustubh");
       e1.setDept("HR");
       Configuration c1 = new Configuration().configure().addAnnotatedClass(Employee.class);  
       SessionFactory sf = c1.buildSessionFactory();
       Session ss = sf.openSession();
       ss.beginTransaction();
       ss.save(e1);
       ss.getTransaction().commit();
       ss.close();
       
    }
}
