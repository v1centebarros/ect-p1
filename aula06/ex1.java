import java.util.Scanner;

public class ex1 {
	
	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);
 
		System.out.print ("Numero de valores que irao ser inseridos: ");
		int n = sc.nextInt();
		
		int arr[] = new int[n];
		for (int i=0;i<n;i++) {
			System.out.printf ("Insira o %dº numero: ",i+1);
			arr[i] = sc.nextInt();
		}
		System.out.print("\n\n\n\n");
		
		for (int j = n-1; j>=0;j--){
			System.out.printf("%dº - %d\n",j+1,arr[j]);
		}
	}
}

