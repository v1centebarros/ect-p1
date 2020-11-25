import java.util.*;

/**
 * ex07
 */
public class ex07 {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("Frase a capitalizar:");
        String str = sc.nextLine();
        System.out.print(capitalize (str));
    }

    public static String capitalize (String str){
        char analisedChar, previousChar;
        String outString = "";

        outString += Character.toUpperCase(str.charAt(0));

        for (int i = 1; i < str.length(); i++) {

            analisedChar = str.charAt(i);
            previousChar = str.charAt(i-1);

            if (Character.isWhitespace(previousChar) && Character.isAlphabetic(analisedChar)) {
                outString += Character.toUpperCase(str.charAt(i));
            } else {
                outString += str.charAt(i);
            }
        }
        return outString;
    }
}