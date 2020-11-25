import java.util.*;

/**
 * ex06
 */
public class ex06 {
    public static Scanner sc = new Scanner (System.in);
    public static void main(String[] args) {
        System.out.print("Frase a Traduzir: ");
        String frase = sc.nextLine();

        frase = frase.replaceAll("[rR]","");
        frase = frase.replaceAll("L","U");
        frase = frase.replaceAll("l","u");
        System.out.println(frase);
        
    }
}