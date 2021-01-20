package InterviewPractice;

public class ArrayPrograms 
{
	public static void main(String[] args) 
	{
	ArrayPrograms ap=new ArrayPrograms();
	ap.arrayLogics();
	}
	
	  public void arrayLogics()
	  {
		  int [] x=new int[5];
		  // Adding data in array
		  x[0]=10;
		  x[1]=20;
		  x[2]=30;
		  x[3]=40;
		  x[4]=50;
		  // fetching single data
		  System.out.println(x[3]);
		  // fetching all data by for each loop
		  System.out.println("By for each loop ");
		  for(int i:x)
		  {
			  System.out.println(i);
		  }
		  System.out.println("By for loop ");
		  for(int j=0;j<x.length;j++)
		  {
			  System.out.println(x[j]);
		  }
		  
		  
	  }
	
	
	
	
	
	
}
