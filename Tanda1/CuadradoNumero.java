import java.util.Scanner;

public class CuadradoNumero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num;
		
		do {
			System.out.println("Introduce un n�mero");
			num=sc.nextInt();
			System.out.println("El cuadrado del n�mero " +Math.pow(num, 2));
		}while(num>0);
		
		System.out.println("Final del ciclo");

	}

}
