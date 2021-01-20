package InterviewPractise2;

public class StringProgramms 
{
  public static void main(String[] args) 
  {
	  StringProgramms sp=new StringProgramms();
	  int[] x= {23,44,32,87,76,90,54};
	  sp.reverseString("Anjusmita");
	  sp.swap2Numbers_WithoutUsing3rd(32,42);
	  sp.removeDuplicateFromString("anjusmitaanjusmita");
	  sp.lengthOfString_Array_Without_length_function("javawithselenium", x);
	  sp.printDuplicateCharInString("mahabharat");
	  sp.printOccouranceOfEachChar("mahabharat");
	  sp.removeSpacesFromAString("a nju sm ita");
	  sp.swap1st_lastWord_OfaString("i am a girl");
	  sp.fetchOccouranceOfVowelsInString("anjusmita sahoo");
	  sp.countOccouranceOf_each_WordInString("my name is anju . my name is not anu");
	  sp.reverseEachWordOfString("you are my panda");
	  sp.printASCII_valueOfeachChar("my panda");
	 System.out.println(sp.checStringContainsNumberorNot("anju1997"));
	 System.out.println(sp.checkStringPalindrom_not("madam"));
}
  public void reverseString(String s)
  {
	  System.out.println("String is : "+ s);
	  String rev="";
	  for(int i=s.length()-1;i>=0;i--)
	  {
		  rev=rev+s.charAt(i);
	  }
	  System.out.println("Reversed String : "+ rev);
	  System.out.println("------------------------------------------------------");
  }
  public void printDuplicateCharInString(String s)
  {
	  System.out.println("String is : "+ s);
	  System.out.println("Duplicate Char : ");
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
     System.out.println();
     System.out.println("----------------------------------------------------------");
  }
  public void lengthOfString_Array_Without_length_function(String s,int[]x)
  {
	  System.out.println("String is : "+ s);
	  char[] ca = s.toCharArray();
	  int count=0;
	  for(char c1: ca)
	  {
		  count++;
	  }
	  System.out.println("Length of String : "+ count);
	  System.out.println("Array is :");
	  int count2=0;
	  for(int a:x)
	  {
		  System.out.print(a+" ");
		  count2++;
	  }
	  System.out.println("\n"+"Length of Array : "+ count2);
	  System.out.println("--------------------------------------------------------------");
  }
  public void removeDuplicateFromString(String s)
  {
	  System.out.println("String is : "+ s);
	  System.out.println("after removing duplicate : ");
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
			  System.out.print(c1);
		  }
	  }
	  System.out.println();
	  System.out.println("-------------------------------------------------------");
  }
  public void swap2Numbers_WithoutUsing3rd(int firstNum,int secondNum)
  {
	  System.out.println("FirstNumber : "+ firstNum+"\n"+"SecondNumber : "+ secondNum);
	  firstNum=firstNum+secondNum;
	  secondNum=firstNum-secondNum;
	  firstNum=firstNum-secondNum;
	  System.out.println("FirstNumber after swap : "+ firstNum+"\n"+"SecondNumber after swap : "+ secondNum);
      System.out.println("------------------------------------------------------------");
  }
  public void printOccouranceOfEachChar(String s)
  {
	  System.out.println("Given String : "+ s);
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
			  System.out.println(c1+ " present "+ count+" times");
		  }
	  }
	  System.out.println("--------------------------------------------------");
  }
  public void swap1st_lastWord_OfaString(String s)
  {
	  System.out.println("Given String : "+ s);
	  String[] s1=s.split(" ");
	  String temp=s1[0];
	  s1[0]=s1[s1.length-1];
	  s1[s1.length-1]=temp;
	  System.out.println("After swapping position if first and last word :");
	  for(int i=0;i<s1.length;i++)
	  {
		  System.out.print(s1[i]+" ");
	  }
	  System.out.println("\n"+"-----------------------------------------------------------------------------------");
  }
  public void removeSpacesFromAString(String s)
  {
	  System.out.println("Given String  : "+ s);
	  if(s.contains(" "))
	  {
		  s=s.replace(" ", "");
	  }
	  System.out.println("After removing space from string : "+ s+"\n"+"---------------------------------------------------------------");
  }
  public void fetchOccouranceOfVowelsInString(String s)
  {
	  System.out.println("Given String : "+ s);
	  String v="aeiou";
	  s=s.toLowerCase();
	  for(int i=0;i<v.length();i++)
	  {
		  int count=0;
		  for(int j=0;j<s.length();j++)
		  {
			  if(v.charAt(i)==s.charAt(j))
			  {
				  count++;
			  }
		  }
		  if(count>0)
		  {
			  System.out.println(v.charAt(i)+" present "+count+" times");
		  }
	  }
	  System.out.println("---------------------------------------------------------------------------");
  }
  public void countOccouranceOf_each_WordInString(String s)
  {
	   String[] s1 = s.split(" ");
	   for(int i=0;i<s1.length;i++)
	   {
		   int count=0;
		   for(int j=0;j<s1.length;j++)
		   {
			   if(s1[i].equals(s1[j]) && i>j)
			   {
				   break;
			   }
			   if(s1[i].equals(s1[j]))
			   {
				   count++;
			   }
		   }
		   if(count>0)
		   {
			   System.out.println(s1[i]+" present "+count+" times");
		   }
	   }
	   System.out.println("------------------------------------------");
  }
  public void reverseEachWordOfString(String s)
  {
	  System.out.println("String is  : "+ s);
	  String[] s1 = s.split(" ");
	  String rev="";
	  for(String a:s1)
	  {
		  StringBuffer sb=new StringBuffer(a);
		  String temp=sb.reverse().toString();
		  rev=rev+temp+" ";
	  }
	  System.out.println("After reversing each word : "+rev+"\n"+"-----------------------------------------------------------");
  }
  public void printASCII_valueOfeachChar(String s)
  {
	  System.out.println("String is : "+ s+"\n"+"ASCII value of each char : ");
	  for(int i=0;i<s.length();i++)
	  {
		  int an=s.charAt(i);
		  System.out.println(s.charAt(i)+" --> "+ an);
	  }
	  System.out.println("------------------------------------------");
  }
  public boolean checStringContainsNumberorNot(String s)
  {
	  boolean flag=false;
	  System.out.println("String is : "+ s);
	  for(int i=0;i<s.length();i++)
	  {
		  int an=s.charAt(i);
		  if(an>=47 && an<=58)
		  {
			  flag=true;
		  }
	  }
	  return flag;
  }
  public boolean checkStringPalindrom_not(String s)
  {
	  System.out.println("------------------------------------------------------------"+"\n"+"String : "+ s);
	  boolean flag=false;
	  s=s.toLowerCase();
	  String rev="";
	  for(int i=s.length()-1;i>=0;i--)
	  {
		  rev=rev+s.charAt(i);
	  }
	  if(s.equals(rev))
	  {
		  flag=true;
	  }
	  return flag;
  }
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
}
