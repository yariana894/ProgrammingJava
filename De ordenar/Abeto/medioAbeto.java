package Abeto;

import java.util.Scanner;

public class medioAbeto {


public static void main(String[] args) {

	// TODO Auto-generated method stub
	int i, j, k;
	Scanner sc = new Scanner (System.in);
	System.out.println("Introduce número de filas: ");
	int fil = sc.nextInt();
	for (i = 0; i <= fil; i++) {

		for (j = 1; j <= 1 * (i - 1) + 2; j++) {
			System.out.print("*");
		}
		System.out.println();
	}//fin for con i
}

}
