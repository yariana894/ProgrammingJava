package Resueltos;

public class resueltos2 {

	public static void main(String[] args) {
		
		int i,j,k;
		for (i=1;i<=7;i++){
			
			for (k=1;  k<=7-i  ;k++) {
			System.out.print(" ");
			}
			for (j=1;    j<=2*(i-1)+1    ;j++){
			System.out.print("*");
			
			}
			System.out.println();
		}//fin for con i
		
	}

}
