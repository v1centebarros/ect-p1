import java.util.Scanner;


public class ex3 {
	
	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println ("Tipo de Bilhete no parque de diversões");
		
	
		System.out.print ("Insira a sua idade: ");
		int idade = sc.nextInt();
		
		if (idade > 0 ){
			if(idade < 6 ){
				System.out.println("Isento de pagamento");
			} else if (idade >= 6 && idade <= 12) {
				System.out.println ("Bilhete de criança");	
			} else if (idade >= 13 && idade < 65 ) {
				System.out.println("Bilhete Normal");
			} else if(idade >= 65 ){
				System.out.println("Bilhete de 3º idade");
		}

		} else {
			System.out.println ("IDADE INVALIDA!");
		}
	}
}

