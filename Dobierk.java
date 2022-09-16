import java.util.Scanner;

public class Dobierk {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Zadaj cenu postovneho:");
		double cenaP = sc.nextDouble();
		System.out.println("Zadaj cenu za kus:");
		double cenaK = sc.nextDouble();
		System.out.println("Zadaj pocet kusov dobierok:");
		int pocetD = sc.nextInt();
		double dobierka = Math.round((cenaP + cenaK) * pocetD * 100) / 100.0;
		System.out.println("Cena dobierky je: " + dobierka + "€");
	}

}
