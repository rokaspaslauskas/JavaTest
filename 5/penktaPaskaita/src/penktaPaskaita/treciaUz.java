package penktaPaskaita;
import java.util.*;
public class treciaUz {

	public static void main(String[] args) {
		
		Random random = new Random();
		int a = random.nextInt(100);
		int b;
		Scanner sc = new Scanner(System.in);
		System.out.println("�veskite skai�i�!");
		b = sc.nextInt();
		while (a!=b) {
			if (a>b) {
				System.out.println("�vestas skai�ius ma�esnis!");
				System.out.println("�veskite didesn� skai�i�!");
				b = sc.nextInt();
			}else {
				System.out.println("�vestas skai�ius didesnis!");
				System.out.println("�veskite ma�esn� skai�i�!");
				b = sc.nextInt();
			}
				
		}
		System.out.println("Laim�jote!");
		sc.close();
	}

}