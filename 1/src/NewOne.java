
public class NewOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 5;
		int b = 3;
		int i = 0;
//		float a = 5;
//		float b = 3;		
		float rez;
		a++;
		b--;
		
		rez = a * b / 5;   //rez = a * b / 5f; gausi float rez
 		System.out.println(rez);	
		if (rez > 2) {
			System.out.println("you use floats");
		}	
			else {
				System.out.println("you use int");
			}
		for (; i < a; i++) {
			System.out.println(i);
		}
		System.out.println(rez + i);
	}
	
}
