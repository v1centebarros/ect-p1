/**
 * Mandar os exercício para jam@ua.pt
 * Assunto: Turma P2
 * Body: Nome, nº mec
 * anexos: *java
 **/

import java.util.Scanner;

public class ex5 {
	
	public static void main (String[] args) {

		Scanner sc = new Scanner(System.in);

		double coords [][] = new double[4][2];
		
		double distancias[] = new double [4];
		
		
		System.out.println("Verificar se é um retângulo");
		
		for (int i = 0; i < 4; i++) {
			System.out.printf ("Coordenada X do ponto P%d: ",i+1);
			coords[i][0] = sc.nextDouble();
			
			System.out.printf ("Coordenada Y do ponto P%d: ",i+1);
			coords[i][1] = sc.nextDouble();
			System.out.println ("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
		}
		
		distancias[0] = calcula_distancia (0,1,coords);
		distancias[1] = calcula_distancia (1,2,coords);
		distancias[2] = calcula_distancia (2,3,coords);
		distancias[3] = calcula_distancia (3,0,coords);
		
		if (distancias[0] == distancias[1] && distancias[1] == distancias[2]) {
			System.out.print("E um quadrado");
		} else {
			System.out.print("Nao e um quadrado");			
		}
		//TODO Verificar os ângulos internos do quadrado
	}
	
	static double calcula_distancia (int ponto_a, int ponto_b, double coords [][]){
		double xA = coords[ponto_a][0];
		double yA = coords[ponto_a][1];
		double xB = coords[ponto_b][0];
		double yB = coords[ponto_b][1];
		
		double result = Math.sqrt(Math.pow((xB-xA),2) + Math.pow((yB-yA),2));
		result = Math.round(result);
		System.out.println(result);
		return result;
	}
}

