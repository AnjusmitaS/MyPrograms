package InterviewPractise2;

import java.util.ArrayList;
import java.util.Collections;

public class CheckStudent
{
	public static void main(String[] args) 
	{
       ArrayList<StudentInfo> al=new ArrayList<StudentInfo>();
       al.add(new StudentInfo(23,"anju",56));
       al.add(new StudentInfo(22,"bubu",58));
       al.add(new StudentInfo(25,"gudu",43));
       al.add(new StudentInfo(29,"silu",67));
       al.add(new StudentInfo(24,"anu",87));
       al.add(new StudentInfo(21,"jeet",44));
       Collections.sort(al);
       for(StudentInfo s1:al)
       {
    	  System.out.println(s1.age+" --> "+s1.name+" --> "+s1.rollnum); 
       }
       System.out.println();
       Collections.sort(al,new MyComparatorForStudent());
       for(StudentInfo s1:al)
       {
    	  System.out.println(s1.name+" --> "+s1.rollnum+" --> "+s1.age); 
       }
	}

}
