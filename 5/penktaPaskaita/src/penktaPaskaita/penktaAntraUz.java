package penktaPaskaita;
import java.util.Random;



public class penktaAntraUz {
	
	public static void main(String[] args) {
	
		
		Random random = new Random();
		
		int a =random.nextInt(6);
		int b =random.nextInt(6);
		int c =random.nextInt(6);
		
		
			if (a==5||b==5||c==5) {
				System.out.println("Pralaimëjai...");
			} else { System.out.println("Laimëjai!");}
		
		
		
	}

}
