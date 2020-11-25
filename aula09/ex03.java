import java.util.Scanner;

/**
 * ex03
 * 
 */

//TODO Como ler mais que uma linha e analisar

public class ex03 {
    public static Scanner sc = new Scanner (System.in);
    public static void main(String[] args) {
        System.out.print ("Insere uma frase: ");
        String inPhrase = sc.nextLine();
        System.out.print(countWords(inPhrase));
    }

    public static int countWords(String phrase) {
        char analisedChar, previousChar;
        int j = 1;
        for (int i = 1; i< phrase.length(); i++) {
            analisedChar = phrase.charAt(i);
            previousChar = phrase.charAt(i-1);             
            if (Character.isWhitespace(analisedChar) && !Character.isWhitespace(previousChar)){
                j++;
            }
        }
        return j;
    }
}