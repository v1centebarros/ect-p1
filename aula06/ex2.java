import java.util.Scanner;
import java.util.Random;
import java.util.Iterator;

public class ex2 {
	
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);

		int numGen [] = generateRandomArray(100);	
		
		/* Verificar valores inseridos
			for(int i = 0; i < numGen.length;i++){
				System.out.print(numGen[i]+"\n");
			}
		*/
		
		System.out.print("Insira o numero a verificar(0 - 10): ");
		int num = sc.nextInt();
		
		int count = 0;	
		
		for(int i = 0; i < numGen.length;i++){
			if (numGen[i] == num) {
				count++;
			}
		}
		
		System.out.printf ("O numero %d aparece %d veze(s)",num,count);
	}
	
	
	public static int[] generateRandomArray (int n){
		Random rn = new Random();
		
		int arr[] = new int[n];
		
		for (int i = 0; i< n; i++ ){
			arr[i] = rn.nextInt(10);
		}
		return arr;
	}
}

