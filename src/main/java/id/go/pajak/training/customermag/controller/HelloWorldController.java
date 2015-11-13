package id.go.pajak.training.customermag.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import id.go.pajak.training.customermag.model.Customer;

@Controller
@RequestMapping("/hello-world")
public class HelloWorldController {

	
	@RequestMapping(method = RequestMethod.GET)
	public @ResponseBody Customer sayHello(
			@RequestParam(value = "name", required = false, defaultValue = "Stranger") String name) {
		Customer c = new Customer();
		c.setId("a");
		c.setName("asdf");
		return c;
	}

}
