package aritmeticos;

public class TablaSiete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i=1; //bucle interno
		int j=1; //bucle externo
		
		
		for(j=1;j<=10;j++) {
			System.out.println("TABLA DEL " + j);
			//NO TOCAR
				for(i=1;i<=10;i=i+1) {
			
					System.out.println(j +" por " +i+ " da: " + j*i);
				
			System.out.println("------------------");
			}
		}
	}

}
