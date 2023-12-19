package programs;
import java.util.Scanner;

public class Leap_year_or_not {
	public static void main(String[]args) {
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the year:");
		int year=obj.nextInt();
		if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)){
			System.out.println("the year is a leap year");	
		}
		else {
			System.out.println("the year is not a leap year");
		}
		obj.close();
	}
}
