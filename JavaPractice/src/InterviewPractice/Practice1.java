package InterviewPractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;

public class Practice1 
{
	
	public static void main(String[] args) 
	{
		Practice1 p=new Practice1();
		
		/*int[] x= {10,99,46,79,77};
		p.sortArrayASC(x);
		for(int a:x)
		{
			System.out.print(a+" ");
		}
		p.sortArrayDESC(x);
		System.out.println();
		for(int a:x)
		{
			System.out.print(a+" ");
		}
		System.out.println(p.checkStringPalindromOrNot("madam"));
		p.countOccouranceWithout3rdVariable("mahabharat");
		p.reverseIntegerArray();
		p.reverseEachWordInString("my name is khan");
		p.reverseStringWithConditions("Anju Smita");
        p.removeDuplicate("mahabharat");
		p.sortArrayListDNSO_CSO();
		p.swapValuesWithout3rdVariable(20, 30);
		int[] x= {10,20,30,40,10,20};
		p.removeDuplicateFromintArray(x);
		String[] s= {"anju","gudu","silu","bubu","silu","anju"};
		p.removeDuplicateFromStringArray(s);
		int[] x= {60,30,20,50,40,10};
		p.findLowestNumberInArray(x);
		 int [] x= {10,20,30};
        p.squareArrayAddInArrayList(x);
        p.printFibonnaciSeries();
		p.printDuplicateInArrayList();
		p.removeSpaceInString("i am jojo");
		p.occouranceOfEachWordInString("i am anju . anju is a girl . i am her friend . anju and i are happy .");
		p.printNameWithoutLoop(5);*/
		p.summationOfArray();
		p.printAverageOfArray();
        p.findMin_Max_InArray();
		
		
	}
	
	
    public int[] sortArrayASC(int[] x)
    {
    	for(int i=0;i<x.length;i++)
    	{
    		for(int j=i+1;j<x.length;j++)
    		{
    			if(x[i]>x[j])
    			{
    				int temp=x[i];
    				x[i]=x[j];
    				x[j]=temp;
    			}
    		}
    	}
		return x;
    }

    public int[] sortArrayDESC(int[] x)
   {
	   for(int i=0;i<x.length;i++)
	   {
		   for(int j=i+1;j<x.length;j++)
		   {
			   if(x[i]<x[j])
			   {
				   int temp=x[i];
				   x[i]=x[j];
				   x[j]=temp;
			   }
		   }
	   }
	   return x;
   }
   
    public boolean checkStringPalindromOrNot(String s)
    {
    	boolean flag=false;
    	StringBuffer sb=new StringBuffer(s);
    	String s1 = sb.reverse().toString();
    	if(s1.equals(s))
    	{
    		flag=true;
    	}
    	return flag;
 }
  public void countOccouranceWithout3rdVariable(String s)
  {
	     for(int i=0;i<s.length();i++)
	     {
	    	 char c1=s.charAt(i);
	    	 String temp="";
	    	 for(int j=0;j<s.length();j++)
	    	 {
	    		 char c2=s.charAt(j);
	    		 if(c1==c2 && i>j)
	    		 {
	    			 break;
	    		 }
	    		 if(c1==c2)
	    		 {
	    			 temp=temp+c1;
	    		 }
	    	 }
	    	 if(temp.length()>0)
	    	 {
	    		 System.out.println(c1+ "present "+temp.length()+" times");
	    	 }
	    	 temp="";
	     }
  }
  public void reverseIntegerArray()
  {
	  int[] x= {10,20,69,32,50};
	  
	  for(int a:x)
	  {
		  System.out.print(a+" ");
	  }
	  System.out.println();
	  for(int i=x.length-1;i>=0;i--)
	  {
		  System.out.print(x[i]+" ");
	  }
  }
     public void reverseEachWordInString(String s)
     {
    	 System.out.println(s);
    	 
    	 String[] str=s.split(" ");
    	 for(String s1:str)
    	 {
    		 StringBuffer sb=new StringBuffer(s1);
    		 
    		 String s2=sb.reverse().toString();
    		 System.out.print(s2+" ");
    	 }
     }
   public void reverseStringWithConditions(String s)
   {
	      System.out.println(s);
	      String rev="";
	      for(int i=s.length()-1;i>=0;i--)
	      {
	    	  rev=rev+s.charAt(i);
	    	  if(rev.contains(" "))
	    	  {
	    		  rev=rev.replace(" ", "");
	    	  }
	    	  if(rev.equals(rev.toLowerCase()))
	    	  {
	    		  rev=rev;
	    	  }
	    	  else {
	    		  rev=rev.toLowerCase();
	    	  }
	      }
	      System.out.print(rev);
   }
   public void removeDuplicate(String s)
   {
	   String withoutDuplicate="";
	   for(int i=0;i<s.length();i++)
	   {
		   char c1=s.charAt(i);
		   int count=0;
		   for(int j=0;j<s.length();j++)
		   {
			   char c2=s.charAt(j);
			   if(c1==c2 && i>j)
			   {
				   break;
			   }
			   if(c1==c2)
			   {
				   count++;
			   }
		   }
		   if(count==1)
		   {
			   withoutDuplicate=withoutDuplicate+s.charAt(i);
		   }
	   }
	   System.out.println(withoutDuplicate);
   }
  public void sortArrayListDNSO_CSO()
  {
	  ArrayList al=new ArrayList();
	  al.add(10);
	  al.add(90);
	  al.add(60);
	  al.add(40);
	  al.add(30);
	  al.add(20);
	  System.out.println(al);
	  Collections.sort(al);
	  System.out.println(al);
	  Collections.sort(al,new MyComparator1());
	  System.out.println(al);

  }
 public void swapValuesWithout3rdVariable(int x,int y)
 {
	 System.out.println("before swapping   x value : "+ x );
	 System.out.println("before swapping   y value : "+ y );
    
	   x=x+y;
	   y=x-y;
	   x=x-y;
	   
	 System.out.println("after swapping   x value : "+ x );
	 System.out.println("after swapping   y value : "+ y );
 
 }
  public void removeDuplicateFromintArray(int[] x)
  {
	  for(int i=0;i<x.length;i++)
	  {
		  int a=x[i];
		  int count=0;
		  for(int j=0;j<x.length;j++)
		  {
			  int b=x[j];
			  if(a==b && i>j)
			  {
				  break;
			  }
			  if(a==b)
			  {
				  count++;
			  }
		  }
		  if(count==1)
		  {
			  System.out.print(a+" ");
		  }
	  }
  }
 public void removeDuplicateFromStringArray( String[] s)
 {
	 for(int i=0;i<s.length;i++)
	 {
		 String s1=s[i];
		 int count=0;
		 for(int j=0;j<s.length;j++)
		 {
			 String s2=s[j];
			 if(s1.equals(s2) && i>j)
			 {
				 break;
			 }
			 if(s1.equals(s2))
			 {
				 count++;
			 }
		 }
		 if(count==1)
		 {
			 System.out.print(s1+" ");
		 }
	 }
 }
 public void findLowestNumberInArray(int[] x)
 {
	 for(int i: x)
	 {
		 System.out.print(i+" ");
	 }
     for(int i=0;i<x.length;i++)
     {
    	 for(int j=0;j<x.length;j++)
    	 {
    		 if(x[i]<x[j])
    		 {
    			 int temp=x[i];
    			 x[i]=x[j];
    			 x[j]=temp;
    		 }
    	 }
     }
     System.out.println("\n"+"lowest number :" + x[0]);
 }

