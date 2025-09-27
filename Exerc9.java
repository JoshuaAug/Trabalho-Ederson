import java.util.Scanner;

public class Exerc9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char conceito='C';

        System.out.println("Digite a nota [0-10]: ");
        double nota = sc.nextDouble();

        if (nota < 0) {
            System.out.print("Nota inválida!");
            System.exit(0);
        } else if (nota >= 0 && nota <= 4.4) {
            conceito = 'C';
        } else if (nota >= 4.5 && nota <= 6.9) {
            conceito = 'B';
        } else {
            conceito = 'A';
        }

        switch (conceito) {
            case 'A':
                System.out.print("Conceito A!\n");
                System.out.print("Aprovado!");
            break;
            case 'B':
                System.out.print("Conceito B!\n");
                System.out.print("Recuperação!");
            break;
            case 'C':
                System.out.print("Conceito C!\n");
                System.out.print("Reprovado!");
            break;
        }
    }
}
