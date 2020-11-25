import java.util.*;
/**
 * aula01
 */
public class ex01 {

    public static Scanner sc = new Scanner (System.in);
    public static void main(String[] args) {
        System.out.println("Análise de uma frase: ");
        String inputString = sc.nextLine();
        
        
        char inputChar;
        int upper = 0, lower = 0, digit = 0, vowel = 0, consonant = 0;
        
        for (int i = 0; i< inputString.length(); i++) {
            inputChar = inputString.charAt(i);
            
            if (Character.isUpperCase(inputChar)) {
                upper++;
            } else if (Character.isLowerCase(inputChar)) {
                lower++;
            } else if (Character.isDigit(inputChar)) {
                digit++;
            }


            if(isVowel(inputChar)) {
                vowel++;
            } else if (!isVowel(inputChar) && ! Character.isDigit(inputChar)) {
                consonant++;
            }

        }

        System.out.printf("Numero de caracteres minusculos -> %02d\n",lower);
        System.out.printf("Numero de caracteres maiusculos -> %02d\n",upper);
        System.out.printf("Numero de caracteres numericos -> %02d\n",digit);
        System.out.printf("Numero de vogais -> %02d\n", vowel);
        System.out.printf("Numero de consoantes -> %02d\n", consonant);
    }



    public static boolean isVowel(char c)
    {
        if(c=='a' || c=='A' || c=='e' || c=='E' || c=='i' || c=='I' || c=='o' || c=='O' ||     c=='u' || c=='U')
        {    
            return true;
        }    
        else
        {
            return false;
        }    
    }
}   
