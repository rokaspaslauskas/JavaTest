import java.util.*;

public class pirmaUzduotis {

	public static void main(String[] args) {
		
		Scanner x = new Scanner(System.in);
		System.out.println("�veskite skai�i� nuo 1 iki 7");
		int a = x.nextInt();
		
		if ((a>0)&&(a<=7)) {
			
			switch (a) {
			  case 1:
			    System.out.println("Monday");
			    break;
			  case 2:
			    System.out.println("Tuesday");
			    break;
			  case 3:
			    System.out.println("Wednesday");
			    break;
			  case 4:
			    System.out.println("Thursday");
			    break;
			  case 5:
			    System.out.println("Friday");
			    break;
			  case 6:
			    System.out.println("Saturday");
			    break;
			  case 7:
			    System.out.println("Sunday");
			    break;
			}
			
		} else System.out.println("Neteisingas skai�ius!!!") ;
		
		
		
		x.close();
		
		
	}

}
