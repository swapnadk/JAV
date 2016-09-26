package in.ac.kletech.library;

public class University {
	final static String code1="E030";
	final static String code2="E241";
	int iNoOfStud[]=new int[8];
	School[] s=new School[8];
	static
	{
	   System.out.println("welcome to KLETECH University");
	   System.out.println("CET codes="+code1+"and "+code2);
	   
	}
	class School{
		private String sProgramecode;
		private String sSchoolCoordinator;
		private int iNoOfStud;
		private int iNoOfStaff;
		public String getsProgramecode() {
			return sProgramecode;
		}
		public String getsSchoolCoordinator() {
			return sSchoolCoordinator;
		}
		public int getiNoOfStud() {
			return iNoOfStud;
		}
		public int getiNoOfStaff() {
			return iNoOfStaff;
		}
	
	
		public School(String sProgramecode, String sSchoolCoordinator,
				int iNoOfStud, int iNoOfStaff) {
			super();
			this.sProgramecode = sProgramecode;
			this.sSchoolCoordinator = sSchoolCoordinator;
			this.iNoOfStud = iNoOfStud;
			this.iNoOfStaff = iNoOfStaff;
			if(iNoOfStud>120)
				System.out.println("intake exceed in "+this.sProgramecode);
			else
				this.iNoOfStud=iNoOfStud;
			
		}
			void createSchool(){
				s[0]=new School("cs","SWAPM",50,20);
				s[1]=new School("EC","SWAGATr",120,10);
				s[2]=new School("EE","DEEPA",20,30);
				s[3]=new School("AM","GOMAr",70,60);
				s[4]=new School("BT","sWARAG",50,40);
				s[5]=new School("CIVIL","Zoom",80,16);
				s[6]=new School("MECH","Zebra",90,20);
				s[7]=new School("ROBOTICS","Zink",100,20);
			}
			void calNoOfStud(){
				for(int i=0;i<iNoOfStud.length;i++)
				{
					iNoOfStud[i]=s[i].getiNoOfStud();
				}
			}
		}
	
	
}
