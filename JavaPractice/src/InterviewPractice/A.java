package InterviewPractice;

  abstract interface A // interface as abstract possible
 {
     public void m1();
     
     public static void m2()// complete static method of interface we cannot override
     {
    	 
     }
  }	
class B implements A
{

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		
	}
	
}
