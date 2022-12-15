package com.anudip.LabAssessment15Dec;

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
    	Applicant a1 = new Applicant();
    	a1.setApplicantId(05);
    	a1.setEducation("JavaCourse");
    	a1.setAge(20);
    	a1.setFirstName("Kaustubh");
    	a1.setLastName("Wahane");
         Configuration c1 = new Configuration().configure().addAnnotatedClass(Applicant.class);  
         SessionFactory sf = c1.buildSessionFactory();
         Session ss = sf.openSession();
         ss.beginTransaction();
         ss.save(a1);
         ss.getTransaction().commit();
         ss.close();
    }
}
