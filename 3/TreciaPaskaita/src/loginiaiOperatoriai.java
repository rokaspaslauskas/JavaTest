
public class loginiaiOperatoriai {
	
	public static void main(String[] args) {
		
		int menesis = 2;
		String menesioEilute= "tuscias menuo";
		
		switch (menesis) {
		case 1: menesioEilute= "Sausis";
			
			break;
		case 2: menesioEilute= "Vasaris";
		
		break;
		case 3: menesioEilute= "Kovas";
		
		break;
		default:
			break;
		}
		System.out.println(menesioEilute);
	}

}