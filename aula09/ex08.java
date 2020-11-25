import java.util.Scanner;;

/**
 * ex05
 */
public class ex08 {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        String num;
        int base;
        do {
            System.out.print("Insere um número: ");
            num = sc.next();
            System.out.print("Insere uma base: ");
            base = sc.nextInt();
        } while (Integer.parseInt(num) > base);
        
        System.out.print(numToBase(num, base));
    }

    public static String numToBase(String number, int fBase) {
        return Integer.toString(Integer.parseInt(number, fBase), 10); 
    }
}