package programs;
import java.util.Scanner;

public class Odd_or_even {
	public static void main(String[]args) {
		Scanner num=new Scanner(System.in);
		System.out.println("Enter the number:");
		int no=num.nextInt();
		if (no % 2 == 0){
			System.out.println("the number is a even number");	
		}
		else {
			System.out.println("the number is a odd number");
		}
		num.close();
	}
}
