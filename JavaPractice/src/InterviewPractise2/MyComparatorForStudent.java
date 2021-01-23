package InterviewPractise2;

import java.util.Comparator;

public class MyComparatorForStudent implements Comparator<StudentInfo>
{

	@Override
	public int compare(StudentInfo o1, StudentInfo o2) 
	{
		String s1=o1.name;
		String s2=o2.name;
		return s1.compareTo(s2);
	}

}
