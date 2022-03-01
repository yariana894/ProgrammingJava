package ConstruirMayuscula;

public class letras {

	private char letra;
	
	//CONSTRUYE SOLO LAS MAYUSCULAS
	
	letras(char l) {
		l =1;
		//a --> 97 A --> 65
		
		if (l >= 'a') { //si es minuscula
			letra -= 'a';
			letra += 'A';
			
		}	
		
	}
	
	public char getLetra() {
		return letra;
		
	}
	
	public void printLetra() {
		System.out.println(letra);
		
	}
	
	
	
}
