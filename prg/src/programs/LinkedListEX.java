package programs;
import java.util.LinkedList;

public class LinkedListEX {
	    public static void main(String[] args) {
	        LinkedList<String> colour = new LinkedList<String>();
	        colour.add("pink");
	        colour.add("black");
	        colour.add("blue");
	        colour.add("red");
	        colour.removeFirst();
	        colour.removeLast();
	        System.out.println(colour);

	        // Check if the list is not empty before getting the last element
	        if (!colour.isEmpty()) {
	            System.out.println(colour.getLast());
	        }

	        LinkedList<Integer> colour2 = new LinkedList<Integer>();
	        colour2.add(2285);
	        colour2.add(2286);
	        colour2.add(2287);
	        colour2.add(2288);
	        colour2.removeFirst();
	        colour2.removeLast();
	        System.out.println(colour2);
	    }
	

}
