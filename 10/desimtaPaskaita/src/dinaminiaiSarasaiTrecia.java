import java.util.ArrayList;

public class dinaminiaiSarasaiTrecia {

	public static void main(String[]args) {
		
		ArrayList<Koordinate> sarasas = new ArrayList<Koordinate>();
		
		
		sarasas.add(new Koordinate(2,5));
		sarasas.add(new Koordinate(1,5));
		sarasas.add(new Koordinate(5,9));
		sarasas.add(new Koordinate(4,0));
		sarasas.add(new Koordinate(0,0));
		sarasas.add(new Koordinate(9,1));
		System.out.println(sarasas);
		for (int i = 0; i < sarasas.size(); i++) {
//			System.out.println(sarasas.get(i));
			if(sarasas.get(i).getX()==0&&sarasas.get(i).getY()==0) {
				System.out.println(i);
			}
//			sarasas.set(i, Koordinate(1,1));
		}
			
		sarasas.set(4, (new Koordinate(1, 1)));
		System.out.println(sarasas);

		
	}


	
	
}
