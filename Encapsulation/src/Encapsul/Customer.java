package Encapsul;

class Customer {
	
	private String customerName;
	private int customerID;
	private long customerContact;
	private String address;
	
	

	public String getCustomerName() {
		return customerName;
	}



	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}



	public int getCustomerID() {
		return customerID;
	}



	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}



	public long getCustomerContact() {
		return customerContact;
	}



	public void setCustomerContact(long customerContact) {
		this.customerContact = customerContact;
	}



	public String getAddress() {
		return address;
	}



	public void setAddress(String address) {
		this.address = address;
	}


}

class tester {
	
	public static void main(String[] args) {
		
		Customer cust = new Customer();
		cust.setCustomerName("Hridita");
		cust.setCustomerID(11190);
		cust.setCustomerContact(5167771111L);
		cust.setAddress("50 Null Lane, San Diageo, CA 11909");
		
		System.out.println("Displaying Customer details:");
		System.out.println(cust.getCustomerName());
		System.out.println(cust.getCustomerID());
		System.out.println(cust.getCustomerContact());
		System.out.println(cust.getAddress());
	}

}
