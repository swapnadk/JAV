package in.ac.kletech.library;

public class CustomerDemo {

	/*
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer c[]=new Customer[5];
		PriviledCustomer regcust1(11,"sappi",8126453411l,2000);
		c[0].computBillAmount();
		c[1]=new PriviledCustomer(22,"ashh",8177453411l,3000);
		c[1].computBillAmount();
		c[2]=new PriviledCustomer(33,"poo",8126403411l,7000);
		c[2].computBillAmount();
		c[3]=new PriviledCustomer(55,"sam",8126223411l,4000);
		c[3].computBillAmount();
		c[4]=new PriviledCustomer(44,"sushh",8186473411l,5000);
		c[4].computBillAmount();
		
	}

}

		