
public class AntraUzInfo {

	private String nepasiekiamas1;
	
	
	public String getNepasiekiamas1() {
		return nepasiekiamas1;
	}

	public void setNepasiekiamas1(String nepasiekiamas1) {
		this.nepasiekiamas1 = nepasiekiamas1;
	}

	public void spausdink(String vardas, String pavarde,
			String kalba, String savaiciuSkaicius) {
		System.out.println("A�, "+vardas +" "+pavarde+
				", tikrai i�moksiu programuoti "+kalba+" kalba per "
				+ savaiciuSkaicius+" savaites");
	}

	public void spausdink(String vardas, String pavarde,
			String kalba) {
		System.out.println("A�, "+vardas +" "+pavarde+
				", tikrai i�moksiu programuoti "+kalba+" kalba");
	}
	public static void statinis() {
		System.out.println("statinis");
	}
	
	private void nepasiekiamas() {
		System.out.println("nera info");
		
	}
	
	
}
