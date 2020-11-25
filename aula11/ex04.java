import java.util.*;

/**
 * ex04
 */
public class ex04 {

    public static Scanner sc = new Scanner (System.in);

    public static void main(String[] args) {
        Aluno[] turma = new Aluno[20];
        execMenu(turma);
        
    }


    public static void menu() {
        System.out.println("\n\n\nGestao da turma: ");
        System.out.println("1 - Inserir informação da turma");
        System.out.println("2 - Mostrar informacao de um aluno");
        System.out.println("3 - Alterar informação de um aluno");
        System.out.println("4 - Listar os alunos ordenados por nº mec");
        System.out.println("5 - Listar os alunos ordenados por nota final");
        System.out.println("6 - Media das notas finais");
        System.out.println("7 - Melhor aluno");
        System.out.println("8 - Inserir pesos dos vários testes");
        System.out.println("0- Terminar o programa");
        System.out.print("Opcao: ");
    }

    
    public static void execMenu (Aluno[] turma) {
		
		menu();
		int op = sc.nextInt();

		switch (op) {
			case 0:
				System.exit(0);
				break;
            case 1:
                inserirTurma();
                execMenu(turma);
                break;
            
            case 2:
                mostrarInfoAluno(turma);
                execMenu(turma);
                break;
        
            default:
                execMenu(turma);
                break;
        }
      
    }



    public static Aluno[] inserirTurma() {
        Aluno turma [] = new Aluno[20];
       
        
        for (int i = 0; i<20; i++) {
			turma[i] = new Aluno();
            
			System.out.print ("N. Mec: ");
			int inputMec = sc.nextInt();
			sc.nextLine();
				
			if (inputMec == 0){
				turma[i] = null;
				break;
			} else {
				turma[i].nMec = inputMec;
			}
			
	
            System.out.print ("Nome: ");
            turma[i].nome = sc.nextLine();
            
            for (int j = 0; j<3; j++) {
                System.out.printf ("Nota do teste %d: ",j+1);
                turma[i].notas[j] = sc.nextInt();
            }
        }
        return turma;
    }
    
    public static void mostrarInfoAluno(Aluno[] turma) {
		System.out.print ("Nº Mec a procurar: ");
		int numeroMec = sc.nextInt();
		
		for (int i = 0; i<20; i++){
			if (turma[i] != null && turma[i].nMec == valor) {
				System.out.printf("Nº Mec: %s", turma[aluno].nMec);
			
			System.out.printf("Nome: %s", turma[aluno].nome);
			
			 for (int i = 0; i<3; i++) {
					System.out.printf ("Nota do teste %d: %d",i+1, turma[aluno].notas[i]);
			}
		}
	}
}







class Aluno {
    int nMec;
    String nome;
    int[] notas = new int[3];
    int notaFinal;
}
