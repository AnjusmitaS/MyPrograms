package InterviewPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;

public class String_Array_Collection_Practice 
{
	public static void main(String[] args) 
	{
		String_Array_Collection_Practice s=new String_Array_Collection_Practice();
		/*s.removeSpaceInString("Anjusmita Sahoo");
		System.out.println(s.reverseString("Anjusmita"));
		System.out.println(s.reverseStringWithConditions("Maha bharat"));
		s.printASCIIValue("anjuSmita1997");
		System.out.println(s.checkStringContainsNumberOrNot("Anju123"));
		s.countOccouranceOfEachCharacterInString("Mahabharat");
		s.printDuplicateCharacterPresentInString("MahaBharat");
		s.occouranceOfAllEvenIndexCharacter("anjuSmita");
		System.out.println(s.removeDuplicateFromString("mahabharat"));
		s.occouranceWithout3rdVariable("mahabharat");// need to practice
		s.printVowelsPresentInString("Acedious");
		s.printOccouranceOfVowelsInString("Acedious Acedious");
		System.out.println(s.reverseStringByReverseMethod("Anju"));
		s.sortArrayList();
		s.sortArrayWithReadymadeMethod();
		int[] x= {20,38,65,99,76,21,10};
		int[] asc=s.sortArrayInBubbleSortASC(x);
		int[] desc=s.sortArrayInBubbleSortDESC(x);
		for(int a:desc)
		{
			System.out.print( a+" ");
		}
		s.countLengthOfGivenString("anjusmita sahoo");
        s.countOccouranceOfEachWordInString("man is a man . man is not a woman . man is good . man will be man");
		s.reverseEachWordInString("My name is Anjusmita");
		s.swapWordsInString("Happy new year");
		s.sortingOfArrayListInBubbleShortASC();
		int[] x= {12,78,43,87,90,32,88,66};
		System.out.println(s.checkPresenceOfNumberInArray(x, 88));
        s.removeDuplicateFromStringArray();
		s.swapValuesOfGivenInt();
		s.swapDataWithout3rdVariable(50,30);
		int[] x= {80,78,43,87,90,32,88,66,10};
        s.findLowestNumberand2ndLargestInArray(x);
		s.checkStringIsPalindromOrNot("MADAM");
        s.addSquareOfIntArrayIntoArrayList();*/
		s.countDuplicateInArrayList();

	}
   public void removeSpaceInString(String s)
   {
	   s=s.toLowerCase();
	   if(s.contains(" "))
	   {
		   s=s.replace(" ","");
	   }
      System.out.println(s);
	   /*for(int i=0;i<s.length();i++)
	   {
		   if(s.contains(" "))
		   {
			   s=s.replace(" ","");
		   }
	   }
	   System.out.println(s);*/
   }

   public String reverseString(String s)
    {
    	 s=s.toLowerCase();
    	 String rev="";
    	 for(int i=s.length()-1;i>=0;i--)
    	 {
    		 rev=rev+s.charAt(i);
    	 }
    	 return rev;
    }

