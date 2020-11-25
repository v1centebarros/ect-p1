/* Teste prático, exemplo 2019/20
* NMec: 97787
* Nome:	Vicente Barros
*/
import java.util.Scanner;

public class ex7 {
	static Scanner ler = new Scanner(System.in);
	public static void main(String[] args) {
		int[] notas = {4, 6, 7, 5, 4, 6, 6, 8, 11};
		int[] histo;
		double mediaf,mediat;


		System.out.printf("Introduza notas dos alunos(nota 0-10; 11 faltou): %n");
		notas = LerNotas(10);


		// lista notas
		listar(notas);


		// calcula histograma
		histo = Histograma(notas);

		
		// imprime histograma
		ImprimeHistograma(histo);
		// calcular média freq e total
		mediaf= Medias(notas,'f');
		mediat= Medias(notas,'t');
		// 6) Imprime medias
		System.out.printf("\nMedia total = %.1f, Media alunos freq = %.1f\n\n",mediat,mediaf);
	
	}


	// 1) Listar notas no ecrã
	public static void listar(int[] notas) {
		int i = 0;
		System.out.print ("Lista notas: ");
		for (int nota : notas) {
			System.out.print (nota + ", ");
		}	
	}


	// 2) função para ler notas entre 0 e 11. 11 significa que o aluno faltou. Devolve array com as notas
	public static int[] LerNotas(int numNotas) {
		int notasLidas[] = new int[numNotas];
		for(int i = 0; i<numNotas; i++) {
			System.out.printf ("Nota aluno  %2d: ",i+1);
			notasLidas[i] = ler.nextInt(); 
		}
		return notasLidas;
	}


	// 3) função histograma
	public static int[] Histograma(int[] notas) {
		int numNotas[] = new int [12]; 
		for ( int nota : notas) {
			for (int i = 0; i<12; i++) {
				if (nota == i) numNotas [i]++;
			}
		}
		return numNotas;
	}


	// 4) Função ImprimeHistograma.
	// Cada linha tem a nota, e um nº de * = à sua frequência
	public static void ImprimeHistograma (int[] hist) {
		for (int i = 0; i<12;i++) {
			System.out.printf ("\nNota %2d:",i);
			for (int j = 0; j< hist[i];j++){
				System.out.print ("*");
			}
		}
	}


	// 5) função medias de freq ou total conforme tipo = 'f' ou 't'
	public static double Medias(int[] lista,char tipo) {
		double media = 0;
		double total = 0;
		switch (tipo) {
			case 'f':
				double nNotas = 0;
				for (int nota : lista) {
					if (nota != 11) {
						total+=nota;
						nNotas++;
					}
				}
				media = total / nNotas;
				break;
			case 't':
				for (int nota : lista) {
					if (nota != 11) {
						total += nota;
					}
					
				}
				media = total / 10;
				break;
		}

		return media;
	}
}
