
public class Hourglass {
	//print base
	//print top half
	//print middle
	//print bottom half
	//print string of characters (string, iterate # of times)
		// loop count times
		//print the character
	

	public static String characters(String c, int x, int s) {
		for (int a = 0; a < 1; a++) {
			spaces(" ", s);
			for (int i = 0; i < x; i++) {
				System.out.print(c);
			}
			System.out.println();
		}
		return c;
	}
	public static String base(String c, int x) {
		for (int a = 0; a < 1; a++) {
			for (int i = 0; i < x; i++) {
				System.out.print(c);
			}
			System.out.println();
		}
		return c;
	}
	public static String middle(String c, int x) {
		for (int a = 0; a < 1; a++) {
			spaces(" ", 4);
			for (int i = 0; i < x; i++) {
				System.out.print(c);
			}
			System.out.println();
		}
		return c;
	}
	public static void tophalf() {
		characters(":", 8, 1);
		characters(":", 6, 2);
		characters(":", 4, 3);
		characters(":", 2, 4);
	}
	public static void bottomhalf() {
		characters(":", 2, 4);
		characters(":", 4, 3);
		characters(":", 6, 2);
		characters(":", 8, 1);
		
	}
	public static String spaces(String s, int x) {
			for (int i = 0; i < x; i++) {
				System.out.print(s);
		}
		return s;
	}
	
	public static String tophalf2(String c, int x) {
		for(int i = 1; i <= 4; i++) {
			System.out.print("c");
		}
		return c;
	}
		
	public static void main(String[] args) {
		base("\"", 10);
		tophalf();
		middle("|", 2);
		bottomhalf();
		base("\"", 10);
		
		
	}
}
