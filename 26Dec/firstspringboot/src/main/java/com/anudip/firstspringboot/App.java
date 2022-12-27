package com.anudip.firstspringboot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("com/anudip/firstspringboot/applicationText.xml");
    	User u1 = context.getBean("u1",User.class);
    	System.out.println(u1);
    }
}
