package programs;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class File_read {
	public static void main(String[] args) {
		try {
			File obj=new File("C:\\\\Users\\\\user\\\\Desktop\\\\JAVA FULL STACK DEVELOPMENT\\\\textfiles\\\\sample.txt");
			Scanner myobj=new Scanner(obj);
			while(myobj.hasNextLine()) {
				String data=myobj.nextLine();
				System.out.println(data);
			}
			myobj.close();
		}catch(FileNotFoundException e) {
			System.out.println("no such file");
		}
	}
}
