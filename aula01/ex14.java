import java.util.Scanner;

public class ex14 {
    public static void main(String[] args)
  {
    double catA, catB;
    double hipot, angle;
    
    Scanner sc = new Scanner(System.in);
    
    System.out.print ("Cateto A: ");
    
    catA = sc.nextDouble();
    
    System.out.print ("Cateto B: ");
    
    catB = sc.nextDouble();
    
    hipot = Math.sqrt(Math.pow(catA,2) + Math.pow(catB,2));
    
    angle = Math.acos(catA / hipot);
        
    System.out.printf("Valor da Hipotenusa: %.2f \n",hipot);
   
    
    System.out.printf("Ângulo: %.2fº \n",Math.toDegrees (angle));
   }
}
