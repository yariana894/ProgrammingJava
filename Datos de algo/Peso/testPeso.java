import java.util.Scanner;

public class testPeso {

	public static void main(String[] args) {
		
		
		
		double numero=0;
		String medida="";
		String respuesta="";
		Scanner esc = new Scanner(System.in);
		System.out.println("Introduce cantidad en KG: ");
		numero=esc.nextDouble();
		System.out.println("Introduce unidad: ");
		medida=esc.nextLine();
		System.out.println("convertir a: ");
		respuesta=esc.nextLine();
		
		peso prueba= new peso(1, "kilogramos");
		System.out.println("Un kilo en otras unidades");
		System.out.println("kg: "+prueba.damePeso("Kilogramos"));
		System.out.println("gr: "+prueba.damePeso("gramos"));
		System.out.println("lin: "+prueba.damePeso("lingotes"));
		System.out.println("li: "+prueba.damePeso("libras"));
		System.out.println("uq: "+prueba.damePeso("quintales"));
		System.out.println("on: "+prueba.damePeso("onzas"));
		System.out.println("pq: "+prueba.damePeso("peniques"));
		System.out.println("pi: "+prueba.damePeso("piedras"));
		System.out.println("-----------------------------");
		System.out.println("Las otras unidades en kg");
		
		peso kg=new peso (1,"kilogramos");
		kg.mos();
		peso gr=new peso(1,"gramos");
		gr.mos();
		peso lin=new peso(1,"lingotes");
		lin.mos();
		peso li=new peso (1,"libras");
		li.mos();
		peso qu=new peso (1,"quintales");
		qu.mos();
		peso on=new peso (1,"onzas");
		on.mos();
		peso pq=new peso (1,"peniques");
		pq.mos();
		peso pi=new peso (1,"piedras");
		pi.mos();
	}

}
