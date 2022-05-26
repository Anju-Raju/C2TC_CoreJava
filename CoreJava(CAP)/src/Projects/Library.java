package Projects;
//Assignment 2
public class Library {
	int acc_num;
	String Title;
	String Author;
	
	public void input()
	{
		System.out.println("Access number "+1054);	
		}
	
	public void compute() {
		System.out.println("The number of days late: " + 3 +" Each day fine Rs:5, Now the total fine is " +15 );
	}
	
	public void display()
	{
		System.out.println("Accession Number       Title           Author  ");
		System.out.print("     1054         Java Full Stack     Anju Raju ");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Library lib = new Library();
		lib.input();
		lib.compute();
        lib.display();
	}

}
