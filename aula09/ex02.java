import java.util.Scanner;

/**
 * ex02
 */
public class ex02 {
    public static Scanner sc = new Scanner (System.in);

    public static void main(String[] args) {
        String inputWord;
        do {
            inputWord = sc.nextLine();
            String ac = acronimo(inputWord);
            System.out.printf("%s\n",ac);
            
        } while (!inputWord.isEmpty()); 
    }

    public static String acronimo (String inputWord) {
        String acro = new String();
        for (int i = 0; i < inputWord.length(); i++) {            
            char testedChar = inputWord.charAt(i);
            if (Character.isUpperCase(testedChar)) {
                acro += testedChar;
            } 
        }     
        return acro;
    }
}