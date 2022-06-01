package Projects;

public class Example {
	Example(){
	System.out.println("Default Constructor");
}
	Example(int i, int j){
		System.out.println("Constructor with 2 parameters");
	}
	Example(int i, int j, int k){
		System.out.println("Constructors with 3 parameters");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Example ex = new Example();
		Example eg = new Example(2,4);
		Example example = new Example(3,6,2);
		

	}

}
