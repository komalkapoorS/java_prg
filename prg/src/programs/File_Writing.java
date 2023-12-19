package programs;
import java.io.FileWriter;
import java.io.IOException;

public class File_Writing {
	public static void main(String[]args) {
		try {
			FileWriter obj=new FileWriter("C:\\\\Users\\\\user\\\\Desktop\\\\JAVA FULL STACK DEVELOPMENT\\\\textfiles\\\\sample.txt");
			obj.write("java is a programming language");
			obj.close();
			System.out.println("Successfully written");
		}catch(IOException e) {
			System.out.println("error occured");
		}
	}
}
