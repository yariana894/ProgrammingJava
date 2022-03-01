package Res;

public class dado {

	public static void main(String[] args) {
		
		int c1=0;
		int c2=0;
		int c3=0;
		int c4=0;
		int c5=0;
		int c6=0;
		
		for(int i=1;i<=60;i++) {
		int res = (int) (Math.random()*6 + 1);
		
		
		//System.out.println(res); //Borrar "//"
		
		if(res==1)
			c1++;
		else if(res==2)
			c2++;
		else if(res==3)
			c3++;
		else if(res==4)
			c4++;
		else if(res==5)
			c5++;
		else
			c6++;
		
		}// fin for
		
		System.out.println("Unos: "+c1);
		System.out.println("Dos: "+c2);
		System.out.println("Tres: "+c3);
		System.out.println("Cuatros: "+c4);
		System.out.println("Cincos: "+c5);
		System.out.println("Seises: "+c6);
		
	}

}
