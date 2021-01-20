package InterviewPractice;

public class Resturants_In_Blr // compiletime polymorphism
{
   public void searchResturant()
   {
	   System.out.println("Udupi"+"\n"+"Kfc"+"\n"+"Dominos");
   }
   public void searchResturant(String byName)
   {
	   System.out.println("Showing result for : "+ byName);
	   if(byName.toLowerCase().startsWith("a"))
	   {
		   System.out.println("Andhra resturant"+"\n"+"Athiya");
	   }
   }
   public void searchResturant(int byRating)
   {
	   System.out.println("Showing result based on given rating : "+ byRating);
	   if(byRating==5)
	   {
		   System.out.println("Udupi"+"\n"+"Swosti grand");
	   }
   }
   public static void main(String[] args)
   {
	   Resturants_In_Blr r=new Resturants_In_Blr();
	    r.searchResturant("andhra");
}
}
