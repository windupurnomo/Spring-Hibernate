package id.go.pajak.training.customermag.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import id.go.pajak.training.customermag.model.Customer;
import id.go.pajak.training.customermag.service.CustomerService;

@RestController
@RequestMapping("/customer")
public class CustomerController {

	@Autowired
	private CustomerService customerService;

	@RequestMapping(method = RequestMethod.GET)
	public @ResponseBody Customer get(
			@RequestParam(value = "name", required = false, defaultValue = "Stranger") String name) {
		Customer c = new Customer();
		c.setId("a");
		c.setName("asdf");
		return c;
	}

//	@RequestMapping(path = "/new", method = RequestMethod.GET)
//	public Customer getNew() {
//		return new Customer();
//	}

	@RequestMapping(method = RequestMethod.POST)
	public @ResponseBody Customer add(@RequestBody Customer customer) {
		customerService.create(customer);
		return customer;
	}
}
