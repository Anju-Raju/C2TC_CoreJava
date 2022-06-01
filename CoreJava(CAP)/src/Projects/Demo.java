package Projects;

interface MyInterface
{
	//compiler will treat them as
	//public abstract void method1();
	//public abstract void method2();
	public void method1();
	public void method2();
}

public class Demo implements MyInterface {
	
	public void method1()
	{
		System.out.println("Implementation of method1");
	}
	public void method2()
	{
		System.out.println("Implementation of method2");
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo ob = new Demo();
		ob.method1();
		ob.method2();

	}

}
