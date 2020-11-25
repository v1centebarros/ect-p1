import java.util.*;
import java.io.*;

public class ex03 {
	
	public static Scanner sc = new Scanner (System.in);
	public static void main (String[] args) {
		Contacto agenda[] = new Contacto[100];
		int numContacto = 0;
		execMenu (agenda, numContacto);
	}
	
	public static void menu () {
		System.out.print(
			 "Gestao de uma agenda:\n"
			+ "	I - Inserir um contacto\n"
			+ "	P - Pesquisar contacto por nome\n"
			+ "	E - Eliminar um contacto\n"
			+ "	M - Mostrar os contactos\n"
			+ "	V - Validar enderecos de email\n"
			+ "	A - Apagar a agenda\n"
			+ "	T - Terminar o programa\n\n"
			+ "	Opcao ->"
		);
	}
	
	public static void execMenu (Contacto agenda[], int numContactos) {
		
	
		menu();
		
		char op = sc.next().charAt(0);
		switch (op) {
			case 'T':
			case 't':
				System.exit(0);
				break;
				
			case 'I':
			case 'i':
				numContactos = inserirContacto(agenda, numContactos);
				execMenu(agenda, numContactos);
				break;
				
			case 'P':
			case 'p':
				pesquisarConta(agenda, numContactos);
				execMenu(agenda, numContactos);
				break;
			
			case 'E':
			case 'e':
				numContactos = eliminarContacto(agenda, numContactos);
				execMenu(agenda, numContactos);
				break;
			case 'M':
			case 'm':
				mostrarContactos(agenda, numContactos);
				execMenu(agenda, numContactos);
				break;
			
			
			case 'V':
			case 'v':
				verificaEmail(agenda, numContactos);
				execMenu(agenda, numContactos);
				break;
			
			default : 
				execMenu(agenda, numContactos);					
				break;
			
		}
	}
		
	public static int inserirContacto (Contacto agenda[],int numContacto) {
		
		agenda[numContacto] = new Contacto();
		
		sc.nextLine();
		System.out.print ("Nome: ");
		agenda[numContacto].nome = sc.nextLine();
		
		System.out.print ("Morada: ");
		agenda[numContacto].morada = sc.nextLine();
		
		System.out.print ("Telefone: ");	
		agenda[numContacto].telefone = sc.nextInt();sc.nextLine();
		
		System.out.print ("Email: ");
		agenda[numContacto].email = sc.nextLine();
		
		numContacto++;
		return numContacto;
	}
	
	public static void pesquisarConta (Contacto[] agenda, int numContactos) {
		
		sc.nextLine();
		System.out.print ("Nome a procurar: ");
		String nomeProcurado = sc.nextLine();
		
		for (int i = 0; i <numContactos; i++) {
			if (agenda[i].nome.indexOf(nomeProcurado) != -1) {
				System.out.print ("\n\n");
				System.out.printf ("Nome: %s\n",agenda[i].nome);
				System.out.printf ("Morada: %s\n",agenda[i].morada);
				System.out.printf ("Telefone: %s\n",agenda[i].telefone);
				System.out.printf ("Email: %s\n\n",agenda[i].email);
				System.out.printf ("-*-*-*-*-*-*-*-*-*\n");
			}
		}
	}
	
	public static int eliminarContacto (Contacto[] agenda, int numContactos) {
		System.out.print ("Contacto a eliminar(inserir o numero de telefone): ");
		int contactoEliminar = sc.nextInt();
		int verificaContacto = -1;
		int i = 0;
		while (verificaContacto == -1 && i<= numContactos) {
			if (agenda[i].telefone == contactoEliminar) {
				verificaContacto = i;
			}
			i++;
		} 
		
		if (verificaContacto == -1) {
			System.out.println ("Esse contacto nao existe");
		} else {
			for (int j = verificaContacto; j < numContactos; j++) {
				agenda [j] = agenda[j+1];
			}	
			numContactos--;
		}
		return numContactos;
	}
	
	
	public static void mostrarContactos (Contacto[] agenda, int numContactos) {
		for (int i = 0; i <numContactos; i++) {
			System.out.print ("\n\n\n");
			System.out.printf ("Nome: %s\n",agenda[i].nome);
			System.out.printf ("Morada: %s\n",agenda[i].morada);
			System.out.printf ("Telefone: %s\n",agenda[i].telefone);
			System.out.printf ("Email: %s\n\n",agenda[i].email);
			System.out.printf ("-*-*-*-*-*-*-*-*-*");
		}
	}	
	
	public static void verificaEmail (Contacto[] agenda, int numContactos) {
		
		
		for (int i = 0; i< numContactos; i++) {
			String emailAnalisar = agenda[i].email;
			
			int arrobaPos = emailAnalisar.indexOf("@");
			
			if (arrobaPos != -1) {
				int j = 0;
				String emailInicio = "", emailFim = "";
				 
				while (j < emailAnalisar.length()){
					if (j < arrobaPos) {
						emailInicio += emailAnalisar.charAt(j);
					} else if (j> arrobaPos){
						emailFim += emailAnalisar.charAt(j);
					}
										
					j++;
				}
				System.out.println (emailInicio+"\n\n");
				System.out.println (verificaEmailInicio(emailInicio)+"\n\n");
				
				
				
				//System.out.print("\n\n\n\n");
				
			} else {
				System.out.printf ("Email Invalido: %s nao contem @\n\n",emailAnalisar);
			}
		}
	}
	
	public static int verificaEmailInicio (String emailInicio) {
		int validade = 1;
		int i = 0;
		do {
			char caracterAnalisar = emailInicio.charAt(i);
			
			if (Character.isDigit(caracterAnalisar)  || Character.isAlphabetic(caracterAnalisar) || caracterAnalisar == '.' || caracterAnalisar == '-') {

			}else {
				validade = 0;
			}
			i++;
		}while (validade == 1 && emailInicio.length() <= i);
		return validade;
	}
}



class Contacto {
	String nome;
	String morada;
	int telefone;
	String email;
}
