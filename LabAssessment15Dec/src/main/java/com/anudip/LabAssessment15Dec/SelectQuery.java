package com.anudip.LabAssessment15Dec;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

 
public class SelectQuery {
    public static void main(String[] args) {
        SessionFactory sf = HibernateUtility.getSessionFactory();
        Session session = sf.openSession();
        @SuppressWarnings("rawtypes")
        Query query = session.createQuery("from Applicant");
        List<Applicant> list = query.getResultList();
        System.out.println("Number of Applicants present--> "+list.size());
        for (Applicant applicant : list) {
            System.out.println(applicant.getApplicantId());
            System.out.println(applicant.getFirstName());
        }
       
        session.close();
    }
 
}
