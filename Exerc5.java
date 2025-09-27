import java.util.ArrayList;
import java.util.Scanner;

public class Exerc5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Valor P
        System.out.println("Digite o capital inicial: ");
        double cap = sc.nextDouble();

        // Valor R
        System.out.println("Digite a taxa de juros anual: ");
        double taxAnual = sc.nextDouble();

        // Valor N
        System.out.println("Quantas vezes foi aplicada: ");
        int qntTax = sc.nextInt();

        // Valor T
        System.out.println("Digite o tempo de aplicação: ");
        int tempo = sc.nextInt();

        double montante = Math.pow(1 + (taxAnual/qntTax), qntTax*tempo);
        montante *= cap;

        System.out.printf("Montante: R$ %.2f\n", montante);
    }
}