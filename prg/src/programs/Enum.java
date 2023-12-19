package programs;

public class Enum {
	public static void main(String[]args) {
		enum level{
			medium,
			easy,
			hard
		}
		level obj = level.easy;
		System.out.println(obj);
		level obj1 = level.medium;
		System.out.println(obj1);
		level obj2 = level.hard;
		System.out.println(obj2);
	}
}
