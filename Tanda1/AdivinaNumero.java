import java.util.Scanner;

public class AdivinaNumero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int loteria=77;
		int n=0;
		
		
		while(n!=loteria) {

			Scanner sc = new Scanner(System.in);
			System.out.println("Introduce un n�mero");
			
			n=sc.nextInt();
			
			
			if(n>loteria) {
				
				System.out.println("Introduce un n�mero menor al introducido");
				
				
			}else if(n<loteria){
				System.out.println("Introduce un n�mero mayor al introducido");
				
			}
		}
		System.out.println("Es el n�mero!!");
	}
}
