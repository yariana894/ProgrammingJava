package CocheVelConsumo;

public class testconsumo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		consumo diario = new consumo();
		diario.setKms(11.8);
		diario.setLitros(0.88);
		diario.setPgas(1.67);
		diario.setVmed(21.2);
		
		System.out.println("consumo diario");
		System.out.println(diario.tomarTiempo() + " horas");
		System.out.println(diario.consumirMedio() + " 1 cada 100km");
		System.out.println(diario.consumirEuros() + " € cada 100km");
		
		consumo finde = new consumo(256,18.4,84.2,1.67);
		
		System.out.println("consumo fin de semana");
		System.out.println(finde.tomarTiempo() + " horas");
		System.out.println(finde.consumirMedio() + " 1 cada 100km");
		System.out.println(finde.consumirEuros() + " € cada 100km");
		
	}
}
