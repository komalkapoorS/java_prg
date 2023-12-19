package programs;
import java.io.File;
import java.io.IOException;

public class File_creation {
		public static void main(String[] args) {
			try {
				File obj=new File("C:\\Users\\user\\Desktop\\JAVA FULL STACK DEVELOPMENT\\textfiles\\sample.txt");
				if (obj.createNewFile()) {
					System.out.println("File Created Successfully");
				}else {
					System.out.println("File not created");
				}
			}catch(IOException e) {
				System.out.println("An error occured");
				e.printStackTrace();
			}
			
		}

}
