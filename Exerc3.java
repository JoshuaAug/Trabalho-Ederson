import java.util.ArrayList;
import java.util.Scanner;
import java.util.Objects;

public class Exerc3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String auxiliar;
        ArrayList<String> tarefas = new ArrayList<>();

        System.out.print("Quantas tarefas realizaras?: ");
        int qntTarefas = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < qntTarefas; i++) {
            System.out.printf("Tarefa %d: ", i+1);
            auxiliar = sc.nextLine();
            tarefas.add(auxiliar);
            // ""Limpa"" o leitor
            // sc.nextLine();
        }

        System.out.print("-------- Tarefas --------\n");
        for (int i = 0; i < qntTarefas; i++) {
            System.out.printf("%dº tarefa: %s\n", i+1, tarefas.get(i));
        }
    }
}
