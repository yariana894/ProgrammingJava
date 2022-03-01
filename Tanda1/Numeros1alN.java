import java.util.Scanner;

public class Numeros1alN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int n;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce un número");
		
		n=sc.nextInt();
		
		for(int i=1;i<=n;i++) {
			System.out.println(i);
		}

	}

}
