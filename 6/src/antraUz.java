import java.util.*;
public class antraUz {

	public static void main(String[] args) {
//				spausdink("Rokas","Paslauskas","JAVA", 22);
//				spausdink("Rokas","Paslauskas","JAVA");
				Scanner sc = new Scanner(System.in);
				String a = sc.nextLine();
				String b = sc.nextLine();
				String c = sc.nextLine();
//				int d = sc.nextInt();
				String d = sc.nextLine();
				
				AntraUzInfo obj= new AntraUzInfo();
				AntraUzInfo.statinis();
				AntraUzInfo.nepasiekiamas1();
				if (d.equals("")) {
					obj.spausdink(a,b,c);	
				} else {
				
				obj.spausdink(a,b,c,d);
				}//su if spausdinimu
				
				
//				spausdink(a,b,c,d);
				}
	
	
	
	
	
	
	
	
	
	
	
}