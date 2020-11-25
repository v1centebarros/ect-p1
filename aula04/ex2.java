import java.util.Scanner;

public class ex2 {
	
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		double n = 1, produto = 1;
		
		
		System.out.println ("Introduza uma lista de números (terminada com 0)");
		
		while (n != 0 ) {
			n = sc.nextDouble();
			if (n!= 0) produto = produto * n;
		} 
		System.out.printf ("\n\n Produto %4.3f",produto);
	}
}

