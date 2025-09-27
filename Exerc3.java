import java.util.ArrayList;
import java.util.Scanner;
import java.util.Objects;

public class Exerc3 {
    public static void main(String[] args) {

        // Declaração de scanner e variaveis
        Scanner sc = new Scanner(System.in);
        String auxiliar;
        ArrayList<String> tarefas = new ArrayList<>();

        // Solicitação de quantas tarefas
        System.out.print("Quantas tarefas realizaras?: ");
        int qntTarefas = sc.nextInt();
        sc.nextLine();

        // De acordo com a quantidade vai pedindo as tarefas
        for (int i = 0; i < qntTarefas; i++) {
            System.out.printf("Tarefa %d: ", i+1);
            auxiliar = sc.nextLine();
            tarefas.add(auxiliar);
        }

        // Printa as tarefas enumeradas
        System.out.print("-------- Tarefas --------\n");
        for (int i = 0; i < qntTarefas; i++) {
            System.out.printf("%dº tarefa: %s\n", i+1, tarefas.get(i));
        }
    }
}
