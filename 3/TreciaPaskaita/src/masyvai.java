import java.util.*;

public class masyvai {
	public static void main(String[] args) {
		Scanner skanerisa = new Scanner(System.in);
		System.out.println("�veskite vard� ");
		
		String [] vardai = new String [3];
		
		vardai [0] = skanerisa.next();
		vardai [1] = skanerisa.next();
		vardai [2] = skanerisa.next();
	
		System.out.println(vardai[0].toUpperCase()+ " " + vardai[0].length());
		System.out.println(vardai[1].toUpperCase()+ " " + vardai[1].length());
		System.out.println(vardai[2].toUpperCase()+ " " + vardai[2].length());
	}
}