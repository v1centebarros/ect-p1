import java.util.Scanner;

public class ex5 {
	public static Scanner sc = new Scanner(System.in);
	
	public static void main (String[] args) {
		System.out.print ("Quantos valores vão ser lidos? ");
		int N = sc.nextInt ();
		int sequencia[] = new int[N];
		
		sequencia = lerValores(N); 
		
		double media = getMedia (sequencia, N);
		
		System.out.printf ("Media: %.2f", media);
		printValoresSuperiores(sequencia, media);
		
		System.out.printf ("Desvio padrao: %.2f", calculaDesvio(sequencia, media, N));
	}
	
	public static int[] lerValores(int N){
		int arr [] = new int [N];
		
		for (int i = 0; i< N; i++) {
			System.out.printf ("Insere o %dº numero: ",i+1);
			arr [i] = sc.nextInt();
		}
		return arr;	
	}
	
	public static double getMedia (int arr[], int N) {
		
		double total = 0;

		for (int val : arr)	total+= val;

		double media = total / N;
		
		return media; 
	}
	
	public static void printValoresSuperiores (int arr[], double media) {
		
		System.out.print ("\nValores superiores a media: ");
		
		for (int val : arr ){
			if (val > media) {
				System.out.printf ("%d, ",val);
			}
		}
		
		System.out.print("\n");
	}

	public static double calculaDesvio (int arr[], double media, double N) {
		double somatorio = 0;
		
		for (int i = 0; i< arr.length; i++) {
			somatorio += Math.pow((arr[i] - media),2);
		}
		
		double desvio = Math.sqrt(1 / N * somatorio);
		
		return desvio;
	} 
}

