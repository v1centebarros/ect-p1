import java.util.Scanner;
import java.time.LocalTime;

public class ex12
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Segundos: ");
    int milisec = sc.nextInt();
    
    LocalTime localTime = LocalTime.ofSecondOfDay(milisec);
    
    System.out.println(localTime);
    
  }
}
