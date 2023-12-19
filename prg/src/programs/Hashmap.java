package programs;
import java.util.HashMap;
import java.util.HashSet;
public class Hashmap {
	public static void main(String[] args) {
		HashMap<String, String> capital = new HashMap<String, String>();
		capital.put("india", "delhi");
		capital.put("korea", "seoul");
		capital.put("france", "paris");
		capital.remove("england");
		capital.replace("korea", "seoul", "busan");
		System.out.println(capital.get("india"));
		System.out.println(capital.get("korea"));
		
		
	HashSet<String> capital2=new HashSet<String>();
	capital2.add("england");
	System.out.println(capital2.contains("england"));
	}

}
