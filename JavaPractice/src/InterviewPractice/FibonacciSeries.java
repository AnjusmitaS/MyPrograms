package InterviewPractice;

public class FibonacciSeries {// fibonacci series
public static void main(String[] args) {
  int a=0,b=1,c=1;
  for(int i=1;i<=10;i++)
  { 
	  System.out.println(a);
	  c=a+b;
	  a=b;
	  b=c;
	  
  }
 }
}
