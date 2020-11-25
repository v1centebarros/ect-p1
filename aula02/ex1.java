import java.util.Scanner;

public class ex1 {
    public static void main(String[] args)
  {
        Scanner sc = new Scanner(System.in);
		
		double resultado = 0;
        
        String[] componentes = {"TPG1", "TPG2", "EI"};
        
        int componentes_peso[] = {20, 30, 50};
        
        double notas[] = new double[3];
               
        
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
		
		
		System.out.printf ("\n\n Nota Final: %2.2f \n",resultado);
		
		if (resultado >= 9.5) {
			System.out.print("Aluno Aprovado");
		} else {
			System.out.print("Aluno Reprovado");
		}
  }
}
