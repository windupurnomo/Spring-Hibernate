package id.go.pajak.training.customermag;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class App 
{	
    public static void main( String[] args )
    {
    	SpringApplication.run("classpath:/beans.xml", args);
    }
}
