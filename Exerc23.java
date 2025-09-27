import java.util.Scanner;
import java.util.ArrayList;


public class Exerc23 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        ArrayList<String> fila = new ArrayList<>();

        do {
            System.out.print("- - - - Fila do PlayStation - - - - \n");
            if (!fila.isEmpty()) {
                for (int i=0; i<fila.size(); i++) {
                    System.out.printf("[%dº] %s\n", i+1, fila.get(i));
                }
            }
            System.out.print(" O que desejas fazer na fila?\n");
            System.out.print(" [A] Adicionar [R] Remover [S] Sair\n");
            char comando = leitor.next().toUpperCase().charAt(0);

            if (comando == 'A') {
                System.out.print("Digite o nome: ");
                fila.add(leitor.next());
            } else if (comando == 'R') {
                System.out.print("Qual pessoa quer remover? (Digite o nome engual) \n: ");
                fila.remove(leitor.next());
            } else if (comando == 'S') {
                break;
            } else {
                System.out.print("Comando inválido\n: ");
                break;
            }

        } while (true);
    }

}
