package programs;
import java.util.Scanner;

public class User_input {
	public static void main (String[]args) {
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter user details");
		String name=obj.nextLine();
		System.out.println("Name:"+name);
		int age=obj.nextInt();
		System.out.println("user Age:"+age);
		long accno=obj.nextLong();
		System.out.println("user Accno:"+accno);
		obj.close();
	}
}

