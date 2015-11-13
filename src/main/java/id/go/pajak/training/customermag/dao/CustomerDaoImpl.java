package id.go.pajak.training.customermag.dao;

import java.util.List;
import java.util.UUID;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import id.go.pajak.training.customermag.model.Customer;

@Repository
@Transactional(readOnly=true)
public class CustomerDaoImpl implements CustomerDao{
	
	@Autowired
	private SessionFactory sessionFactory;
	
	@Transactional(readOnly=false)
	public void create(Customer customer) {
		customer.setId(UUID.randomUUID().toString());
		Session session = sessionFactory.openSession();
		session.save(customer);
		session.flush();
	}
	
	public List<Customer> get(){
		Session session = sessionFactory.openSession();
		Query query = session.createQuery("from Customer");
		return query.list();
	}

}
