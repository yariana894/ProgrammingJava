import java.util.Scanner;

public class ParImpar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n;

		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un número");
		n = sc.nextInt();

		while (n != 0) {

			if (n % 2 == 0) {
				System.out.println("El número es par");

			} else {
				System.out.println("EL número es impar");
			}
			System.out.println("Introduce un número");
			n = sc.nextInt();

		}

	}

}
