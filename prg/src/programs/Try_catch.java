package programs;

public class Try_catch {
	public static void main(String[] args) {
		try {
			System.out.println(29/29);
			System.out.println(29/0);
		}
		catch(ArithmeticException e) {
			System.out.println("this instruction cannot be done");
		}
	}

}
