package Projects;
import java.util.*;

public class Studentsc {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name of the student");
	    String n = sc.nextLine();
	    System.out.println("Enter the marks of the student");
	    float m = sc.nextFloat();
	    System.out.println("Enter the ID of the student");
	    int o = sc.nextInt();
	    System.out.println("Enter the Character");
	    char c = sc.next().charAt(0);
	
	    
	    System.out.println("The name of the student is: "+n);
	    System.out.println("The marks of the student is: "+m);
	    System.out.println("The ID of the student is: "+o);
	    System.out.println("character is : "+c);
	}

}
