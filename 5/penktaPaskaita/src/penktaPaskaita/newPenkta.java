package penktaPaskaita;

import java.util.Scanner;

public class newPenkta {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Iveskite skaiciu: ");
		int ivestasSkaicius = sc.nextInt();
		int maziausiasSkaicius = ivestasSkaicius;
		int didziausiasSkaicius = ivestasSkaicius;
		for (int i = 1; i < 10; i++) {
			System.out.print("Iveskite skaiciu: ");
			ivestasSkaicius = sc.nextInt();
			if (ivestasSkaicius < maziausiasSkaicius) {
				maziausiasSkaicius = ivestasSkaicius;
			}
			if (ivestasSkaicius > didziausiasSkaicius) {
				didziausiasSkaicius = ivestasSkaicius;
			}
			if (ivestasSkaicius % 2!=0) {
				System.out.println("Nelyginis skai�ius:"+ivestasSkaicius);
			}
		}
		System.out.println("Maziausias: " + maziausiasSkaicius);
		System.out.println("Didziausias: " + didziausiasSkaicius);
		sc.close();

	}

}