   public String reverseStringWithConditions(String s)
    {
    	  s=s.toLowerCase();
    	  String rev="";
    	  for(int i=s.length()-1;i>=0;i--)
    	  {
    		  rev=rev+s.charAt(i);
    		  if(rev.contains(" "))
    		  {
    			  rev=rev.replace(" ","");
    		  }
    		  if(rev.equals(rev.toLowerCase()))
    		  {
    			  rev=rev;
    		  }
    		  else 
    		  {
    			rev=rev.toLowerCase();  
    		  }
    	  }
    	  return rev;
    }
   public void printASCIIValue(String s)
   {
	     for(int i=0;i<s.length();i++)
	     {
	    	 int asciinum=s.charAt(i);
	    	 System.out.println(s.charAt(i)+" -- "+ asciinum);
	     }
   }
   public boolean checkStringContainsNumberOrNot(String s)
  {
	     boolean flag=false;
	   for(int i=0;i<s.length();i++)
	   {
		   int asciinum=s.charAt(i);
		   if(asciinum>=48 && asciinum<=57)
		   {
			   flag=true;
		   }
	   }
	   return flag;
  }
   public void countOccouranceOfEachCharacterInString(String s)
    {
    	s=s.toLowerCase();
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
    			System.out.println(c1+" present "+ count+ " times");
    		}
    	}
    }
   
   public void printDuplicateCharacterPresentInString(String s)
   {
	   s=s.toLowerCase();
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
				   count ++;
			   }
		   }
		   if(count>1)
		   {
			   System.out.println(c1+" is duplicate & present "+ count+" times");
		   }
	   }
   }

   public void occouranceOfAllEvenIndexCharacter(String s)
   {
	     s=s.toLowerCase();
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
	    	 if(count>0 && i%2==0)
	    	 {
	    		 System.out.println(c1+" is at evenindex and present "+count+" times");
	    	 }
	     }
   }
    
   public String removeDuplicateFromString(String s)
   {
	   String duplicatedString="";
	   s=s.toLowerCase();
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
			   duplicatedString=duplicatedString+s.charAt(i);
		   }
	   }
	   return duplicatedString;
   }
    
   public void occouranceWithout3rdVariable(String s)
   {
	   String temp="";
	   s=s.toLowerCase();
	    for(int i=0;i<s.length();i++)
	    {
	    	char c1=s.charAt(i);
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
	    	if(temp.length()!=0)
	    	{
	    	   System.out.println(c1 +" present "+ temp.length()+" times");
	    	}
	    	temp="";
	    }
   }
    
   public void printVowelsPresentInString(String s)
   {
	   String defaultVowels="aeiou";
	   s=s.toLowerCase();
	   for(int i=0;i<defaultVowels.length();i++)
	   {
		   char c1=defaultVowels.charAt(i);
		   int count=0;
		   for(int j=0;j<s.length();j++)
		   {
			   char c2=s.charAt(j);
			   if(c1==c2)
			   {
				   count++;
			   }
		   }
		   if(count>0)
		   {
			   System.out.println(c1);
		   }
	   }
   }
    
   public void printOccouranceOfVowelsInString(String s)
   {
	  String defaultVowel="aeiou";
	  s=s.toLowerCase();
	  for(int i=0;i<defaultVowel.length();i++)
	  {
		  char c1=defaultVowel.charAt(i);
		  int count=0;
		  for(int j=0;j<s.length();j++)
		  {
			  char c2=s.charAt(j);
			  if(c1==c2)
			  {
				  count++;
			  }
		  }
		  if(count>0)
		  {
			  System.out.println(c1+" is a vowel which present "+count+" times in the String");
		  }
	  }
   }
    
   public String reverseStringByReverseMethod(String s)
   {
	   s=s.toLowerCase();
	   StringBuffer sb=new StringBuffer(s);
	   sb.reverse();
	   return sb.toString();
   }
    
    public static void conversionOfStringandStringBuffer()
    {
    	String s1="Anju";
    	StringBuffer sb=new StringBuffer(s1);
    	StringBuffer sb1=new StringBuffer(new String("Anjusmita"));
    	
    	StringBuffer sb2=new StringBuffer("bubu");
    	String s2=new String(sb2);
        String s3=sb2.toString();
       // String s4=sb2; not possible
    	
    }
    
    public void countLengthOfGivenString(String s)
    {
    	char [] ch=s.toCharArray();
    	int count=0;
    	for(char c:ch)
    	{
    		count++;
    	}
    	System.out.println("Length Of String : "+count);
    	
    }

    public void countDuplicateInArrayList()
    {
    	ArrayList<Integer> al=new ArrayList<Integer>();
    	al.add(20);
    	al.add(30);
    	al.add(40);
    	al.add(20);
    	al.add(40);
    	al.add(70);
    	al.add(50);
    	al.add(70);

    	System.out.println(al);
        
    	HashSet<Integer> h=new HashSet<Integer>();  
    
    	for(Integer i:al)
    	{
    		if(h.add(i)==false)
    		{
    		System.out.println(i+" is duplicate");
    		}
    	}
    }

    public void swapWordsInString(String s)
    {
    	String [] str=s.split(" ");
    	
    	String temp=str[0];
    	str[0]=str[str.length-1];
    	str[str.length-1]=temp;
    	for(int i=0;i<str.length;i++)
    	{
    		System.out.print(str[i]+" ");
    	}
    }
    
    public void sortArrayList()
    {
    	   ArrayList<Integer> al=new ArrayList<Integer>();
    	   al.add(10); 
    	   al.add(20);
    	   al.add(60);
    	   al.add(90);
    	   al.add(40);
    	   // natural DNSO
    	   Collections.sort(al);
    	   System.out.println("DNSO - "+ al);
    	   Collections.sort(al,new MyComparator());
    	   System.out.println("CSO - " + al);
    }

    public void sortArrayWithReadymadeMethod()
    {
    	int [] i= {10,20,49,22,43,92};
    	System.out.println("Inserted :");
    	for(int a:i)
    	{
    		System.out.print(a+" ");
    	}
    	Arrays.sort(i);
    	System.out.println("\n"+"DNSO : ");
    	for(int b:i)
    	{
    		System.out.print(b+" ");
    	}
    }
    
    public int[] sortArrayInBubbleSortASC(int[] x)
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
    public int[] sortArrayInBubbleSortDESC(int[] x)
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
    
    public boolean checkPresenceOfNumberInArray(int[] x,int num)
    {
    	boolean flag=false;
    	for(int i=0;i<x.length;i++)  // for(int i:x)   this approach also valid
    		                          //{    if(num==i)
    	{
    		if(num==x[i])
    		{
    			flag=true;
    			break;
    		}
    	}
    	return flag;
    }

    public void countOccouranceOfEachWordInString(String s)
    {
    	String[] str=s.split(" ");
    	s=s.replace(" ","");

    	for(int i=0;i<str.length;i++)
    	{
    		String w1=str[i];
    		int count=0;
    		for(int j=0;j<str.length;j++)
    		{
    			String w2=str[j];
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
    			System.out.println(w1+" present "+count+" times in the given string.");
    		}
    	}
    }
    public void reverseEachWordInString(String s)
    {
    	String rev="";
    	String[] str=s.split(" ");
    	for(int i=0;i<str.length;i++)
    	{
    		String w1=str[i];
    		StringBuffer sb=new StringBuffer(w1);
    		String temp=sb.reverse().toString();
    		rev=rev+temp+" ";
    	}
    	System.out.println("Reversed String : "+ rev);
    }

    public void sortingOfArrayListInBubbleShortASC()
    {
    	  ArrayList<Integer> al=new ArrayList<Integer>();
    	  al.add(19);
    	  al.add(99);
    	  al.add(39);
    	  al.add(49);
    	  al.add(29);
    	  al.add(59);
    	  for(int i=0;i<al.size();i++)
    	  {
    		  for(int j=al.size()-1;j>i;j--)
    		  {
    			     if(al.get(i) > al.get(j)) // al.get(i)<al.get(j) for DESC
    			     {
    			    	 int temp=al.get(i);
    			    	 al.set(i,al.get(j));
    			    	 al.set(j,temp);
    			     }
    		  }
    	  }
        for(int i:al)
        {
        	System.out.println(i);
        }
  }

 public void removeDuplicateFromStringArray()
 {
	 String[] s= {"anju","gudu","bubu","anju","sonu","sonu"};
	 for(String s1:s)
	 {
		 System.out.print(s1+" ");
	 }
	 for(int i=0;i<s.length;i++)
	 {
		 int count=0;
		 String w1=s[i];
		 for(int j=0;j<s.length;j++)
		 {
			 String w2=s[j];
			 if(w1.equals(w2) && i>j)
			 {
			     break;	 
			 }
			 if(w1.equals(w2))
			 {
				 count++;
			 }
		 }
		 if(count==1)
		 {
			 System.out.println();
			 System.out.print(w1);
		 }
	 }
 }

  public void swapValuesOfGivenInt()
  {
	  int a=70;
	  int b=60;
	  System.out.println("value of a : "+a);
	  System.out.println("value of b : "+b);
	  
	  int temp=a;
	  a=b;
	  b=temp;
	  System.out.println("after swaping a : "+a);
	  System.out.println("after swaping b : "+b);
  }
  public void findLowestNumberand2ndLargestInArray(int[] x)
  {
	    for(int value:x)
	    {
	    	System.out.print(value+" ");
	    }
	    
	    Arrays.sort(x);
	    System.out.println();
	    for(int sorted:x)
	    {
	    	System.out.print(sorted+" ");
	    }
	    System.out.println("\n"+"Lowest number in Array ");
	    System.out.println(x[0]);
	    System.out.println("second largest number ");
	    System.out.println(x[x.length-2]);
  }
  public void swapDataWithout3rdVariable(int x,int y)
  {
	  System.out.println("Before swapping ");

	  System.out.println("X : "+ x);
	  System.out.println("Y : "+y);
	  
	  x=x+y;
	  y=x-y;
	  x=x-y;
	  System.out.println("After swapping ");
	  System.out.println("X : "+ x);
	  System.out.println("Y : "+y);	  
  }
  public void checkStringIsPalindromOrNot(String s)
  {
	  s=s.toLowerCase();
	  System.out.println("String is : "+ s);
	  StringBuffer sb=new StringBuffer(s);
	  String str=sb.reverse().toString();
	  if(s.equals(str))
	  {
		  System.out.println("String is palindrom");
	  }
	  else {
		  System.out.println("String is not palindrom");
	  }
  }
  public void addSquareOfIntArrayIntoArrayList()
  {
	  int[] x= {12,22,11,10,27,33,};
	  int num;
	  ArrayList al=new ArrayList();
	  for(int a:x)
	  {
		  num=a*a;
		  System.out.print(num+" ");
		  al.add(num);
	  }
	  System.out.println();
	  System.out.print(al);
  }
 
}
class MyComparator implements Comparator<Integer>
{

	@Override
	public int compare(Integer o1, Integer o2) {
	    Integer i1=o1;
	    Integer i2=o2;
		
		return -i1.compareTo(i2);
	}
	
}