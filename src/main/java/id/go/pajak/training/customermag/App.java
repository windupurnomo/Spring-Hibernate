package id.go.pajak.training.customermag;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class App 
{	
    public static void main( String[] args )
    {
//    	SpringApplication.run(App.class, args);
    	SpringApplication.run("classpath:/beans.xml", args);
    	
        /*ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        CustomerService svc = (CustomerService) context.getBean("customerServiceImpl");
        
        Customer c = new Customer();
        c.setName("windu");
        c.setPhone("890900");
        svc.create(c);*/
    }
}
