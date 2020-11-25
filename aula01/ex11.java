import java.util.Scanner;

public class ex11 {
    public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    
    double dol1, tax1, eur1;
    
    System.out.print("Quantia a converter: ");
    dol1 = sc.nextDouble();
    System.out.print("Taxa de conversão: ");
    tax1 = sc.nextDouble();
    
    eur1 = dol1 * (100 - tax1) / 100;
    
    System.out.printf("%4.1f dólares equivalem a %4.1f euros\n", dol1, eur1);
 
    }
}
