import java.util.Scanner;

public class ex1 {
	
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, i = 0;
		
		do {
			System.out.print ("Insere um número: ");
			n = sc.nextInt();
			i++;
		} while (n >=0 );
		
		System.out.printf ("Foram inseridos %d números",i-1);
	}
}

