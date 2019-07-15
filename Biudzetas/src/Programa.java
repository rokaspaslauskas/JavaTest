import java.io.IOException;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) throws IOException {
		Biudzetas biudzetas = new Biudzetas();
		boolean runProgram = true;

		biudzetas.firstMenu();
		Scanner sc = new Scanner(System.in);

//		biudzetas.irasas("1");
//		biudzetas.gautiIrasa();
//ewiojr

		while (runProgram) {
			String task = sc.next();

			if (task.equals("1")) {
				System.out.println("(Pajamu suma, po�ymis ar � banka, papildoma informacija)");
				biudzetas.irasas(task);
				biudzetas.menu();

			} else if (task.equals("2")) {
				System.out.println("(I�laid� suma, po�ymis ar � banka, papildoma informacija)");
				biudzetas.irasas(task);
				biudzetas.menu();

			} else if (task.equals("3")) {
				biudzetas.gautiIrasa(task);
				biudzetas.menu();
			} else if (task.equals("4")) {
				biudzetas.gautiIrasa(task);
				biudzetas.menu();
			} else if (task.equals("x")) {
				runProgram = false;
			} else if (task.equals("5")) {
				System.out.println("Balansas: ");
				biudzetas.gautiBalansa();
				biudzetas.menu();
			} else if (task.equals("6")) {
				System.out.println("Visos pajam� sumos: ");
				biudzetas.gautiSumas(task);
				biudzetas.menu();
			} else if (task.equals("7")) {
				System.out.println("Visos i�laid� sumos: ");
				biudzetas.gautiSumas(task);
				biudzetas.menu();
			} else if (task.equals("8")) {
				System.out.println("�veskite trinamo �ra�o ID#: ");
				int id = sc.nextInt();
				biudzetas.trintiIrasa(id);
				biudzetas.menu();
			} else if (task.equals("9")) {
				System.out.println("�veskite kei�iamo �ra�o ID#: ");
				int id = sc.nextInt();
				biudzetas.pakeistiIrasa(id);

				biudzetas.menu();
			} else if (task.equals("10")) {
				System.out.println("�ra�yti duomenis � fail�. ");
				biudzetas.irasytiIFaila();

				biudzetas.menu();
			} else
				if (task.equals("11")) {
					System.out.println("�ra�yti duomenis � fail�. ");

					biudzetas.skaitytiFaila();

					biudzetas.menu();
				} else {
				System.out.println("Erorr 404 klaidinga u�duoties �vestis!");
				biudzetas.menu();
			}

		}

		sc.close();

	}

}
