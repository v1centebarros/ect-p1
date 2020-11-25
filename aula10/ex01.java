import java.util.Scanner;
import java.io.*;

public class ex01 {
	
	public static int[] sequence = new int[50];
	public static Scanner sc = new Scanner(System.in);

	
	
	
	public static void main (String[] args) throws IOException{
		execMenu();

		sc.close();
	}

	
	public static void execMenu () throws IOException {
		
		int op = 0;
		
		do{
			buildMenu();
			op = sc.nextInt();
			chooseOption(op);
		} while (op < 1 || op > 14);
	}
	
	
	
	
	public static void buildMenu(){
		System.out.println("1 - Ler a sequencia");
		System.out.println("2 - Escrever a sequencia");
		System.out.println("3 - Calcular o maximo da sequencia");
		System.out.println("4 - Calcular o minimo da sequencia");
		System.out.println("5 - Calcular a media da sequencia");
		System.out.println("6 - Detetar se e uma sequencia só constituida por numeros pares");
		System.out.println("7 -Ler uma sequência de números de um ficheiro");
		System.out.println("8 -Adicionar números à sequência");
		System.out.println("9 -Gravar a sequência num ficheiro");
		System.out.println("10 -Ordenar a sequência por ordem crescente utilizando ordenação sequencial");
		System.out.println("11 -Ordenar a sequência por ordem decrescente utilizando ordenação por flutuação");
		System.out.println("12 -Pesquisa de valor na sequência");
     	System.out.println("13 -Terminar o programa");
		System.out.print("Opcao -> ");
	}
	
	public static void chooseOption (int op)  throws IOException{
		switch (op) {
			case 1 : sequence = readSequence();
					execMenu();
					break;
			case 2 :	listSequence();
					execMenu();
					break;
			case 3 :	System.out.printf("\n\n\nO maximo da sequencia e: %d\n", maxNumber());
					execMenu();
					break;
			case 4 :	System.out.printf("\n\n\nO minimo da sequencia e: %d\n",minNumber());
					execMenu();
					break;
			case 5 : System.out.printf("\n\n\nA media da sequencia e: %.2f\n",averageSequence());
					execMenu();
					break;
			case 6 : writeIfEven();
					execMenu();
					break;
			case 7 : readFileSequence();
					execMenu();
					break;

			case 8 : addNumbers();
					execMenu();
					break;
			case 10 :seqSort(sequence);
					 execMenu();
					 break;
			case 11 :seqSort(sequence);
					 execMenu();
					break;
			case 12 :
					searchNumber();
					execMenu();
			break;
			
		}
	}	
	
	public static int[] readSequence(){
		
		int i = 0,readNum;
		int arr[] = new int[50];
		do{
			System.out.print("Insere um numero: ");
			
			readNum = sc.nextInt();
			
			if (readNum != 0){
				arr[i] = readNum;
			}
			i++;
		} while (readNum != 0);
		
		return arr;
	}
	
	public static void listSequence() {
		int i = 0;
		do{
			System.out.printf("%dº: %d\n",i+1,sequence[i]);
			i++;
		} while (sequence [i] != 0);	
	}
	
	public static int maxNumber () {
		int major = 0;
		for (int num : sequence) {
			if (major < num) major = num;
		}
		return major;
	}
	
	public static int minNumber () {
		int minor = sequence[0];
		for (int num : sequence) {
			if (minor > num && num != 0) minor = num;
		}
		return minor;
	}
	
	public static int countSequence(){
		int count = 0;
		while (sequence[count] != 0){
			count++;
		}
		return count;
	}
	
	public static float averageSequence() {
		int sumNum = 0;
		
		for (int num : sequence) {
			sumNum += num;
		}
		int totalNum = countSequence ();
		
		float average = sumNum / totalNum;
		
		return average; 
	}
	
	public static boolean checkIfEven () {
		int i = 0;
		boolean flag = true;
		while (flag == true && sequence[i] != 0) {
			if (sequence[i] % 2 != 0)flag = false;
			i++;
		}
	return flag;
	}
	
	public static void writeIfEven(){
		if (checkIfEven() == true){
			System.out.print ("A sequencia e toda constituida por numeros pares\n\n");
		} 	else {
			System.out.print ("A sequencia nao e toda constituida por numeros pares\n\n");
		}
	}	


	public static void addNumbers() {
		System.out.println("Números a adicionar: ");
		int count = 0;
		while (sequence[count] != 0 ) count++;
		
		do {
			if (count <= 50) {
				sequence[count] = sc.nextInt();
				count++;
			} else {
				System.out.print("Array completamente preenchido");
			}
		} while (count <=50 && sc.nextInt() != 0);
	}
	
	public static void readFileSequence() throws IOException{
		System.out.print("Ficheiro a analisar: ");
		String filename = sc.next();
		File file = new File(filename);
		if (checkIsFile(file, filename)) {
		
			Scanner fileScanner = new Scanner (file); 
			int i = 0;
			
			while (fileScanner.hasNextLine()) {
				sequence[i] = fileScanner.nextInt();
				i++;
			}

			fileScanner.close();
		} else {
			readFileSequence();
		}
	}

	public static boolean checkIsFile(File file, String filename) {
		boolean flag = true;
		
		if (!file.exists()) {
			System.out.println("ERROR: input file " + filename + " does not exist!");
			flag = false;
			
        } else if (file.isDirectory()) { // testa se ficheiro é um diretório
			System.out.println("ERROR: input file " + filename + " is a directory!");
			flag = false;
        } else if (!file.canRead()) {
			System.out.println("ERROR: cannot read from input file " + filename + "!");
			flag = false;
		} 

		return flag;
	}

	public static void writeInFile() throws IOException{
		System.out.print("Nome do novo ficheiro: ");
		String filename = sc.next();
		File outFile = new File(filename);
		PrintWriter outWriter = new PrintWriter(outFile);
		int i = 0;
		while (sequence[i] != 0){
			outWriter.println(sequence[i]);
			i++;
		}

		outWriter.close();
	}

	public static void seqSort (int[] arr) {
		int tmp, i,j;

		for (i = 0; i < arr.length - 1; i++) {
			for (j = i+1; j< arr.length;j++) {
				if (arr[i] > arr[j] && arr[i]!=0 && arr [j] != 0) {
					tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
	}

	public static void bubSort(int[] arr) {
		int n = arr.length; 
        for (int i = 0; i < n-1; i++) 
            for (int j = 0; j < n-i-1; j++) 
                if (arr[j] > arr[j+1] && arr[i]!=0 && arr [j] != 0) 
                { 
                    // swap arr[j+1] and arr[i] 
                    int temp = arr[j]; 
                    arr[j] = arr[j+1]; 
                    arr[j+1] = temp; 
                } 
	}

	public static void searchNumber() {
		System.out.print("Número a pesquisar: ");
		int searchNum = sc.nextInt();
		int pos = seqSearch(sequence,searchNum);
		if (pos != -1) { 
			System.out.printf ("O numero %d foi encontrado na posicao %d da sequencia \n",searchNum, pos);
		} else {
			System.out.print("O numero não existe na sequencia.");
		} 
	}


	public static int seqSearch(int[] arr, int searchVal) {
		int n = 0;
		int pos = -1;

		do {
			if (arr[n++] == searchVal ) pos = n-1;
		} while (pos == -1 && n < arr.length);

		return pos;
	}
}