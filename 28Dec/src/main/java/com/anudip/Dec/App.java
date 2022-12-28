package com.anudip.Dec;

import java.applet.AppletContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	AppletContext context = new ClasspathXmlApplicationContext("com/anudip/Dec/Collectionconfig.xml");
    	Employee emp1 = (Employee)context.getBean("emp1");
    	System.out.println(emp1.getEname());
    	System.out.println(emp1.getContacts());
    	System.out.println(emp1.getPhones());
    	
    	
    }
}
