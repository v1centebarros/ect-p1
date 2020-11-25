import java.util.Scanner;;

/**
 * ex05
 */
public class ex05 {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Insere um número: ");
        int num = sc.nextInt();
        System.out.print("Insere uma base: ");
        int base = sc.nextInt();
        System.out.print(numToBase(num, base));
    }

    public static String numToBase(int number, int toBase) {
        return Integer.toString(number, toBase);

    }
}