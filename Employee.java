package in.ac.kletech;

public class Employee {
	int iEmpID;
	String sEmpName;
	float fEmpBasicSalary;
	float fAllowance;
	float fTax;
	float fNetPay;
	float fGrossSalary;

 Employee(int iEmpID, String sEmpName, float fEmpBasicSalary,float Allowance)
			 {
		
		this.iEmpID = iEmpID;
		this.sEmpName = sEmpName;
		this.fEmpBasicSalary = fEmpBasicSalary;
		this.fAllowance = fAllowance;
			 }

	void calNetSalary(){
		
		fAllowance=fEmpBasicSalary*0.46f;
		fGrossSalary=fEmpBasicSalary+fAllowance;
		
		if(fGrossSalary<5000)
			fTax=fGrossSalary;
		
		else if(fGrossSalary>=5001&&fGrossSalary<=10000)
			fTax=fGrossSalary*0.1f;
			
		else if(fGrossSalary>=10001&&fGrossSalary<=20000)
			fTax=fGrossSalary*0.2f;
		
		else if(fGrossSalary>20001)
			fTax=fGrossSalary*0.3f;
		
		
		fNetPay=fGrossSalary+fTax;
		
		
		System.out.println("Employee id="+iEmpID);
		System.out.println("BasicSalary="+fEmpBasicSalary);
		System.out.println("Allowance="+fAllowance);
		System.out.println("Gross Salary="+fGrossSalary);
		System.out.println("income tax="+fTax);
		System.out.println("net salary="+fNetPay);
	}
	}