package com.anudip.LabAssessment15Dec;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
 
public class UpdateQuery {
 
    public static void main(String[] args) {
        SessionFactory sf = HibernateUtility.getSessionFactory();
        Session session = sf.openSession();
        //Supressing the Query deprecation        	
        @SuppressWarnings("rawtypes")
        Query query = session.createQuery("update Applicant set age=:age where id=:id");
        query.setParameter("age", 30);
        query.setParameter("id", 1);
        // Begin transaction
        Transaction t = session.beginTransaction();
        int result = query.executeUpdate();
        // Commit the transaction and close the session
        t.commit();
        System.out.println("No of rows updated: "+result);
       
        session.close();
    }
 
 
 
}