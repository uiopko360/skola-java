import java.util.Scanner;

public class Cv {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Ako sa volas?");
		String meno = sc.nextLine();
		System.out.println("Kedy si sa narodil?");
		int rokN = sc.nextInt();
		System.out.println("Isiel si do skoly ako sest rocny alebo sedem rocny?");
		int rokSkola = sc.nextInt();
		System.out.println("Volas sa " + meno);
		System.out.println("Narodil si sa v " + rokN);
		int skola = rokN + rokSkola;
		System.out.println("Do skoly si zacal/a chodit v " + skola);
		int stredna = skola + 9;
		System.out.println("Na strednu skolu si zacal/a chodit v " + stredna);
		int maturita = stredna + 4;
		System.out.println("Maturovat budes v " + maturita);
		int vyska = maturita + 3;
		System.out.println("Vysoku skolu skoncis v " + vyska);
	}

}
