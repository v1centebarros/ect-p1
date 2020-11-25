import java.util.*;
import java.io.*;
public class ex01 {

	public static Scanner sc = new Scanner (System.in);
	public static void main (String[] args) throws IOException{
		Tempo mes[] = new Tempo [31];
		reiniciarRegistos(mes);
		execMenu(mes);
	}
	public static void reiniciarRegistos (Tempo mes[]) {
		for (int i = 0; i<mes.length; i++) {
			mes[i] = new Tempo();
			mes[i].temperatura = -50;
			mes[i].humidade = -50; 
		}
	}
	public static void menu () {
		System.out.print (
			"Estacao meteorologica:\n"
			+ "1 - Ler ficheiro de dados\n"
			+ "2 - Acrescentar medida\n"
			+ "3 - Listar valores de temperatura e humidade\n"
			+ "4 - Listar medidas ordenadas por valor de temperatura\n"
			+ "5 - Listar medidas ordenadas por valor de humidade\n"
			+ "6 - Calcular valores medios de temperatura e humidade\n"
			+ "7 - Calcular valores maximos e mínimos de temperatura e humidade\n"
			+ "8 - Calcular histograma das temperaturas e humidade\n"
			+ "9 - Terminar o programa\n\n" 
			+ "Opcao ->"
		);
	}
	
	public static void execMenu (Tempo mes[]) throws IOException{
		menu();
		int op = sc.nextInt ();
		
		switch (op) {
			case 1 : 
				lerFicheiro (mes);
				execMenu (mes);
				break;
			case 2 : 
				adicionarRegisto(mes);
				execMenu (mes);
				break;
			case 3 : 
				mostraRegistos(mes);
				execMenu (mes);
				break;
			case 4 : 
				copiarRegistos (mes);
				execMenu (mes);
				break;
			case 9 :
				System.exit(0);
				break;
			default :
				execMenu (mes);
				break;
		} 
	}
	
	public static void lerFicheiro (Tempo mes[]) throws IOException{
		System.out.print("Ficheiro a ler: ");
		String nomeFicheiro = sc.next(); 
		
		int dia, temperatura, humidade;
		
		File ficheiro = new File (nomeFicheiro);
		
		if (ficheiro.canRead() && !ficheiro.isDirectory() && ficheiro.exists()) {
			Scanner ficheiroScanner = new Scanner (ficheiro);
			
			while (ficheiroScanner.hasNext()) {
				dia = ficheiroScanner.nextInt() -1;
				temperatura = ficheiroScanner.nextInt();
				humidade = ficheiroScanner.nextInt();
				
				mes [dia] = new Tempo();
				mes[dia].temperatura = temperatura;
				mes[dia].humidade = humidade;
			}
			
			System.out.println ("Dados copiados com sucesso!\n");
		
		} else {
				System.out.println ("Erro Ficheiro Invalido! Tente novamente.");
				lerFicheiro (mes);
		}
	}
	
	
	public static void adicionarRegisto (Tempo mes[]) {
		int dia, humidade, temperatura;
		System.out.print ("Dia a adicionar: ");
		dia = sc.nextInt() - 1;
				
		if (mes[dia].temperatura == -50 && mes[dia].humidade == -50) {
			adicionarRegistoMedidas (mes[dia]);
		} else {
			System.out.printf ("Erro! O dia %d ja foi registado tente outro dia.\n\n", dia+1);
			adicionarRegisto (mes);
		}
		
	}
	
	public static void adicionarRegistoMedidas (Tempo dia) {
		int temperatura, humidade;
		
		System.out.print ("Inserir temperatura: ");
		temperatura = sc.nextInt();
		
		System.out.print ("Inserir humidade: ");
		humidade = sc.nextInt();
		
		if (temperatura <= 40 && temperatura >= -10 && humidade>= 0 && humidade<=100) {
			dia.temperatura = temperatura;
			dia.humidade = humidade;
		} else {
			System.out.println ("Medidas invalidas tente outras.");
			adicionarRegistoMedidas (dia);
		}
	}
	
	
	public static void mostraRegistos (Tempo mes[]) {
		for (int i = 0; i< mes.length; i++) {
			if (mes[i].temperatura != -50 && mes[i].humidade != -50)
				System.out.printf ("DIA: %2d 	TEMPERATURA: %3d		HUMIDADE: %2d \n\n",i+1, mes[i].temperatura,mes[i].humidade);
		}
	}
	
	
	public static void copiarRegistos (Tempo mes[]) throws IOException {
		System.out.print ("Ficheiro para guardar os registos: ");
		String nomeFicheiro = sc.next();
		
		File ficheiro = new File (nomeFicheiro);
		
		PrintWriter pw = new PrintWriter (ficheiro);
		
		for (int i = 0; i< mes.length; i++) {
			if (mes[i].temperatura != -50 && mes[i].humidade != -50)
				pw.printf ("%2d		%3d		%2d\n",i+1, mes[i].temperatura,mes[i].humidade);
		}

		pw.close();
	}
}




class Tempo {
	int temperatura;
	int humidade;
}
