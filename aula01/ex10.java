package aula01;

import java.util.Scanner;

public class ex10 {
    public static void main(final String[] args) {
    final Scanner sc = new Scanner(System.in);
    
    double cels1,farn1;
    
    
    System.out.print("Temperatura em Celsius: ");
    cels1 = sc.nextDouble();
    
    farn1 = 1.8 * cels1 + 32;
    
    System.out.printf("%4.1fº Celsius é igual a %4.1fº Fahrenheit\n", cels1, farn1);

    
  }
}
