package InterviewPractise2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;

public class StringWithCollection 
{	
	public static void main(String[] args) 
	{
		StringWithCollection s=new StringWithCollection();
		//s.occOf_aWord_sortWords_removeDuplicate_FromString();
		s.occOfWordsInString();
	}
    public void occOf_aWord_sortWords_removeDuplicate_FromString()
    {
    	String s="anju sonu bubu gudu cat anju sonu bubu gudu cat";
    	String[] s1 = s.split(" ");
    	ArrayList<String> al=new ArrayList<String>(Arrays.asList(s1));
    	System.out.println(al);
    	LinkedHashSet<String> lh=new LinkedHashSet<String>(al);// removing duplicate
    	ArrayList<String> al1=new ArrayList<String>(lh);
    	Collections.sort(al1);// sorting in DNSO
    	System.out.println(al1);
    	int num = Collections.frequency(al1, "anju");// checking occurrence of a particular word in a string
    	System.out.println(num);
    } 
    public void occOfWordsInString()
    {
    	String s="i am a girl . i love to dance . i love my family . girls are good";
    	s=s.replace(" . ", " ");
    	System.out.println(s);
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
        		System.out.println(s1[i]+" --> "+ count+" times"); 
        	 }
         }
    	
    }

}
