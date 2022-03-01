package Abeto;

import java.util.Scanner;

public class abetoRombo {

	//POR HACER
	
	
	
	public static void main(String[] args) {

		// TODO Auto-generated method stub
		int i, j, k;
		//Scanner sc = new Scanner (System.in);
		//System.out.println("Introduce número de filas: ");
	//	int fil = sc.nextInt();
		for (i = 1; i <= 5; i++) {

			for (k = 1; k <= 5 - i; k++) {
				System.out.print(" ");
			}

			for (j = 1; j <= 2 * (i - 1) + 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}//fin for con i

	}
	
	
}
