package paskaita11;

public class Paveldejimai {

	public static void main(String[] args) {
		Obuolys o1 = new Obuolys();
		Antaninis a1 = new Antaninis();
		Alyvinis al1 = new Alyvinis();
		Egzotiniai egz1 = new Egzotiniai();
		
		System.out.println(al1 instanceof Obuolys);
		System.out.println(o1 instanceof Alyvinis);
		
		
		egz1.kasAsEsu();
		al1.kasAsEsu();
		a1.kasAsEsu();
		o1.kasAsEsu();
	}

}