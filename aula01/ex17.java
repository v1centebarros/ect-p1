import java.util.Scanner;

public class ex17 {
	
	public static void main (String[] args) {
		
	    Scanner sc = new Scanner(System.in);

		
		System.out.println ("Calculo do total liquido");
		
		System.out.println ("Insira os valores dos produtos (para fianlizar escreve '-1')");
		
		double total_preco = 0, produto_preco;
		
		int i = 1;
		
		do{
			
			System.out.printf ("Inserir produto %d: ",i);
			
			produto_preco = sc.nextDouble();
			total_preco += produto_preco;
			
			i++;
		} while (produto_preco != -1);
		
		total_preco++;
		
		System.out.print ("Desconto oferecido: ");
		double desconto = sc.nextDouble();
		
		System.out.print ("IVA: ");
		double iva = sc.nextDouble();
		
		double produto_liquido = total_preco + (total_preco * iva / 100) - (total_preco * desconto / 100);
		
		System.out.printf ("Total liquido: %.2f", produto_liquido);

	}
}

