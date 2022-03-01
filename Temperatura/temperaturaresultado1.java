import java.util.Scanner;
import javax.swing.JOptionPane;
public class temperaturaresultado1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		temperatura1 convtemp;
		convtemp=new temperatura1();
		double grado=0;
		double gCenti=0;
		double gFahren=0;
		
		int opcion=0;
		String cadena;
		
		do {
			cadena=JOptionPane.showInputDialog("\n [1] Convertir a Fahren - Centi \n [2] Convertir de Centi - Faren");
			opcion=Integer.parseInt(cadena);
			
		}while(opcion<1 || opcion>2);
			cadena=JOptionPane.showInputDialog("Ingrese la temperatura");
			grado=Double.parseDouble(cadena);
		switch(opcion)
			{
				case 1:{
					gFahren=convtemp.centiaFahren(grado);
					JOptionPane.showConfirmDialog(null, "TEMPERATURA " +gFahren+ " Fahrenheit");
				};break;
				
				case 2:{
					gCenti=convtemp.fahrenaCenti(grado);
					JOptionPane.showConfirmDialog(null, "TEMPERATURA " +gCenti+ " Centígrados");
				};break;
				}
		}
}
