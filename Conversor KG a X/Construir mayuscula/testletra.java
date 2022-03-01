package ConstruirMayuscula;

import java.util.Scanner;

public class testletra {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner escan = new Scanner (System.in);
		char lt;
		System.out.println("Introduce una letra: ");
		lt=escan.next().charAt(0);
		
		letras pillo=new letras(lt);
		
		System.out.println("Se construyo la letra: " +pillo.getLetra());
	}

}
