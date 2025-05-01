package ticketing.services;

import ticketing.entities.Customer;

public interface CustomerService {
	public int createUser(Customer customer);
	
	public int login(String userId, String password);
}
