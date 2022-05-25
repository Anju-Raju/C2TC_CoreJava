package Projects;

class superclass//parent class
{
	void display()
	{
		System.out.println("I am a Super class");
	}
}

public class Subclass extends superclass
{
	void display1() {
		System.out.println("I am a Sub class");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Subclass ob = new Subclass();
		ob.display();
		ob.display1();

	}

}
