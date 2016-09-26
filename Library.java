package in.ac.kletech.library;

public class Library {
	private static final String Penalty = null;
	private int iVisitingTime;
	private String sSection;
	private int iPenalty;
	private int iBookLedingTime;
	public Library(int iVisitingTime, String sSection,int iBookLedingTime) {
		super();
		this.iVisitingTime = iVisitingTime;
		this.sSection = sSection;
		this.iBookLedingTime = iBookLedingTime;
	}
	public int getiVisitingTime() {
		return iVisitingTime;
	}
	public String getsSection() {
		return sSection;
	}
	public int getiPenalty() {
		return iPenalty;
	}
	public int getiBookLedingTime() {
		return iBookLedingTime;
	}
	
	
	boolean ReferenSelection(){
		if(iVisitingTime>4)
			return false;
		else
			return true;
		
		
	}
	void LendingSection(){
		if(iBookLedingTime>0&& iBookLedingTime<=7)
			iPenalty=20;
		else if(iBookLedingTime>7&& iBookLedingTime<=14)
			iPenalty=50;
		else if(iBookLedingTime>14&& iBookLedingTime<=21)
			iPenalty=150;
		else
			iPenalty=300;
		System.out.println("penalty="+Penalty);
		
	}
	void DigitalLibrary(){
		System.out.println("timings of digital library is 2 hour from 4:00pm to 6:00pm");
	}
	
	void QuestionPaper(){
		String department=null,year=null;
		if(sSection==department)
			System.out.println("question paper set1");
		else if(sSection==year)
			System.out.println("question paper set2");
	}
	
	
	
	
	
	
	
	
}
