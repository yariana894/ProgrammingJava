package propuestos;

import java.util.Scanner;

public class testFInanzas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner esc = new Scanner(System.in);
		double aux =0d;
		double cam=0d;
		//creo objeto con constructor por defecto
		//creo los dos metodos pidiendo cantidad al usuario
		finanzas hsbc= new finanzas();
		System.out.println("dolares: ");
		aux=esc.nextDouble();
		System.out.println("son "+ hsbc.dolaresAEuros(aux)+" euros");
		
		System.out.println("euros: ");
		aux=esc.nextDouble();
		System.out.println("son "+ hsbc.eurosADolares(aux)+" dolares");
		
		//pido ratio
		//creo objeto con constructor usando ese ratio
		//uso los dos metodos pidiendo cantida al usuario
		System.out.println("introduce cambio del dia (€ / $): ");
		cam=esc.nextDouble();
		finanzas caja= new finanzas(cam);
		System.out.println("dolares: ");
		aux=esc.nextDouble();
		System.out.println("son "+ caja.dolaresAEuros(aux)+" euros");
		
		System.out.println("euros: ");
		aux=esc.nextDouble();
		System.out.println("son "+ caja.eurosADolares(aux)+" dolares");
		
	}
}