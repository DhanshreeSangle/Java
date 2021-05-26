

public class TestCustomer {

	public static void main(String[] args) {
		
		Customer c1=new Customer();
		
		c1.acceptInfo();
		c1.showDetails();
		c1.setCreditLimit(20000);
		c1.getCreditLimit();
		c1.showDetails();
		
		Customer c2=new Customer();
		
		c2.acceptInfo();
		c2.showDetails();
		c2.setCreditLimit(50000);
		c2.getCreditLimit();
		c2.showDetails();
	}

}
