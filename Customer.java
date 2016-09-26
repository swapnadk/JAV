package in.ac.kletech.library;

public class Customer{
	int icustomerID;
	int scustomerName;
	long lphoneNum;
	float fbillAmount;
	public Customer(int icustomerID, int scustomerName, long lphoneNum,
			float fbillAmount) {
		super();
		this.icustomerID = icustomerID;
		this.scustomerName = scustomerName;
		this.lphoneNum = lphoneNum;
		this.fbillAmount = fbillAmount;
	}
	void printCustomerImfo(){
		System.out.println("customer id is="+icustomerID);
		System.out.println("name of the customer is="+scustomerName);
		System.out.println("phone number is="+lphoneNum);
		System.out.println("bill amunt is="+fbillAmount);
	}
	void computBillAmount(){
		
		
	}
	
	class RegularCustomer extends Customer{
		float fdiscount;

		 RegularCustomer(int icustomerID, int scustomerName, long lphone,
				float fbillAmount, float fdiscount) {
			super(icustomerID, scustomerName, lphone, fbillAmount);
			this.fdiscount = fdiscount;
		}
		
		void computBillAmount(){
			fbillAmount=fbillAmount-(0.5f*fbillAmount);
			System.out.println("bill amount is="+fbillAmount);
		}
		
		
		class PriviledCustomer extends Customer{
			String smemberCardType;

			 PriviledCustomer(int icustomerID, int scustomerName,
					long lphone, float fbillAmount, String smemberCardType) {
				super(icustomerID, scustomerName, lphone, fbillAmount);
				this.smemberCardType = smemberCardType;
			}
			
		
			void computBillAmount(){
				if(smemberCardType=="gold")
					fbillAmount=fbillAmount-(fbillAmount*0.15f);
				    System.out.println("bill amount is="+fbillAmount);
			 if(smemberCardType=="silver")
				fbillAmount=fbillAmount-(fbillAmount*0.20f);
				System.out.println("bill amount is="+fbillAmount);
			 if(smemberCardType=="bronze")
				 fbillAmount=fbillAmount-(fbillAmount*0.30f);
					System.out.println("bill amount is="+fbillAmount);
			
				
			}
			
		}
	}
}
