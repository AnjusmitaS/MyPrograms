package InterviewPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;

public class Practice2 
{   public static void main(String[] args)
    {

	Practice2 p2=new Practice2();
	/*p2.reverseStringWithoutReadymadeMethods("ANJU");
	p2.countLengthOfStringWithoutLengthFunction("anjusmita");
	p2.occouranceOfCharacterInString("mahabharat");
	p2.printOnlyDuplicateCharacterFromString("mahabharat");
	p2.swapWordsInString("hi hello bye");
	int[] x= {10,39,22,65,76,40};
	p2.sortArray(x);
	p2.printDuplicateInArrayList();
	p2.sortArrayListInDNSO_CSO();
	p2.removeSpaceFrommString("A N J U");
	p2.countOccouranceOfVowelsInString("acedious");
	int[] x= {10,39,22,65,76,40};
	System.out.println(p2.checkGivenNumberInArray(x));
    p2.findOccouranceOfEachWordInString("man is man . man can't be woman . man can be superman");
	p2.reverseEachWordInString("my name is anju");*/
	String[] s= {"anju","bubu","gudu","silu","anju","silu"};
	p2.removeDuplicateFromStringArray(s);
	
    }
	public void reverseStringWithoutReadymadeMethods(String s)
	{
		System.out.println("Original String : "+ s);
		String rev="";
		for(int i=s.length()-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
		}
		System.out.println("Reversed String : " +rev);
	}
	public void countLengthOfStringWithoutLengthFunction(String s)
	{
		System.out.println("String is : "+ s);
		char[] c=s.toCharArray();
		int count=0;
		for(char c1:c)
		{
			System.out.println(c1);
			count++;
		}
		System.out.println("length of string : "+ count);
	}
	public void occouranceOfCharacterInString(String s)
	{
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
				System.out.println(c1+ " present "+count+" times ");
			}
		}
	}
	public void printOnlyDuplicateCharacterFromString(String s)
	{
		System.out.println("Given String : "+ s);
		System.out.print("duplicate are : ");
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
	public void swapWordsInString(String s)
	{
		System.out.println("String is : "+ s);
		System.out.print("After swapping : ");
		String[] s1 = s.split(" ");
		String temp=s1[0];
		s1[0]=s1[s1.length-1];
		s1[s1.length-1]=temp;
		for(int i=0;i<s1.length;i++)
		{
			System.out.print(s1[i]+" ");
		}
	}
	public int[] sortArray(int[] x)
	{
		System.out.print("Array is : ");
		for(int a:x)
		{
			System.out.print(a+" ");
		}
		System.out.println();
		System.out.print("Sorted Array is : ");
         Arrays.sort(x);
 		for(int a:x)
 		{
 			System.out.print(a+" ");
 		}
       return x;
	}
	public void printDuplicateInArrayList()
	{
		ArrayList al=new ArrayList();
		al.add(10);
		al.add(90);
		al.add(80);
		al.add(10);
		al.add(80);
		System.out.println("ArrayList : ");
		System.out.print(al);
		System.out.println();
		System.out.print("Duplicates are : ");
		HashSet h=new HashSet();
	    for(Object o:al)
	    {
	    	if(h.add(o)==false)
	    	{
	    		System.out.print(o+" ");
	    	}
	    }

	}
	public void sortArrayListInDNSO_CSO()
	{
		ArrayList<Integer> a=new ArrayList<Integer>();
		a.add(10);
		a.add(90);
		a.add(50);
		a.add(30);
		a.add(20);
		a.add(60);
		System.out.println("ArrayList is : ");
        System.out.println(a);
        Collections.sort(a);
        System.out.println("In DNSO : ");
        System.out.println(a);
        Collections.sort(a, new MyComparator2());
        System.out.println("In CSO");
        System.out.println(a);
        
	}
	public void removeSpaceFrommString(String s)
	{
		 System.out.println("String is : "+ s);
		 if(s.contains(" "))
		 {
			 s=s.replace(" ", "");
		 }
		 System.out.println("Without space : "+ s);
	}
	public void countOccouranceOfVowelsInString(String s)
	{
		String v="aeiou";
		s=s.toLowerCase();
		for(int i=0;i<v.length();i++)
		{
			char c1=v.charAt(i);
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
				System.out.println(c1+" present "+count+" times");
			}
		}
	}
	public boolean checkGivenNumberInArray(int[] x)
	{
		int num=20;
		boolean flag=false;
		for(int a:x)
		{
			if(num==a)
			{
				flag=true;
			}
		}
		return flag;
	}
	public void findOccouranceOfEachWordInString(String s)
	{
		System.out.println("String is : "+ s);
		String[] s1 = s.split(" ");
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
				System.out.println(w1+" present "+ count+" times");
			}
		}
	}
	public void reverseEachWordInString(String s)
	{
		 System.out.println("String is : "+ s);
		 String[] s1 = s.split(" ");
		 s=s.replace(" ","");
		 String temp="";
		 for(String s2:s1)
		 {
			 StringBuffer sb=new StringBuffer(s2);
			 String rev=sb.reverse().toString();
			 temp=temp+rev+" ";
		 }
		 System.out.println(temp);
	}
	public void removeDuplicateFromStringArray(String[] s)
	{
		   for(int i=0;i<s.length;i++)
		    {
		    	String a=s[i];
		    	int count=0;
		    	for(int j=0;j<s.length;j++)
		    	{
		    		String b=s[j];
		    		if(a.equals(b)&& i>j)
		    		{
		    			break;
		    		}
		    		if(a.equals(b))
		    		{
		    			count++;
		    		}
		    	}
		    	if(count==1)
		    	{
		    		System.out.print(s[i]+" ");
		    	}
		    }
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
class MyComparator2 implements Comparator<Integer>
{

	@Override
	public int compare(Integer o1, Integer o2) 
	{
		
		return -o1.compareTo(o2);
	}
	
}