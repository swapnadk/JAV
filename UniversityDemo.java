package in.ac.kletech.library;

public class UniversityDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		University KLETECH=new University();
		
		KLETECH.creatSchool();
		KLETECH.calNoOfStud();
		
		for(int i=0;i<KLETECH.NoOfStud.length;i++)
		{
			if(KLETECH.NoOfStud[i]!=0)
				System.out.println("no of the students "+KLETECH.getProgrameCode()+"are:"+KLETECH.NoOfStud[i]);
		}
	}

}
