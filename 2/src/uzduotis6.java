import java.util.Scanner;

public class uzduotis6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner skaneris = new Scanner(System.in);
		System.out.println("�veskite skai�i� ");
		int a = skaneris.nextInt();
		
		if (a % 2 == 0) {
			System.out.println("skai�ius yra lyginis,");
		} else {
			System.out.println("skai�ius yra nelyginis,");
		}
	}

}
