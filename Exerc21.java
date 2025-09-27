import java.util.ArrayList;
import java.util.Scanner;

public class Exerc21 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> quantidades = new ArrayList<>();

        // Começa antes pra inicializar o minimo
        System.out.print("Digite a quantidade: ");
        quantidades.add(sc.nextInt());
        int total = quantidades.get(0);
        int minimo = quantidades.get(0);

        for (int i = 1; i < 5; i++) {
            System.out.print("Digite a quantidade: ");
            quantidades.add(sc.nextInt());
            total += quantidades.get(i);

            // Se for menor
            if (quantidades.get(i) < minimo){
                minimo = quantidades.get(i);
            }
        }
        System.out.printf("O total de itens em estoque é %d\n", total);
        System.out.printf("O mínimo em estoque é %d\n", minimo);

    }
}
