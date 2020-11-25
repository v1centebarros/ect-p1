import java.util.Scanner;


public class ex13 {
    
  public static void main(String[] args) {
  
  int scale = 100;
    
  Scanner sc = new Scanner(System.in);
  
  //Coordenadas de A
  
  //xA
  System.out.println("Coordenadas da Localidade A");
  System.out.print("xA: ");
  double xA = sc.nextDouble();
  
  //yA
  System.out.print("yA: ");
  double yA = sc.nextDouble();
  
  //Coordenadas de B
  
  //xB
  System.out.println("Coordenadas da Localidade B");
  System.out.print("xB: ");
  double xB = sc.nextDouble();
  
  //yB
  System.out.print("yB: ");
  double yB = sc.nextDouble();
  
  
  double result = Math.sqrt(Math.pow((xB-xA),2) + Math.pow((yB-yA),2)) * scale;
  
  System.out.printf ("Distancia entre as localidades: %.2f",result);
  

  }
}
