import java.util.ArrayList;

public class uzduotis3 {

	public static void main(String[] args) {
		ArrayList<String> listas1 = new ArrayList<>();

		listas1.add("Labas");
		listas1.add("Labas2");
		listas1.add("Labas3");
		listas1.add("Labas4");
		listas1.add("Labas");
		ArrayList<String> newListas1 = removeDuplicates(listas1);

//				HashSet metodas<<-------
//		Set<String> set= new HashSet<>(listas1);	
//		listas1.clear();
//		listas1.addAll(set);
//		System.out.println(listas1);
//		
		System.out.println(newListas1);

	}
	@SuppressWarnings("hiding")
	public static <String> ArrayList<String> removeDuplicates(ArrayList<String> listas1) {

		ArrayList<String> newListas1 = new ArrayList<String>();

		for (String element : listas1) {

			if (!newListas1.contains(element)) {

				newListas1.add(element);
			}
		}

		return newListas1;
	}
}