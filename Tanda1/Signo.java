import java.util.Scanner;

public class Signo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int n;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un n�mero");
		n = sc.nextInt();

		while(n!=0) {
			if (n <0) {
				System.out.println("El n�mero es negativo");

			}else {
				System.out.println("EL n�mero es positivo");
			}
			System.out.println("Introduce un n�mero");
			n = sc.nextInt();

			
		}

	}

}
