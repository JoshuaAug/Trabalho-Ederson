import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exerc15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> votos = new ArrayList<>();

        System.out.println("votos");
        System.out.println("Digite o número do candidato:");
        System.out.println("13 - Ladrão");
        System.out.println("22 - Capitão Brasil");
        System.out.println("Digite 'cabo' para parar");

        while (true) {
            System.out.print("Voto: ");
            String entrada = sc.nextLine();
            if (entrada.equalsIgnoreCase("cabo")) {
                break;
            }
            votos.add(entrada);
        }
        int votos13 = 0, votos22 = 0;
        for (String vot : votos) {
            if (vot.equals("13")) {
                votos13++;
            } else if (vot.equals("22")) {
                votos22++;
            } else {
                System.out.println("Sapoha não existe fi:" + vot);
            }
        }
        System.out.println("\n= resultado =");
        System.out.println("Ladrão: " + votos13 + " votos");
        System.out.println("Capitão Brasil: " + votos22 + " votos");
    }
}