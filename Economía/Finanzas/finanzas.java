package propuestos;
/*Realiza una clase finanzas que convierta d�lares a euros y viceversa.
*Codifica los m�todos dolarestoEuro y eurostoDOlar.
Prueba que dicha clase funciona correctamente haciendo conversiones entre euros y d�lares.
La clase tiene que tener:
Un constructor finanzas() por defecto el cual establecer� el cambio Euro-Dolar en 1.18.
Un constructor finanzas (double), el cual permitir� configurar el cambio euro-dolar*/

public class finanzas {
	// constante
	final static double STANDARD = 1.36;
	//atributos
	double dolars;
	double euros;
	double ratio;//euro dolar pedido a usuario
	
	public double dolaresAEuros(double d) {
		
		return d/ratio;
	}
	
	public double eurosADolares(double e) {
		return e*ratio;
	}
	
	finanzas(){
		ratio = STANDARD;
	}
	
	finanzas(double r){
		ratio = r;
		
	}

}
