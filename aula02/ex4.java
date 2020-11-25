import java.util.Scanner;

public class ex4 {
	
	public static void main (String[] args) {
		
		int num_dias [] = {0,31,0,31,30,31,30,31,31,30,31,30,31};
		int mes_dias = 0;
		
		
		Scanner sc = new Scanner(System.in);
			
		System.out.println ("Conversor de datas");
		
		System.out.print ("Insere o mes: ");
		
		int mes = sc.nextInt();
		
		if (mes < 1 || mes > 12 ){
			System.out.println("MES INVALIDO");
			System.exit(0);
		}
		
		System.out.print ("Insere o ano: ");
		int ano = sc.nextInt();
		
		if (ano <= 0 ) {
			System.out.println("MES INVALIDO");
			System.exit(0);
		}

		if (mes != 2 && mes < 12){

			mes_dias = num_dias[mes];
		
		} else if (mes == 2) {
			if (ano % 4 == 0 && ano % 100 != 0){
				mes_dias = 29;
			} else {
				mes_dias = 28;
			} 
		}
		
		
		System.out.printf("O mês %d do ano %d tem %d dias.",mes,ano, mes_dias);
		

	}
}

