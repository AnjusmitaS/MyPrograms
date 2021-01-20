package InterviewPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class ExtraQuestionsToPractice
{
   public static void main(String[] args) {
	   ExtraQuestionsToPractice e=new ExtraQuestionsToPractice();
	  /* 
	   e.separateDiffCharInString("Abc123@xyz&456");
	   e.sortHashMapKeyValues();
	   e.convertAllAlternateCharInUpperCase("aBcDeFgH");
	   e.findSumOf1st3MaxNumInArray();
	   e.reverseWordInString();
	   e.countLengthOfStringWithotLengthMethod();
	   e.reverseString();*/
	  // e.reverseEachWordInString();
	  // e.countDuplicateCharInString();
	   //e.countOccouranceOfEachCharInString();
	   //e.swap1standLastWordInString();
	 //  e.printDuplicateCharInString();
	  // e.printFibonacciSeries();
	   //e.removeDuplicateFromArrayList();
	 // e.removeDUplicateFromListandSortInAscending();
	   e.swapOddIndexWordWithEvenIndexWordInString("i love my India you are an Indian");

}
   
   public void countDuplicateCharInString()
   {
	   int num=0;
	   String str="welcome well";
	   for(int i=0;i<str.length();i++)
	   {
		   char c1=str.charAt(i);
		   int count=0;
		   for(int j=0;j<str.length();j++)
		   {
			   char c2=str.charAt(j);
			   if(c1==c2 && i>j)
			   {
				   break;
			   }
			   if(c1==c2)
			   {
				   count++;
			   }
		   }
          if(count>1)
          {
        	  num++;
          }
	   }
       System.out.println("number of duplicates "+ num);

   }
   public void separateDiffCharInString(String s)
   {
	   
	   System.out.println("String is : "+ s);
	   String s1="",s2="",s3="";
	   for(int i=0;i<s.length();i++)
	   {
		   int ascinum=s.charAt(i);
		   if(ascinum>=47 && ascinum<=58)
		   {
			   s1= s1+s.charAt(i);
		   }
		   if(ascinum>=97 && ascinum<=122 ||ascinum>=65 &&ascinum<=90)
		   {
			   s2=s2+s.charAt(i);
		   }
		   if(ascinum>=32 && ascinum <=47 || ascinum>=58 && ascinum<=64 || ascinum>=91 && ascinum<=96|| ascinum>=123 && ascinum <=126  )
		   {
			   s3=s3+s.charAt(i);
		   }

	   }
	   System.out.println("s1 : "+s1);
	   System.out.println("s2 : "+s2);
	   System.out.println("s3 : "+s3);
   }
   public void swapOddIndexWordWithEvenIndexWordInString(String s)
   {
	   String[] s1 = s.split(" ");
	   String temp1="",temp2="";
	   for(int i=0;i<s1.length;i++)
	   {
		   if(i%2==0)
		   {
			    temp1=s1[i];
			   System.out.print(s1[i]+" ");
		   }
	   }
	   
   }
   public void sortHashMapKeyValues()
   {
	   HashMap<Integer, String> h=new HashMap<Integer, String>();
	   h.put(10,"anju");
	   h.put(70,"sonu");
	   h.put(40,"silu");
	   h.put(90,"gudu");
	   h.put(30,"bubu");
	   h.put(20,"ani");
	   Set<Integer> keys = h.keySet();
	   System.out.println("All Keys :");
	   System.out.println(keys);
	   ArrayList<Integer> al=new ArrayList<Integer>();
	   for(Integer o:keys)
	   {
		   al.add(o);
	   }
       Collections.sort(al);
       System.out.println("In Ascending :");
       System.out.println(al);
       Collections.sort(al,new MyComparator3());
       System.out.println("In Descending :");
       System.out.println(al);
   }
   public void convertAllAlternateCharInUpperCase(String s)
   {
	   System.out.println("String : "+ s);
	 
   }
   public void findSumOf1st3MaxNumInArray()
   {
	   int[] x= {20,30,40,10,50};
	   System.out.println("Original Array : ");
	   for(int z:x)
	   {
		   System.out.print(z+" ");
	   }
	   Arrays.sort(x);
	   System.out.println("\n"+"In Ascending : ");
	   for(int a:x)
	   {
		   System.out.print(a+" ");
	   }
	   System.out.println("\n"+"In Descending : ");
	   for(int i=0;i<x.length;i++)
	   {
		   for(int j=0;j<x.length;j++)
		   {
			   if(x[i]>x[j])
			   {
				  int temp=x[i];
				  x[i]=x[j];
				  x[j]=temp;
			   }
		   }
	   }
	   for(int b:x)
	   {
		   System.out.print(b+" ");
	   }
	   int add=x[0]+x[1]+x[2];
	   System.out.println("\n"+"Sum of 1st 3 max.number : "+ add );
   }
  public void reverseWordInString()
  {
	  String s="welcome to the haven";
	  String[] s1 = s.split(" ");
    for(int i=s1.length-1;i>=0;i--)
    {
    	System.out.print(s1[i]+" ");
    }
  }
   public void countLengthOfStringWithotLengthMethod()
   {
	   String s="anju";
	   char[] c = s.toCharArray();
	   int count=0;
	   for(char c1:c)
	   {
		   count++;
	   }
	   System.out.println(count);
   }
   public void reverseString()
   {
	   String s="anjusmita";
	   String rev="";
	   for(int i=s.length()-1;i>=0;i--)
	   {
		   rev=rev+s.charAt(i);
	   }
	   System.out.println(rev);
   }
    public void reverseEachWordInString()
    {
    	String s="Welcome to India";
    	String[] s1 = s.split(" ");
    	String rev="";
    	for(String str:s1)
    	{
    		StringBuffer sb=new StringBuffer(str);
    		String temp=sb.reverse().toString();
    		 rev=rev+temp+" ";
    	}
    	System.out.print(rev);
    }
   public void countOccouranceOfEachCharInString()
   {
	   String s="mahabharat";
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
          if(count>0)
          {
        	  System.out.println(c1+"--"+count);
          }
	   }
   }
   public void swap1standLastWordInString()
   {
	   String s="i love my India";
	   String[] s1 = s.split(" ");
	   String temp=s1[0];
	   s1[0]=s1[s1.length-1];
	   s1[s1.length-1]=temp;
	   for(int i=0;i<s1.length;i++)
	   {
		   System.out.print(s1[i]+" ");
	   }
   }
   public void printDuplicateCharInString()
   {
	   String s="welcome well";
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
          if(count>1)
          {
        	  System.out.print(c1+" ");
          }
	   }

   }
 public void printFibonacciSeries()
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
  public void removeDuplicateFromArrayList()
  {
	  ArrayList<Object> al=new ArrayList<Object>();
	  al.add("anju");
	  al.add(30);
	  al.add("anju");
	  al.add(20);
	  al.add(30);
    System.out.println(al);
    Object[] ar = al.toArray();
    for(int i=0;i<ar.length;i++)
    {  int count=0;
    	for(int j=0;j<ar.length;j++)
    	{
    		if(ar[i]==ar[j] && i>j)
    		{
    			break;
    		}
    		if(ar[i]==ar[j])
    		{
    			count++;
    		}
    	}
    	/*if(count>1)   FOR PRINTING DUPLICATE IN ARRAYLIST
    	{
    		System.out.print(ar[i]+" ");
    	}*/

    	if(count>0)
    	{
    		System.out.print(ar[i]+" ");
    	}
    }
  }
  public void removeDUplicateFromListandSortInAscending()
  {
	  LinkedList<Integer> ll=new LinkedList<Integer>();
	  ll.add(20);
	  ll.add(40);
	  ll.add(60);
	  ll.add(10);
	  ll.add(20);
	  ll.add(70);
	  ll.add(40);
	  ll.add(50);
      System.out.print(ll+" ");
	  Collections.sort(ll);
      System.out.println();
      Object[] ar = ll.toArray();
      for(int i=0;i<ar.length;i++)
      {  int count=0;
      	for(int j=0;j<ar.length;j++)
      	{
      		if(ar[i]==ar[j] && i>j)
      		{
      			break;
      		}
      		if(ar[i]==ar[j])
      		{
      			count++;
      		}
      	}
      if(count>0)
      {
    	  System.out.print(ar[i]+" ");
      }
    }

  }
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
}
class MyComparator3 implements Comparator<Integer>
{

	@Override
	public int compare(Integer o1, Integer o2) {
		return -o1.compareTo(o2);
	}
	
}