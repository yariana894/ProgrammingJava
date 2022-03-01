package aritmeticos;

public class logicos {

	public static void main(String[] args) {
		
		int m=2, n=5;
		boolean res;
		res =      (m > n) && (m >= n)  ;//res=false
		System.out.println(res);
		
		res =    !(   (m < n || m != n)   )  ;//res=false
		System.out.println(res);
	}

}
