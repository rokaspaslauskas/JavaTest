import java.util.Scanner;
import java.util.ArrayList;

public class Biudzetas {

	ArrayList<Irasas> irasas = new ArrayList<Irasas>();
//		PERDARYTI NAUDOJANT IRASA VIETOJ ISLAIDOS IR PAJAMOS <----------------
	Scanner sc = new Scanner(System.in);

	void firstMenu() {
		System.out.println("[1] Sukurti pajam� �ra��.\n[2] Sukurti i�laid� �ra��.\n[3] Gauti pajam� �ra��."
				+ "\n[4] Gauti i�laid� �ra��.\n[5] Balansas.\n[6] Visos pajamos.\n[7] Visos i�laidos."
				+ "\n[8] Trinti �ra�� pagal ID#.\n[8] Redaguoti �ra�� pagal ID#.\n[x] I�jungti program�.");
	}
//98749849

	void menu() {
		System.out.println(
				"Kita u�duotis:\n[1] Sukurti pajam� �ra��.\n[2] Sukurti i�laid� �ra��.\n[3] Gauti pajam� �ra��."
						+ "\n[4]Gauti i�laid� �ra��.\n[5] Balansas.\n[6] Visos pajamos.\n[7] Visos i�laidos."
						+ "\n[8] Trinti �ra�� pagal ID#.\n[9] Redaguoti �ra�� pagal ID#.\n[x] I�jungti program�.");
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
		for (int i = 0; i < irasas.size(); i++) {
			if (irasas.get(i).getId() == a) {
				irasas.remove(i);
			}
		}

	}

	void pakeistiIrasa(int a) {
		for (int i = 0; i < irasas.size(); i++) {
			System.out.println("Ar norite keisti sum�? [taip] arba [ne]");
			String arNori = sc.next();
			if ((irasas.get(i).getId() == a) & arNori.equals("taip")) {
				System.out.println("Iveskite nauja sum�:");
				float suma = sc.nextFloat();
				irasas.get(i).setSuma(suma);
			}

			System.out.println("Ar norite keisti kategorija? [taip] arba [ne]");
			String arNori2 = sc.next();
			if ((irasas.get(i).getId() == a) & arNori2.equals("taip")) {
				if (irasas.get(i) instanceof PajamuIrasas) {
					String kategorija = sc.next();
					((PajamuIrasas) irasas.get(i)).setKategorija(kategorija);
					;
					if (irasas.get(i) instanceof IslaiduIrasas) {
						kategorija = sc.next();
						((IslaiduIrasas) irasas.get(i)).setKategorija(kategorija);
						;
					}
				}
			}
			System.out.println("Ar norite keisti apmok�jimo b�d�? [taip] arba [ne]");
			String arNori3 = sc.next();
			if ((irasas.get(i).getId() == a) & arNori3.equals("taip")) {
				boolean pozymisArIBanka = sc.nextBoolean();
				irasas.get(i).setPozymisArIBanka(pozymisArIBanka);
			}
			System.out.println("Ar norite keisti papildom� informacij�? [taip] arba [ne]");
			String arNori4 = sc.next();
			if ((irasas.get(i).getId() == a) & arNori4.equals("taip")) {
				String papildomaInfo = sc.next();
				irasas.get(i).setPapildomaInfo(papildomaInfo);
			}

		}

	}
}
