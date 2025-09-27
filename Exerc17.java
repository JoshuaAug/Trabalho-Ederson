import java.util.Scanner;

public class Exerc17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int resposta;

        System.out.print("- - - Calculadora - - -\n");
        System.out.print("Digite o 1º número: ");
        int n1 = sc.nextInt();

        System.out.print(" - - - Operador - - -\n");
        System.out.print(" [1] Soma\n");
        System.out.print(" [2] Subtração\n");
        System.out.print(" [3] Multiplicação\n");
        System.out.print(" [4] Divisão\n");
        int operador = sc.nextInt();

        System.out.print("Digite o 2º número: ");
        int n2 = sc.nextInt();

        switch (operador) {
            case 1:
                resposta = soma(n1, n2);
                System.out.printf("Essa é a soma: %d\n", resposta);
                break;
            case 2:
                resposta = subtrair(n1, n2);
                System.out.printf("Essa é a subtração: %d\n", resposta);
                break;
            case 3:
                resposta = multiplicar(n1, n2);
                System.out.printf("Essa é a multiplicação: %d\n", resposta);
                break;
            case 4:
                resposta = dividir(n1, n2);
                System.out.printf("Essa é a divisão: %d\n", resposta);
                break;
        }
    }

    public static int soma(int n1, int n2) {
        int soma = n1 + n2;
        return soma;
    }

    public static int subtrair(int n1, int n2) {
        int subtrair = n1 - n2;
        return subtrair;
    }

    public static int multiplicar(int n1, int n2) {
        int multi = n1 * n2;
        return multi;
    }

    public static int dividir(int n1, int n2) {
        int divisao = n1 / n2;
        return divisao;
    }
}
