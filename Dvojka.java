import java.util.Scanner;

public class Dvojka {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Napis prve cislo:");
		int cislo1 = sc.nextInt();
		System.out.println("Napis druhe cislo:");
		int cislo2 = sc.nextInt();
		int sucet = cislo1 + cislo2;
		System.out.println("Sucet je " + sucet);
		int rozdiel = cislo1 - cislo2;
		System.out.println("Rozdiel je " + rozdiel);
		int sucin = cislo1 * cislo2;
		System.out.println("Sucin je " + sucin);
		double podiel = (double) cislo1 / cislo2; // (double) pretypovanie
		System.out.println("Podiel je " + podiel);
		int cpodiel = cislo1 / cislo2;
		System.out.println("Celociselny podiel je " + cpodiel);
		int zvysok = cislo1 % cislo2;
		System.out.println("Zvysok je: "+ zvysok);
	}

}
