import java.util.Scanner;

public class Predstavenie {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Ako sa volas?");
		String meno = sc.nextLine();
		System.out.println("Kedy si sa narodil?");
		int rokNar = sc.nextInt();
		int vek = 2022 - rokNar;
		System.out.println("Volam sa " + meno);
		System.out.println("Mam " + vek + " rokov");
	}

}
