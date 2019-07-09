package paskaita12;

import java.util.ArrayList;

public class Paskaita {

	public static void main(String[] args) {
		
		Frigate frigate = new Frigate();
		Jeep jeep = new Jeep();
		
		
		ArrayList<IsVehicle>isVehicle = new ArrayList<IsVehicle>();
		ArrayList<IsLandVehicle>isLandVehicle= new ArrayList<IsLandVehicle>();
		
		System.out.println(frigate instanceof IsVehicle);
		System.out.println(frigate instanceof IsLandVehicle);
		System.out.println(jeep instanceof IsSeeVessel);
		System.out.println(jeep instanceof IsLandVehicle);
		System.out.println(jeep instanceof IsVehicle);
		
		
		
		((IsVehicle) jeep).drive();
		((IsVehicle) frigate).drive();
		frigate.drive();
		
		
		
		
		
		
		
	}
		
}
