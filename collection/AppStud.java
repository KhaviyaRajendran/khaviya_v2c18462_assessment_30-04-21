package com.springcore.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class AppStud {
	public static void main( String[] args )
    {
    	// create and configure beans
    	
    	ApplicationContext context= new ClassPathXmlApplicationContext("com/springcore/collection/configstud1.xml");
    	Student1 stud1=(Student1)context.getBean("Stud");
    	System.out.println(stud1.getId());
    	System.out.println(stud1.getParents());
    	System.out.println(stud1.getPhones());
    	System.out.println(stud1.getSubject());
    }
}
