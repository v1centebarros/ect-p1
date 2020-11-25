import java.util.Scanner;

public class ex2 {
	
	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n;
		
		do{
			System.out.print("Insira um valor:");
			
			n = sc.nextInt();
			
			if(n<= 0 || n>=100){
				System.out.println ("Ups! Valor Inválido");				
			} else {
				System.out.println("------------------");
				System.out.printf ("| Tabuada dos %02d |\n",n);
				System.out.println("------------------");
		
				for (int i=0; i<=10;i++) {
					System.out.printf ("|  %02d x %02d | %03d |\n",n,i,n*i);	
				}
		
				System.out.println("------------------");
			}
			
		} while (n <= 0 || n>=100);
		
		
	}
}

