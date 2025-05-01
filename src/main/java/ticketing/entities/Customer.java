package ticketing.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "ticketing_customer_data_table")
public class Customer {
	
	@Column
	private String customerName;
	
	@Column
	private String customerMobile;
	
	@Column
	private String email;
	
	@Column
	private String password;

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerMobile() {
		return customerMobile;
	}

	public void setCustomerMobile(String customerMobile) {
		this.customerMobile = customerMobile;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Customer(String customerName, String customerMobile, String email, String password) {
		super();
		this.customerName = customerName;
		this.customerMobile = customerMobile;
		this.email = email;
		this.password = password;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Customer [customerName=" + customerName + ", customerMobile=" + customerMobile + ", email=" + email
				+ ", password=" + password + "]";
	}
	
}
