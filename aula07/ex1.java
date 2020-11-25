import java.util.*;
import java.io.*;

public class ex1 {
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
		
		while(fin.hasNextLine()) {
			String line = fin.nextLine();
			System.out.print (line + "\n");
		}

		fin.close();
	}
}

