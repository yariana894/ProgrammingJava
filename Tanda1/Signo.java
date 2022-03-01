import java.util.Scanner;

public class Signo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int n;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un número");
		n = sc.nextInt();

		while(n!=0) {
			if (n <0) {
				System.out.println("El número es negativo");

			}else {
				System.out.println("EL número es positivo");
			}
			System.out.println("Introduce un número");
			n = sc.nextInt();

			
		}

	}

}
