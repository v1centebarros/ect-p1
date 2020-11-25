import java.util.Scanner;

public class ex2 {
	
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println ("Numero maior");
		
		System.out.print ("Numero A: ");
		double a = sc.nextDouble();
		
		System.out.print ("Numero B: ");
		double b = sc.nextDouble();
		
		if (a > b) { 
			System.out.printf("%.1f e o maior numero", a);
		} else if (a < b) {
			System.out.printf("%.1f e o maior numero", b);
	
		} else {
			System.out.print("Tem o mesmo valor");

		}
	}
}

