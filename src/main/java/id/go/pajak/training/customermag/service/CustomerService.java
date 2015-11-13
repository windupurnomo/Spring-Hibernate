package id.go.pajak.training.customermag.service;

import java.util.List;

import id.go.pajak.training.customermag.model.Customer;

public interface CustomerService {
	public void create(Customer customer);
	public List<Customer> get();
}
