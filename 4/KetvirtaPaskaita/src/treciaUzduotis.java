import java.util.Scanner;

public class treciaUzduotis {

	public static void main(String[] args) {
								
		
		
		
		Scanner x = new Scanner(System.in);
		System.out.println("�veskite skai�i�");
		float a = x.nextFloat();
		System.out.println("�veskite norim� veiksm�");
		String c = x.next();
		System.out.println("�veskite skai�i�");
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