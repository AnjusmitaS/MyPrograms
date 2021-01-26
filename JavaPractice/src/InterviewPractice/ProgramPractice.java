package InterviewPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class ProgramPractice 
{
   public static void main(String[] args) 
   {
	   ProgramPractice p=new ProgramPractice();
	   /*p.countNumberOfDuplicateCharInString("welcome wel");
	   p.countLengthWithoutReadymadeMethod("mahabharat");
	   ArrayList<Integer> al=new ArrayList<Integer>();
	   al.add(10);al.add(90);al.add(40);al.add(30);al.add(10);al.add(90);al.add(50);al.add(100);al.add(60);
	   p.removeDuplicateFromListandSortInASC(al);
	   p.reverseString("Anjusmita");
	   p.reverseWordsInString("i love my India");
	   p.reverseEachWordInString("my name is khan");*/
	  // p.swap1standLastWordInString("Live Laugh Love");
	  // p.sortHashMapKeys();
	  // p.findSummationOfArray();
	   //p.findAverageOfArray();
//	   p.findMin_MaxInArray();
	  // p.removeDuplicateFromAL();
	   p.sortHashMapKeys_DNSO_CSO();
   }
   public void countNumberOfDuplicateCharInString(String s)
   {
	   int num=0;
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
			   num++;
		   }
	   }
	   System.out.println(num);
   }
   public void countLengthWithoutReadymadeMethod(String s)
   {
	   char[] c = s.toCharArray();
	   int count=0;
	   for(char c1:c)
	   {
		   count++;
	   }
	   System.out.println("Length : "+ count);
   }
   public void removeDuplicateFromListandSortInASC(ArrayList<Integer> al)
   {
    	   Collections.sort(al);
    	   Object[] o = al.toArray();
    	   for(int i=0;i<o.length;i++)
    	   {
    		   int count=0;
        	   for(int j=0;j<o.length;j++)
        	   {
        		   if(o[i]==o[j]&& i>j)
        		   {
        			   break;
        		   }
        		   if(o[i]==o[j])
        		   {
        			   count++;
        		   }
        	   }
        	   if(count>0)
        	   {
        		   System.out.print(o[i]+" ");
        	   }
    	   }
   }
  public void reverseString(String s)
  {
	  System.out.println("\n"+"String  : "+ s);
	  for(int i=s.length()-1;i>=0;i--)
	  {
		  System.out.print(s.charAt(i));
	  }
  }
  public void reverseWordsInString(String s)
  {
	  System.out.println("\n"+"String : "+s);
	  String[] s1 = s.split(" ");
	  for(int i=s1.length-1;i>=0;i--)
	  {
		  System.out.print(s1[i]+" ");
	  }
  }
  public void reverseEachWordInString(String s)
  {
	  System.out.println("\n"+" String : "+ s);
	  String[] s1 = s.split(" ");
	  String rev="";
	  for(String a: s1)
	  {
		  StringBuffer sb=new StringBuffer(a);
		  String temp=sb.reverse().toString();
		  rev=rev+temp+" ";
	  }
	  System.out.println(rev);
  }
  public void swap1standLastWordInString(String s) 
  {
	  System.out.println("String : "+ s);
	  String[] s1 = s.split(" ");
	  String temp=s1[0];
	  s1[0]=s1[s1.length-1];
	  s1[s1.length-1]=temp;
	  
	  for(int i=0;i<s1.length;i++)
	  {
		  System.out.print(s1[i]+" ");
	  }
  }
  public void sortHashMapKeys()
  {
	  HashMap<Integer,String> h=new HashMap<Integer, String>();
	  h.put(20,"Anju");h.put(40,"gudu");h.put(90,"bubu");h.put(60,"sinu");h.put(30,"Anu");h.put(10,"gunu");h.put(70,"Anju");
	  System.out.println(h);
        Set<Integer> keys = h.keySet();
        ArrayList<Integer> al=new ArrayList<Integer>();
        for(Integer a: keys)
        { 	    
        	al.add(a);
        }
        Collections.sort(al);
        System.out.println(al);// ASC     
  }
   public void findSummationOfArray()
   {
	   int[] x= {10,30,40,55,66};
	   int sum=0;
	   for(int a: x)
	   {
		   System.out.print(a+" ");
	   }
	   for(int i=0;i<x.length;i++)
	   {
		   sum=sum+x[i];
	   }
	   System.out.println("\n"+"Summation  : "+ sum);
   }
   public void findAverageOfArray()
   {
	   int[] x= {10,30,40,55,66};
	   int length=x.length;
	   int sum=0;
	   
	   for(int a: x)
	   {
		   System.out.print(a+" ");
	   }
	   for(int i=0;i<x.length;i++)
	   {
		   sum=sum+x[i];
	   }
	   System.out.println("\n"+"Summation  : "+ sum);
	   System.out.println("Length  : "+ length);
	   int avg=sum/length;
	   System.out.println("Average : "+ avg);
   } 
   public void findMin_MaxInArray()
   {
	   int[] x= {10,30,40,55,66};
        int max=x[0];
        for(int a:x)
        {
        	if(a>max)
        	{
        		max=a;
        	}
        }
        System.out.println("Maximum : "+max);
        int min=x[0];
        for(int a:x)
        {
        	if(a<min)
        	{
        		min=a;
        	}
        }
        System.out.println("Minimum : "+min);
   }
   public void removeDuplicateFromAL()
   {
	   ArrayList<Integer> al=new ArrayList<Integer>
	             (Arrays.asList(12,34,87,56,98,54,35,66,97,12,34,87,56,98,54,35,66,97));// array to list conversion
	   System.out.println(al);
	   LinkedHashSet<Integer> lhs=new LinkedHashSet<Integer>(al);// remove duplicate from list
	   System.out.println(lhs);
	   
	   ArrayList<Integer> al2=new ArrayList<Integer>(lhs);
	   Collections.sort(al2);// sorting in DNSO
	   System.out.println(al2);   
   }
   public void sortHashMapKeys_DNSO_CSO()
   {
	   HashMap<Integer,String> hm=new HashMap<Integer,String>();
	   hm.put(29,"anju");
	   hm.put(99,"anju");
	   hm.put(39,"anju");
	   hm.put(49,"anju");
	   hm.put(58,"anju");
	   hm.put(22,"anju");
	   hm.put(11,"anju");
	   Set<Integer> keys = hm.keySet();
	   ArrayList<Integer> al=new ArrayList<Integer>(keys);
//         for(Integer a:keys)
//         {
//        	 al.add(a);
//         }
         Collections.sort(al);
         System.out.println(al);
   }
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
}
