package InterviewPractice;

public class PrintNameWithoutLoop
{
	   int num=1;
	   public void printName(int requiredNum)
	   {
		    if(num<=requiredNum)
		    {
		    	System.out.println("Anjusmita");
			    num++;
			    printName(requiredNum);
		    }
	   }

   public static void main(String[] args) 
   {
	   PrintNameWithoutLoop p=new PrintNameWithoutLoop();
	   p.printName(10);
   }
}
