import java.util.Scanner;
import java.util.ArrayList;

public class Biudzetas {

	ArrayList<Irasas> irasas = new ArrayList<Irasas>();
//		PERDARYTI NAUDOJANT IRASA VIETOJ ISLAIDOS IR PAJAMOS <----------------
	Scanner sc = new Scanner(System.in);

	void firstMenu() {
		System.out.println("[1] Sukurti pajam� �ra��.\n[2] Sukurti i�laid� �ra��.\n[3] Gauti pajam� �ra��."
				+ "\n[4] Gauti i�laid� �ra��.\n[5] Balansas.\n[6] Visos pajamos.\n[7] Visos i�laidos.\n[x] I�jungti program�.\n[8] Trrinti �ra�� pagal ID#.`");
	}


	void menu() {
		System.out.println(
				"Kita u�duotis:\n[1] Sukurti pajam� �ra��.\n[2] Sukurti i�laid� �ra��.\n[3] Gauti pajam� �ra��."
						+ "\n[4]Gauti i�laid� �ra��.\n[5] Balansas.\n[6] Visos pajamos.\n[7] Visos i�laidos.\n[x] I�jungti program�.");
	}

	void irasas(String task) {
		if (task.equals("1")) {
			float suma;
			String papildomaInfo;
			boolean pozymisArIBanka;
			String kategorija;
			suma = sc.nextFloat();
			papildomaInfo = sc.next();
			pozymisArIBanka = sc.nextBoolean();
			kategorija = sc.next();
			Irasas pajamos = new PajamuIrasas(suma, kategorija, pozymisArIBanka, papildomaInfo);
			irasas.add(pajamos);

		}
		if (task.equals("2")) {
			float suma;
			String papildomaInfo;
			boolean pozymisArIBanka;
			String kategorija;
			suma = sc.nextFloat();
			papildomaInfo = sc.next();
			pozymisArIBanka = sc.nextBoolean();
			kategorija = sc.next();
			Irasas islaidos = new IslaiduIrasas(suma, kategorija, pozymisArIBanka, papildomaInfo);
			irasas.add(islaidos);

		}

	}

	void gautiIrasa(String task) {

		for (Irasas obj : irasas) {
			if (task.equals("3") & (obj instanceof PajamuIrasas)) {
				System.out.println(obj);
			}
			if (task.equals("4") & (obj instanceof IslaiduIrasas)) {
				System.out.println(obj);
			}
		}
	}

	void gautiSumas(String task) {
		for (Irasas obj : irasas) {
			if (task.equals("6") & (obj instanceof PajamuIrasas)) {

				System.out.println(obj.getSuma());
			}
			if (task.equals("7") & (obj instanceof IslaiduIrasas)) {

				System.out.println(obj.getSuma());
			}
		}
	}

	void gautiBalansa() {
		float sumaIslaidu = 0;
		float sumaPajamu = 0;
		for (Irasas obj : irasas) {
			if (obj instanceof PajamuIrasas) {
				sumaPajamu += obj.getSuma();
			}
		}
		for (Irasas obj : irasas) {
			if (obj instanceof IslaiduIrasas) {
				sumaIslaidu += obj.getSuma();
			}
		}
		System.out.println(sumaPajamu - sumaIslaidu + " Eur");
	}

	void trintiIrasa(int a) {
		a--;
		irasas.remove(a);
	}
}

