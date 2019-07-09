package paskaita11;

import java.util.HashSet;

public class pirmaUz {

	public static void main(String[] args) {
		HashSet<String> aibe = new HashSet<String>();
		aibe.add("aa");
		aibe.add("bb");
		aibe.add("ab");
		aibe.add("ba");
		aibe.add("cc");
		System.out.println(aibe);
		aibe.add("aa");
		System.out.println(aibe);
		System.out.println(aibe.size());
		if (aibe.contains("aa")) {
			System.out.println("yra !!");
		}
		aibe.remove("aa");
		System.out.println(aibe+" "+aibe.size());
		aibe.clear();
		System.out.println(aibe+" "+aibe.size());
		
		
		
		
		
		
	}

}
