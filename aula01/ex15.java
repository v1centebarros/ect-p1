import java.util.Scanner;

public class ex15 {
    public static void main(String[] args)
  {
        Scanner sc = new Scanner(System.in);
		
		double resultado = 0;
        
        String[] componentes = {"TP1", "TP2", "API2", "EP"};
        
        int componentes_peso[] = {15, 15, 30, 40};
        
        double notas[] = new double[4];
               
        
        for (int i = 0; i < componentes.length; i++) {
            do{
                System.out.printf ("Nota de %s:", componentes[i]); 
                notas[i] = sc.nextDouble();
                
                if (notas[i] < 0 || notas[i] > 20) {
					System.out.print ("ERRO! Nota Invalida \n");
				}
            } while (notas[i] < 0 || notas[i] > 20);
        }
        
        for (int i = 0; i< componentes.length; i++){
			resultado += notas[i] * componentes_peso[i] / 100;
		}
		
		System.out.printf ("\n\n Nota Final: %2.2f",resultado);
  }
}
