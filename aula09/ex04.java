import java.util.Scanner;

/**
 * ex04
 */
public class ex04 {

    public static Scanner sc = new Scanner (System.in);
    public static void main(final String[] args) {
        System.out.print("Insere uma matricula: ");
        String matricula = sc.next();
        matchPattern(matricula);        
    }

    public static void matchPattern(final String str) {
        String pattern[] = { "AA-00-00", "00-00-AA", "00-AA-00" };
        String analisedString = "";
        Boolean f = false;

        for (int i = 0; i < str.length();i++) {
            char analisedChar = str.charAt(i);
            if (Character.isLetter(analisedChar)){
                analisedString += "A";
            } else if (Character.isDigit(analisedChar)) {
                analisedString+="0";
            } else if (analisedChar == '-'){
                analisedString+="-";
            }
        }

        for (String j: pattern) {
            if (!f){
                if (j.equals(analisedString)) {
                    System.out.println("Matricula Portuguesa");
                    f = true;
                }
            }
        }
        
        if(!f) System.out.println("Matricula Invalida");
    }
}