package com.anudip.Dec;

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
    	UserClass uc = new UserClass();
    	//1st User    	
    	uc.setDept("Web Developer");
    	uc.setPassword(1234);
    	uc.setUname("Kaustubh Wahane");
    	//2nd User    	
    	uc.setDept("Java Developer");
    	uc.setPassword(69);
    	uc.setUname("Anushkta Tiwari");
    	//3rd User    	
    	uc.setDept("Software Engineer");
    	uc.setPassword(1206);
    	uc.setUname("Praful Kotawar");
    	Configuration cfg = new Configuration().configure().addAnnotatedClass(UserClass.class);
        SessionFactory factory = cfg.buildSessionFactory();
        Session ses = factory.openSession();
        ses.beginTransaction();
        ses.save(uc);
	    /*
	   	To Retrieve the data we can uncomment this method
	   	ses.get(uc);
	   	*/
        ses.getTransaction().commit();
        ses.close();
    }
}
