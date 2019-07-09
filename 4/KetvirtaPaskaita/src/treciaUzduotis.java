import java.util.Scanner;

public class treciaUzduotis {

	public static void main(String[] args) {
								
		
		
		
		Scanner x = new Scanner(System.in);
		System.out.println("Áveskite skaièiø");
		float a = x.nextFloat();
		System.out.println("Áveskite norimà veiksmà");
		String c = x.next();
		System.out.println("Áveskite skaièiø");
		float b = x.nextFloat();
		x.close();
		
		if ("+".equals (c)) {
			System.out.println(a+b);
		} else if ("-".equals (c)) {
			System.out.println(a-b);
		}else if ("*".equals (c)) {
			System.out.println(a*b);
		}else if ("/".equals (c)) {
			System.out.println(a/b);
		}else System.out.println("error 404");
		
		
		
		
	}

}
