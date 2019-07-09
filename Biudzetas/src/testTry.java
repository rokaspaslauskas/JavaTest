import java.util.*;

public class testTry {

	public static void main(String[] args) {
		// String s = "fred"; // use this if you want to test the exception below
		Scanner sc= new Scanner(System.in);
		//String s = sc.nextln();
		String s = "22";
		try {
			// the String to int conversion happens here
			float i = Integer.parseInt(s.trim());

			// print out the value after the conversion
			System.out.println("float i = " + i);
		} catch (NumberFormatException nfe) {
			System.out.println("NumberFormatException: " + nfe.getMessage());
		}
	}

}
