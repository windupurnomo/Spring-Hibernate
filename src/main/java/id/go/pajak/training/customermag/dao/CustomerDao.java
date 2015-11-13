package id.go.pajak.training.customermag.dao;

import java.util.List;

import id.go.pajak.training.customermag.model.Customer;

public interface CustomerDao {
	public void create(Customer customer);
	public List<Customer> get();
}
