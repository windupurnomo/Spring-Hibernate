package id.go.pajak.training.customermag;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import id.go.pajak.training.customermag.model.Customer;
import id.go.pajak.training.customermag.service.CustomerService;


public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        CustomerService svc = (CustomerService) context.getBean("customerServiceImpl");
        
        Customer c = new Customer();
        c.setName("windu");
        c.setPhone("890900");
        svc.create(c);
    }
}
