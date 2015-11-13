package id.go.pajak.training.customermag.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import id.go.pajak.training.customermag.dao.CustomerDao;
import id.go.pajak.training.customermag.model.Customer;

@Service
public class CustomerServiceImpl implements CustomerService {
	
	@Autowired
	private CustomerDao customerDao;
	
	public void create(Customer customer) {
		customerDao.create(customer);
	}
	
	public List<Customer> get(){
		return customerDao.get();
	}
	
}
