import java.util.Scanner;

public class Billetes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int cant;

		int quin = 0;
		int dosc = 0;
		int cien = 0;
		int cinc = 0;
		int vent = 0;
		int diez = 0;
		int cinco = 0;
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Cantidad: ");
		cant = sc.nextInt();
		
		while(cant >=5) {
			
			if(cant>=500) {
				cant-=500;
				quin++;
				
			}else if(cant >=100) {
				cant-=100;
				cien++;
				
			}else if(cant >=50) {
				cant-=50;
				cinc++;
				
			}else if(cant >=20) {
				cant-=20;
				vent++;
				
			}else if(cant >=10) {
				cant-=10;
				diez++;
				
			}else if(cant >=5) {
				cant-=5;
				cinco++;
				
			}
			
		}
		
		System.out.println("500 " +quin);
		System.out.println("200 " +dosc);
		System.out.println("100 " +cien);
		System.out.println("50 " +cinc);
		System.out.println("20 " +vent);
		System.out.println("10 " +diez);
		System.out.println("5 " +cinco);
		System.out.println("Monedas " +cant);
		

	}

}
