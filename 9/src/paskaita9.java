import java.util.ArrayList;
import java.util.Scanner;

public class paskaita9 {

	public static void main(String[] args) {
		ArrayList<String> listas = new ArrayList<>();
		boolean tikrinimas = true;
		Scanner sc = new Scanner(System.in);
		String inputString;
		String didString = "";

		while (listas.size() < 5) {
			System.out.println("áveskite þodá!");
			inputString = (sc.next());
			listas.add(inputString);

//				if (listas.size() < 5) {
//					if(listas.contains(inputString)) {
//						System.out.println("kartojasi");
//					} else {
//						listas.add(inputString);
//					
//					}
//				}
//				else {
//					System.out.println(listas);
//					listas.clear();
//					listas.add(inputString);
//				}
		}
		// SHORT for each
//		for (String elm : listas) {
//			if (didString.length() < elm.length()) {
//				didString = elm;
//			}yug
//		}
////			FOR EACH pilnas
		for (int i = 0; i < (listas.size()); i++) {
			if (didString.length() < listas.get(i).length()) {
				didString = listas.get(i);
				//jai reikia breako <-----
//				if (didString.length()>2) {
//					break;
//				}
			}
		}
		System.out.println(didString);

		sc.close();
		
		
	}

}
