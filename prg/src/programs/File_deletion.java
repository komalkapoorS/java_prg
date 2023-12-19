package programs;
import java.io.File;

public class File_deletion {
	public static void main(String[]args) {
		File obj=new File("C:\\\\Users\\\\user\\\\Desktop\\\\JAVA FULL STACK DEVELOPMENT\\\\textfiles\\\\sample.txt");
		if(obj.delete()) {
			System.out.println("File deleted");	
		}
		else{
			System.out.println("error occured");
		}
	}

}
