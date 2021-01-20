package InterviewPractice;

public class Child extends Parent
{
	int x=29;
    public void m1()
    {
    	System.out.println(x);
    	System.out.println("child m1()");
    	super.m1();
    	System.out.println("parent x : "+ super.x);
    	check();
    }
    public static void main(String[] args) {
    	Child c=new Child();
    	c.m1();
	}
    public void check()
    {
    	System.out.println("addition : " +this.x+super.x);
    	
    }
}
