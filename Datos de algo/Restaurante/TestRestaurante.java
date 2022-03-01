import java.util.Scanner;

public class TestRestaurante {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		double p = 0d, c = 0d;

		do {
			System.out.println("Dame patatas: ");
			p = sc.nextDouble();
			System.out.println("Dame chocos: ");
			c = sc.nextDouble();
			System.out.println("Clientes: " + Restaurante.Clientes(p, c));

		} while (true);

	}
}