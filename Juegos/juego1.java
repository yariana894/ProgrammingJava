package programacion;

import java.util.Scanner;

public class juego1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int secreto=6;
		int intento;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Por favor introduce un n�mero entero: ");
		
		intento=sc.nextInt();
		
		if(intento > secreto) {
			System.out.println("El n�mero introducido es MAYOR QUE el secreto");	
		}
		else {
		System.out.println("El n�mero introducido es MENOR O IGUAL QUE el secreto");
		}
		
	}

}
