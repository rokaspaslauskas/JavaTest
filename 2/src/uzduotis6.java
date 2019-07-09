import java.util.Scanner;

public class uzduotis6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner skaneris = new Scanner(System.in);
		System.out.println("Áveskite skaièiø ");
		int a = skaneris.nextInt();
		
		if (a % 2 == 0) {
			System.out.println("skaièius yra lyginis,");
		} else {
			System.out.println("skaièius yra nelyginis,");
		}
	}

}
