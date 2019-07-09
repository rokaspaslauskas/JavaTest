import java.util.ArrayList;
import java.util.Scanner;

public class dinaminiaiSarasaiAntra {

	public static void main(String[] args) {
//		Programa priima tokias komandas:
//			[1] -�vesti �od� -leid�ia �vesti �od�, kuris i�saugomas � s�ra��       +
//			[2] -rasti �od� -randa �od� ir atspausdina kelintas jis yra s�ra�e     +
//			[3] -trinti �od� -paklausia, kok� �od� i�trinti ir j� i�trina
//			[4] -i�valyti s�ra��
//			[5] -baigti program�
		boolean runProgram = true;
		Scanner sc = new Scanner(System.in);
		ArrayList<String> stringListas = new ArrayList<String>();
		
		
		
		System.out.println(
				"Pasirinkite veiksm�: \n[1] -�vesti �od�\n[2] -rasti �od�\n[3] -trinti �od�\n[4] -i�valyti s�ra��\n[5] -baigti program�");
		String menu = sc.next();
		while (runProgram) {
			if (menu.equals("1")) {
				System.out.println("�veskite �od� s�ra��:");
				stringListas.add(sc.next());
				System.out.println(stringListas);
				System.out.println("Pasirinkite veiksm�: ");
				menu = sc.next();
			} else if (menu.equals("2")) {
				System.out.println("�veskite ie�koma �od�:");
				String ieskomasString = sc.next();
				for (String elementas : stringListas) {
					if (ieskomasString.equals(elementas)) {
						System.out.println("J�s� ie�komas �odis yra sara�o " + (stringListas.indexOf(elementas) + 1)
								+ "-oje vietoje");
						System.out.println("Pasirinkite veiksm�: ");
						menu = sc.next();
					}
				}
			} else if (menu.equals("3")) {
				System.out.println("Iveskite �od� kur� norite i�trinti:");
				String trinamasString = sc.next();
				System.out.println("Ar tikrai norite i�trinti �vesta �od�? [taip] arba [ne]");
				String trinamasZodis = sc.next();
				if (trinamasZodis.equals("taip")) {
					stringListas.remove(trinamasString);
					System.out.println("Jusu i�trintas �odis: ");
					System.out.println(trinamasString);
					System.out.println("�od�i� s�ra�as: ");
					System.out.println(stringListas);
					
				}	else {
					System.out.println("Pasirinkite veiksm�: ");
					menu = sc.next();
				}
			} else if (menu.equals("4")) {
				System.out.println(stringListas);
				stringListas.clear();
				System.out.println("Pasirinkite veiksm�: ");
				menu = sc.next();
			} else if (menu.equals("5")) {
				runProgram = false;
			} else {
				System.out.println("error404!!! Neteisinga �vestis!");
				System.out.println("Pasirinkite veiksm�: ");
				menu = sc.next();
			}

		}
		
		sc.close();
	}
}