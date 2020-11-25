import java.util.*;
import java.io.*;

public class ex2 {
	public static Scanner lerInput = new Scanner (System.in);
	public static void main (String[] args) throws IOException {
		
		System.out.print ("Insira o nome de um ficheiro: ");
		String fileName = lerInput.nextLine ();
		File fich;
		
		do {
			fich =  new File (fileName);
			if (!fich.isFile() || !fich.canRead()){
				System.out.print ("ERRO! Nome do ficheiro inválido insira outro: ");
				fileName = lerInput.nextLine ();
			} 
		} while (!fich.isFile() || !fich.canRead());
		
		Scanner fin = new Scanner (fich);
		
		int arr[] = new int [100];
		int i = 0;
		while(fin.hasNext() && i < 100) {
			int valor = fin.nextInt();
			if (valor >= 0) {
				arr[i] = valor;
				i++;
			}
		}
		
		int numeros [] = new int [i];
		System.arraycopy(arr, 0, numeros, 0, numeros.length);
		
		for (int j : numeros) {
			System.out.println(j);
		}

		fin.close();
	}
}


