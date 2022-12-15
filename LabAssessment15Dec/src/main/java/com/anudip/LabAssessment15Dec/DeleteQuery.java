package com.anudip.LabAssessment15Dec;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
 
public class DeleteQuery {
 
    public static void main(String[] args) {
        SessionFactory sf = HibernateUtility.getSessionFactory();
        Session session = sf.openSession();
        @SuppressWarnings("rawtypes")
		Query query = session.createQuery("delete from ApplicantBackup where id=:id");
        query.setParameter("id", 1);
        Transaction t = session.beginTransaction();
        int result = query.executeUpdate();
        t.commit();
        System.out.println("No of rows Deleted: "+ result);
        session.close();
    }
 
}