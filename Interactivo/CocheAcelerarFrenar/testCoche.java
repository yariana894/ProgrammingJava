package CocheAcelerarFrenar;

public class testCoche {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		coche zito = new coche();
		System.out.println(zito.toString());
		
		zito.acelera(20);
		System.out.println(zito.toString());
		
		zito.acelera(60);
		System.out.println(zito.toString());
		
		zito.clava();
		
		zito.full();
		
		zito.frena(30);
		System.out.println(zito.toString());
		
		zito.frena(100);
		System.out.println(zito.toString());
		
	

	}
}
