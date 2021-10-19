package torryharris.OCT_13_Spring_IOC_Assignment;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import torryharris.Address;
import torryharris.Chair;
import torryharris.Student;


public class App 
{
    public static void main( String[] args )
    {
       
    	AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.scan("torryharris");
        context.refresh();
        
        Student  stud = (Student)context.getBean("student");
        
        stud.setId(01);
        stud.setName("Raama");
        Address addrs = stud.getAddress();
        addrs.setDoorNo("100");
        addrs.setStreet("seeta");
        addrs.setState("Ayodhya");
        addrs.setPin("000001");
        
        Chair chair = stud.getChair();
        chair.setColor("Red");
        chair.setType("Study Chair");
        
        System.out.println(stud);
        context.close();
    	
    	
    	
    }
}
