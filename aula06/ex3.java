import java.util.Scanner;


public class ex3 {
	
	public static int[] sequence;
	
	
	
	
	public static void main (String[] args) {
		execMenu();
	}

	
	public static void execMenu (){
		Scanner sc = new Scanner(System.in);
		int op = 0;
		
		do{
			buildMenu();
			op = sc.nextInt();
			chooseOption(op);
		} while (op < 1 || op > 11);
	}
	
	
	
	
	public static void buildMenu(){
		System.out.println("1 - Ler a sequencia");
		System.out.println("2 - Escrever a sequencia");
		System.out.println("3 - Calcular o maximo da sequencia");
		System.out.println("4 - Calcular o minimo da sequencia");
		System.out.println("5 - Calcular a media da sequencia");
		System.out.println("6 - Detetar se e uma sequencia só constituida por numeros pares");
		System.out.println("10 - Terminar o programa");
		System.out.print("Opcao -> ");
	}
	
	public static void chooseOption (int op) {
		switch (op) {
			case 1: sequence = readSequence();
					execMenu();
					break;
			case 2:	listSequence();
					execMenu();
					break;
			case 3:	System.out.printf("\n\n\nO maximo da sequencia e: %d\n", maxNumber());
					execMenu();
					break;
			case 4:	System.out.printf("\n\n\nO minimo da sequencia e: %d\n",minNumber());
					execMenu();
					break;
			case 5: System.out.printf("\n\n\nA media da sequencia e: %.2f\n",averageSequence());
					execMenu();
					break;
			case 6: writeIfEven();
					execMenu();
					break;
		}
	}	
	
	public static int[] readSequence(){
		
		Scanner sc = new Scanner(System.in);
		
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
	
}
