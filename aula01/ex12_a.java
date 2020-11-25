import java.util.Scanner;
import java.lang.Math;


public class ex12_a {
    public static void main(String[] args)
  {
    
    int h1,min1,seg1;
    
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Segundos: ");
    int seg_rec = sc.nextInt();
    
    //HORAS
    h1 = (int) ((seg_rec / (60*60)) % 24);
    
    min1 = (int) ((seg_rec / (60)) % 60);
   
    seg1 = (int) seg_rec % 60;

    System.out.printf("%02d:%02d:%02d",h1,min1,seg1);
   }
}
