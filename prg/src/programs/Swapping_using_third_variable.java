package programs;

import java.util.Scanner;

public class Swapping_using_third_variable {
	public static void main(String[] args) {
		int a,b,c;
		Scanner obj=new Scanner(System.in);
		System.out.println("the numbers are:");
		a=obj.nextInt();
		b=obj.nextInt();
		c=a;
		a=b;
		b=c;
		System.out.println("swapping numbers are");
		System.out.println("a:"+a);
		System.out.println("b:"+b);	
		obj.close();
	}
}
