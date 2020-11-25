/*
 * JAM, out-2019
 *
 * Nesta classe deve definir novas funções e testá-las na função main.
 */

import java.util.Scanner;

public class Functions {

	public static void main (String args[]) {
		
		
		// Testar função sqr:
		System.out.printf("sqr(%f) = %f\n", 10.1, sqr(10.1));
		System.out.printf("sqr(%f) = %f\n", -2.0, sqr(-2.0));

		// Invoque as funções pedidas no enunciado para as testar:
		// Por exemplo, para testar func f (problema 5.2):
		System.out.printf("f(%d) = %f\n", 5, f(5));

		// Testar as restantes funções desenvolvidas
		System.out.printf("max(%f,%f) = %f\n", 3.1, 5.2, max(3.1, 5.2));
		System.out.printf("max(%d,%d) = %d\n", 3, 2, max(3, 2));
		
		System.out.printf ("p(%.1f)= %.1f\n",5.0,poly3(1,2,3,4,5));
		
		System.out.printf ("fact(%d)= %d\n",10,fact(10));
	
		
		int ano = getIntPos("Ano? ");
		System.out.printf("ano = %d\n", ano);
		
		int range = getIntRange("Teste ",-4, 4);
		System.out.printf("range = %d\n", range);

		printNtimes(3, "Ola");
	}

	/*
	 * sqr - calcula o quadrado de um número (real).
	 */
	public static double sqr(double x) {
		double y;	// variavel para resultado
		y = x*x;	// calculo do resultado a partir dos dados
		return y;	// devolver o resultado
	}

	// Defina as funções pedidas no enunciado:
	
	public static double f(int n) {
		 double result = 1/(1+Math.pow(n,2));
		return result;
	}
	
	public static double max (double a, double b) {
		if (a>b) return a;
		else return b;
	}
	
	public static int max (int a, int b) {
		if (a>b) return a;
		else return b;
	}
	
	public static double poly3 (double a,double b,double c,double d,double x) {
		
		double result =  a * Math.pow(x,3) + b * Math.pow(x,2) + c * x + d;
		return result;
	}
	
	public static long fact (int n){
		
		long result = 1;
		
		for(int i = 0; i< n; i++) {
			result = result * (i+1);
		}
		return result;
	}
	
	public static int getIntPos (String message){
		int val;
		Scanner sc = new Scanner(System.in);
		do {	
			System.out.print(message + ":");
			val = sc.nextInt();
		} while (val < 0);
		return val;
	}
	
	public static int getIntRange (String message, int lim1, int lim2) {
		int val;
		Scanner sc = new Scanner(System.in);
		
		do {	
			System.out.print(message + ":");
			val = sc.nextInt();
		} while ( val < lim1 || val > lim2 );
		
		return val;
	}
	
	public static void printNtimes (int n, String message) {
		for (int i= 1; i<= 3; i++){
			System.out.print(message);
		}
	}
}
