package torryharris.OCT_13_MyIOCAnnotationDemo;

import java.lang.annotation.Annotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import torryharris.Address;
import torryharris.Customer;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
       context.scan("torryharris");
       context.refresh();
       
       Customer cust = (Customer)context.getBean("customer");
       
       cust.setCustId("100");
       cust.setCustName("Raama");
       Address addrs = cust.getAddress();
       addrs.setDoorNo("557");
       addrs.setStreet("GangaNagar");
       addrs.setState("Karnataka");
       addrs.setPin("585446");
       
       System.out.println(cust);
       context.close();
       
    }
}
