import java.io.BufferedReader;
import java.io.InputStreamReader;

public class error {

	public static void main(String[] args) {
	
		String ln="";
		//char c;
		try {
			
			System.out.println("introduce una frase: ");
			InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader buff = new BufferedReader(isr);
			ln = buff.readLine();
			
			
		//c = (char) System.in.read() ;
		}catch(Exception e) {
		e.printStackTrace();
		}
		System.out.println(" esta es la linea introducida: "+ ln);
		
		int a=10, b=0, c;
		try {
			c=a/b;
		} catch (Exception e) {
			System.err.println("Error ha sido: "+e.getMessage());
			return;
		}
		System.out.println("Resultado: "+c) ;
	
		}
	}
