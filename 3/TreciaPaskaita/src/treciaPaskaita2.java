import java.util.Scanner;

public class treciaPaskaita2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner skanerisa = new Scanner(System.in);
		System.out.println("�veskite savop eilut�");
		String a = skanerisa.nextLine();
		System.out.println(a.toUpperCase());
		System.out.println(a.toLowerCase());
		System.out.println(a.length());
		System.out.println(a.replace('a', '@'));
		System.out.println("J�s� sakinys: "+a);
		
		skanerisa.close();
		
		
		
		
		
		
	}

}
