import java.util.Scanner;

public class NegativoContar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n;
		int suma = 0;

		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un número");
		n = sc.nextInt();
		

		while (n > 0) {
			
			suma++;
			System.out.println(n);
		}
		
		

	}

}
