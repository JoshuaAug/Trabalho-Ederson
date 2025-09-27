import java.util.ArrayList;
import java.util.Scanner;

public class Exerc22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Double> notas = new ArrayList<>();
        double media = 0;

        System.out.print("Digite a quantidade de notas: ");
        int quantidade = sc.nextInt();

        // Coleta as notas
        for (int i = 0; i < quantidade; i++) {
            System.out.printf("Digite a %dº nota: ", i+1);
            notas.add(sc.nextDouble());
            // Vai somando as médias
            media += notas.get(i);
        }

        media = media / quantidade;
        double maxi = notas.get(0);

        // Calcula e fala resultados
        for (int i = 0; i < quantidade; i++) {
            // De acordo com a média da turma
            if (notas.get(i) <= media) {
                System.out.printf("[%d nota] %.1f - Abaixo da média da turma - ", i+1, notas.get(i));
            } else if (notas.get(i) >= media) {
                System.out.printf("[%d nota] %.1f - Acima da média da turma - ", i+1, notas.get(i));
            }

            // De acordo com media básica
            if (notas.get(i) <= 6) {
                System.out.print("Reprovado.\n");
            } else if (notas.get(i) > 6) {
                System.out.print("Aprovado.\n");
            }

            // Nota máxima
            if (notas.get(i) > maxi) {
                maxi = notas.get(i);
            }
        }
        System.out.printf("A média das notas é %.1f\n", media);
        System.out.printf("A maior nota foi %.1f\n", maxi);
    }
}
