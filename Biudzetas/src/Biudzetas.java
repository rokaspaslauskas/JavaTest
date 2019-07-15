import java.util.Scanner;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class Biudzetas {

	ArrayList<Irasas> irasas = new ArrayList<Irasas>();
//		PERDARYTI NAUDOJANT IRASA VIETOJ ISLAIDOS IR PAJAMOS <----------------
	Scanner sc = new Scanner(System.in);

	void firstMenu() {
		System.out.println("[1] Sukurti pajamø áraðà.\n[2] Sukurti iðlaidø áraðà.\n[3] Gauti pajamø áraðà."
				+ "\n[4] Gauti iðlaidø áraðà.\n[5] Balansas.\n[6] Visos pajamos.\n[7] Visos iðlaidos."
				+ "\n[8] Trinti áraðà pagal ID#.\n[8] Redaguoti áraðà pagal ID#.\n[x] Iðjungti programà.");
	}
//98749849

	void menu() {
		System.out.println(
				"Kita uþduotis:\n[1] Sukurti pajamø áraðà.\n[2] Sukurti iðlaidø áraðà.\n[3] Gauti pajamø áraðà."
						+ "\n[4]Gauti iðlaidø áraðà.\n[5] Balansas.\n[6] Visos pajamos.\n[7] Visos iðlaidos."
						+ "\n[8] Trinti áraðà pagal ID#.\n[9] Redaguoti áraðà pagal ID#.\n[x] Iðjungti programà.");
	}

	void irasas(String task) {
		if (task.equals("1")) {
			float suma;
			String papildomaInfo;
			boolean pozymisArIBanka;
			suma = sc.nextFloat();
			pozymisArIBanka = sc.nextBoolean();
			papildomaInfo = sc.next();
			LocalDateTime dataIrLaikas = LocalDateTime.now();
			Irasas pajamos = new PajamuIrasas(suma, pozymisArIBanka, papildomaInfo, dataIrLaikas);
			irasas.add(pajamos);

		}
		if (task.equals("2")) {
			float suma;
			String papildomaInfo;
			boolean pozymisArIBanka;
			suma = sc.nextFloat();
			pozymisArIBanka = sc.nextBoolean();
			papildomaInfo = sc.next();
			LocalDateTime dataIrLaikas = LocalDateTime.now();
			Irasas islaidos = new IslaiduIrasas(suma, pozymisArIBanka, papildomaInfo, dataIrLaikas);
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
			System.out.println("Ar norite keisti sumà? [taip] arba [ne]");
			String arNori = sc.next();
			if ((irasas.get(i).getId() == a) & arNori.equals("taip")) {
				System.out.println("Iveskite nauja sumà:");
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
			System.out.println("Ar norite keisti apmokëjimo bûdà? [taip] arba [ne]");
			String arNori3 = sc.next();
			if ((irasas.get(i).getId() == a) & arNori3.equals("taip")) {
				boolean pozymisArIBanka = sc.nextBoolean();
				irasas.get(i).setPozymisArIBanka(pozymisArIBanka);
			}
			System.out.println("Ar norite keisti papildomà informacijà? [taip] arba [ne]");
			String arNori4 = sc.next();
			if ((irasas.get(i).getId() == a) & arNori4.equals("taip")) {
				String papildomaInfo = sc.next();
				irasas.get(i).setPapildomaInfo(papildomaInfo);
			}

		}

	}

	void irasytiIFaila() {
		FileWriter fw;
		try {
			fw = new FileWriter("src/test.csv");

			BufferedWriter bw = new BufferedWriter(fw);
			PrintWriter out = new PrintWriter(bw);
			for (int i = 0; i < irasas.size(); i++) {
				if (irasas.get(i) instanceof PajamuIrasas) {
					out.println(((PajamuIrasas) irasas.get(i)).getKategorija() + "," + irasas.get(i).getDataIrLaikas()
							+ "," + irasas.get(i).getId() + "," + irasas.get(i).getSuma() + ","
							+ irasas.get(i).getPapildomaInfo()+","+irasas.get(i).getPozymisArIBanka());
				}
				if (irasas.get(i) instanceof IslaiduIrasas) {
					out.println(((IslaiduIrasas) irasas.get(i)).getKategorija() + "," + irasas.get(i).getDataIrLaikas()
							+ "," + irasas.get(i).getId() + "," + irasas.get(i).getSuma() + ","
							+ irasas.get(i).getPapildomaInfo()+","+irasas.get(i).getPozymisArIBanka());
				}
			}

			out.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	void skaitytiFaila() throws IOException {
		try {
			FileReader fr = new FileReader("src/test.csv");
			BufferedReader reader = new BufferedReader(fr);
			String line = null;
			while ((line = reader.readLine()) != null) {
				String[] gauta = line.split(",");
				if (gauta[0].equals("Pajamos")) {
					String kategorija = gauta[0];
					LocalDateTime dataIrLaikas = LocalDateTime.parse(gauta[1]);
					int id = Integer.parseInt(gauta [2]);
					float suma = Float.parseFloat(gauta[3]);
					String papildomaInfo = gauta[4];
					boolean pozymisArIBanka = Boolean.parseBoolean(gauta[5]);
					Irasas pajamu = new PajamuIrasas(suma, pozymisArIBanka, papildomaInfo, dataIrLaikas);
					irasas.add(pajamu);
				}
				if (gauta[0].equals("Islaidos")) {
					String kategorija = gauta[0];
					LocalDateTime dataIrLaikas = LocalDateTime.parse(gauta[1]);
					int id = Integer.parseInt(gauta [2]);
					float suma = Float.parseFloat(gauta[3]);
					String papildomaInfo = gauta[4];
					boolean pozymisArIBanka = Boolean.parseBoolean(gauta[5]);
					Irasas islaidos = new PajamuIrasas(suma, pozymisArIBanka, papildomaInfo, dataIrLaikas);
					irasas.add(islaidos);
				}

			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
