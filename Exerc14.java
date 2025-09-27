import java.util.Scanner;
import java.util.Random;

public class Exerc14 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        boolean simulacao = true;
        int dado1, dado2, soma, cont=0;

        do {
            System.out.print("Simulador de Lançamento de Dados\n");
            dado1 = random.nextInt(6) + 1;
            dado2 = random.nextInt(6) + 1;
            soma = dado1 + dado2;
            System.out.printf("D1: %d + D2: %d = %d\n", dado1, dado2, soma);
            cont++;
            if (soma == 7){
                simulacao = false;
            }
        } while (simulacao==true);

        System.out.printf("Você levou %d tentativas para a soma dos dados ser 7!", cont);
    }
}
