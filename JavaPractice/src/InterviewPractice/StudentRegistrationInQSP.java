package InterviewPractice;

public class StudentRegistrationInQSP 
{
	public static void main(String[] args)
	  {
		Qsp_Registration std1=new Qsp_Registration("Anjusmita","Bangalore",9978787666l);
	      
	    System.out.println(std1.getName());
	    System.out.println(std1.getAddress()); 
	    System.out.println(std1.getMobNum());
	    System.out.println(std1.getId());
	    System.out.println("-----------------------------------------");
		Qsp_Registration std2=new Qsp_Registration("Abhisek","mumbai",9978887666l);
	      
	    System.out.println(std2.getName());
	    System.out.println(std2.getAddress()); 
	    System.out.println(std2.getMobNum());
	    System.out.println(std2.getId());
	    
	    std1.setAddress("Delhi");
	    System.out.println(std1.getAddress()); 

	}
}
