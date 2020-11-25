import java.util.Scanner;

public class teste01 {
    static Scanner teclado = new Scanner (System.in);

    public static void main (String[] args) {
        double xI, xF, deltaX;
        int npMax;
        int npValidos = 0; 
        double[] funcao1; // array com pontos de uma função
        int escolha; 

        do {
            escolha = (int) lerNumero("1- ler pontos da Funcao do teclado; 2 - Funcao f():");
        } while ((escolha != 1) && (escolha != 2));

        do {
            xI = lerNumero ("Valor inicial de x: ");
            xF = lerNumero ("Valor final de x: ");
        } while (xI >= xF);

        npMax = (int) lerNumero ("Número de pontos da função: ");
        
        if (escolha == 2) {
            funcao1 = f(xI, xF, npMax);
            npValidos = npMax;
        } else {
            funcao1 = f(xI, xF, npMax);
            npValidos = lerFuncao (funcao1);
        }

        deltaX = (xF - xI)/npValidos;

        int[] raizes = zeros(funcao1, npValidos);

        for (int r = 1; r <= raizes[0]; r++)
            System.out.printf("Raiz %d x = %f\n", r, raizes[r] * deltaX + xI);

        System.out.printf("Máximo para x = %.5f\n", xI + xMaximo(funcao1, npValidos) * deltaX);

        printFuncao(funcao1, npValidos, xI, deltaX);
    }

    static double lerNumero (String mensagem) {
        System.out.print(mensagem);
        double  n = teclado.nextDouble();

        return n;
    }

    public static int lerFuncao (double[] funcao) {
        System.out.printf ("Introduza %d pontos de uma função ou até 0 0:\n", funcao.length);

        int y0 = -1, i = 0;
        double y = -1;


        do {
            y0 = (int)y;
            y = teclado.nextDouble();
            funcao [i++] = y;
        } while (!(y0 == 0 && (int)y == 0) && i < funcao.length);
        if (y0 == 0 && (int) y == 0) i=-2;
        
        return i;
    }

    static double[] f(double xI, double xF, int np) {
        double[] a = new double [np];
        double dx = (xF - xI) / np;
        for (int i = 0; i < a.length; i++) { 
            a[i] = Math.sin (xI + dx * i);       
        }

        return a;
    }

    static int xMaximo (double[] funcao, int npv ) {
        int xMax = 0; 
        for (int i = 0; i < npv; i++) {
            if (funcao [i] > funcao [xMax]) xMax = i;
        }

        return xMax;
    }

    static int [] zeros (double[] funcao, int npv) {
        int nraizes = 0; 
        int[] raiz = new int [npv];


        for (int i = 1; i < npv; i++) {
            if (funcao[i-1] * funcao[i] < 0 || funcao [i] == 0) {
                nraizes = nraizes + 1;
                raiz [nraizes] = i;
            }
        }

        raiz[0] = nraizes;
        
        return raiz;
    }

    public static void printFuncao(double[] funcao, int npv, double xI, double dx) {
        for (int x = 0; x < npv; x++) {
            System.out.printf("Pos=%3d x= %8.5f y= %8.5f%n",x, xI + x*dx,funcao[x]);
        }
    }
}