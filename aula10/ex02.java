/**
 * ex02
 */
import java.util.*;

public class ex02 {

    public static Scanner sc= new Scanner(System.in);
    public static void main(String[] args) {  
        int[] aposta = new int[6];
        aposta = getNumbers();
        seqSort(aposta);
        //TODO Não Fuciona mostrar a chave
        String keys = String.join(",", Arrays.toString(aposta));        
        
        System.out.println ("\t Aposta de Totoloto");
        System.out.printf ("Chave: ",keys);
        
        buildCard(aposta); 
     
    }


    public static int[] getNumbers() {
            ArrayList<Integer> list = new ArrayList<Integer>();
            int aposta[] = new int [6];

            for (int i=1; i<50; i++) {
                list.add(new Integer(i));
            }
            Collections.shuffle(list);
            for (int i=0; i<6; i++) {
                aposta[i] = list.get(i);
            }
            return aposta;

    }


    public static void buildCard(int[] numbers) {
        System.out.print("\n\n\n");

        int i = 1;

        while (i<50) {
            String num = "";

            for (int j = 0; j<6; j++){
                if (i == numbers[j]) {
                    num = "X";
                    break;
                } else {
                    num = String.valueOf(i);
                }
            } 
            System.out.printf("%2s  ",num);
            if (i % 7 == 0 )System.out.print("\n");
            i++;
        }              
    }

    
	public static void seqSort (int[] arr) {
		int tmp, i,j;

		for (i = 0; i < arr.length - 1; i++) {
			for (j = i+1; j< arr.length;j++) {
				if (arr[i] > arr[j] && arr[i]!=0 && arr [j] != 0) {
					tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
	}
}