import java.util.Scanner;

public class TemperaturaResultado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		temperatura convTemp;
		convTemp =new temperatura();
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Introduce la cantidad que quieras convertir");
		int numero1=sc.nextInt();
		
		convTemp.setCenti(numero1);
		convTemp.setFaren(numero1);
		
		
		System.out.println(numero1+" centi son faren"+convTemp.centiaFaren());
		System.out.println( numero1+" faren son  centi" +convTemp.farenaCenti());
	}

}
