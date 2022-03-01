package Ejerciciospropuestos1;

import java.util.Scanner;

public class testMiNumero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MiNumero chulo = new MiNumero();
		chulo.setNumero(5);
		chulo.toString();
		
		Scanner esc = new Scanner(System.in);
		System.out.println("Introduce numero entero");
		int n= esc.nextInt();
		
		MiNumero pedido = new MiNumero(n);
		
		pedido.toString();

	}

}
