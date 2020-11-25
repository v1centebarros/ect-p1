import java.util.Scanner;

public class ex16
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
	
	System.out.print("Despesas do primeiro dia: ");
	double despesa_dia = sc.nextDouble(); //Despesa do dia anterior
	double total_despesas = despesa_dia;
	
	for (int i = 0; i<3;i++){
		despesa_dia = despesa_dia * 1.2;
		total_despesas += despesa_dia;
	}
	
	double media_gastos = total_despesas / 4;
	
	System.out.printf("Media diaria de gastos: %.2f", media_gastos);
  }
}
