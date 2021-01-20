package InterviewPractice;

abstract public class ConstructorOverloadingInAbstractClass
{
	ConstructorOverloadingInAbstractClass()
	{
		System.out.println("hi");
	}
	ConstructorOverloadingInAbstractClass(int a)
	{
		System.out.println(a);
	}
	ConstructorOverloadingInAbstractClass(int a,int b)
	{
		System.out.println(a);
		System.out.println(b);
	}
	/* constructor overloading in abstract class valid ,we do to initialize variables 
	 one class can extends to it and can call the constructor by super() statement
	   class A extends ConstructorOverloadingInAbstractClass
	   {
		   A()
		   {
			   super();   in one way we can call
			     or
			   super(10)
			      or
			   super(29,33);
		   }
	   }*/
}
