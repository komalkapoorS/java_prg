package programs;
import java.util.ArrayList;
public class ArrayListEX {
	    public static void main(String[] args) {
	        ArrayList<String> obj = new ArrayList<String>();
	        obj.add("pink");
	        obj.add("black");
	        obj.add("blue");
	        obj.add("red");
	        obj.set(0, "purple");
	        obj.remove(3);
	        System.out.println(obj);

	        ArrayList<Integer> obj2 = new ArrayList<Integer>();
	        obj2.add(2285);
	        obj2.add(2286);
	        obj2.add(2287);
	        obj2.add(2289);
	        obj2.set(3, 2288);
	        obj2.remove(2);
	        System.out.println(obj2);
	    }
	


}