 public void squareArrayAddInArrayList(int [] x)
 {
	 System.out.println("original array : ");
	 for(int a:x)
	 {
		 System.out.print(a+" ");
	 }
	 System.out.println();
	 ArrayList al=new ArrayList();
	 System.out.println("square of original array : ");
	 for(int i:x)
	 {
		 i=i*i;
		 System.out.print(i+" ");
          al.add(i);
	 }
	 System.out.println("\n"+"ArrayList objects : "+ al+" ");

 }
 int num=1;
  public void printNameWithoutLoop(int rnum)
  {
	  if(num<=rnum)
	  {
		 System.out.println("Anjusmita Sahoo");
		 num++;
		 printNameWithoutLoop(rnum);

	  }

  }

  public void printFibonnaciSeries()
  {
	  int a=0,b=1,c=1;
	  for(int i=1;i<=10;i++)
	  {
		  System.out.println(a);
		  c=a+b;
		  a=b;
		  b=c;
	  }
  }
public void printDuplicateInArrayList()
{
	ArrayList<Integer> al=new ArrayList<Integer>();
	al.add(10);
	al.add(80);
	al.add(70);
	al.add(30);
	al.add(30);
	al.add(10);
	System.out.println(al);
	HashSet<Integer> h=new HashSet<Integer>();
	System.out.println("Duplicate In ArrayList : ");
	for(Integer i:al)
	{
		if(h.add(i)==false)
		{
			System.out.print(i+" ");
		}
	}

}
public void removeSpaceInString(String s)
{
	
	if(s.contains(" "))
	{
		s=s.replace(" ","");
	}
  
	System.out.println(s);
	
}
public void occouranceOfEachWordInString(String s)
{
	String[] s1 = s.split(" ");
	s=s.replace(" ", "");
	for(int i=0;i<s1.length;i++)
	{
		String w1=s1[i];
		int count=0;
		for(int j=0;j<s1.length;j++)
		{
			String w2=s1[j];
			if(w1.equals(w2) && i>j)
			{
				break;
			}
			if(w1.equals(w2))
			{
				count++;
			}
		}
		if(count>0)
		{
			System.out.println(w1+ " present "+count+" times");
		}
	}
}
public void summationOfArray()
{
	int[] x= {10,20,30,40};
	int sum=0;
	for(int i=0;i<x.length;i++)
	{
		sum=sum+x[i];
	}
	System.out.println("Summation : "+ sum);
}
public void printAverageOfArray()
{
	int[] x= {10,20,30,40};
    int length=x.length;
    int sum=0;
    for(int i=0;i<x.length;i++)
    {
    	sum=sum+x[i];
    }
    int avg=sum/length;
    System.out.println("Average : "+avg);
}
public void findMin_Max_InArray()
{
	int[] x= {10,29,34,54,55,67,87};
	System.out.print("Array : ");
	for(int a:x)
	{
		System.out.print(a+" ");
	}
	int max=x[0];
	 for(int i=0;i<x.length;i++)
	 {
		 if(x[i]>max)
		 {
			 max=x[i];
		 }
	 }
	 System.out.println("\n"+"Maximun : "+ max);
	 int min=x[0];
	 for(int j=0;j<x.length;j++)
	 {
		 if(x[j]<min)
		 {
			 min=x[j];
		 }
	 }
	 System.out.println("Minimun : "+ min);
}










}
class MyComparator1 implements Comparator<Integer>
{

	@Override
	public int compare(Integer a, Integer b)
	{
	Integer i1=a;
	Integer i2=b;
     return -i1.compareTo(i2);
	}

}




















