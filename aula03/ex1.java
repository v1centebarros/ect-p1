import java.util.Scanner;

public class ex1 {
	
	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n;
		
		do{
			System.out.print("Insira um valor:");
			
			n = sc.nextInt();
			
			if(n<= 0 ){
				System.out.println ("Ups! Valor Inválido");				
			}
			
		} while (n <= 0);
		
		for (int i = 0;i< n ;i++){
			System.out.println("P1 é fixe!");
		}
		
	}
}

