package InterviewPractise2;

public class StudentInfo implements Comparable<StudentInfo> 
{
	int age;
	String name;
	int rollnum;
	StudentInfo(int age,String name,int rollnum)
	{
		this.name=name;
		this.age=age;
		this.rollnum=rollnum;
	}
	public int compareTo(StudentInfo s) 
	{
		if(age==s.age)
		{
		return 0;
		}
		else if(age>s.age)
		{
		return 1;
		}
		else 
		{
		return -1;
		}

	}


}
