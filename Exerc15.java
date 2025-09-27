import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exerc15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> votos = new ArrayList<>();

        System.out.print("- - - - - - Votos - - - - - -\n");
        System.out.print("Digite o número do candidato:\n");
        System.out.print("13 - Lula\n");
        System.out.print("22 - Bolsonaro\n");
        System.out.print("Digite \"Fim\" para parar\n");

        while (true) {
            System.out.print("Voto: ");
            String entrada = sc.nextLine();
            if (entrada.equalsIgnoreCase("fim")) {
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
                System.out.printf("Não existe um cadidato: \"%s\"\n", vot);
            }
        }
        System.out.printf("\n - - Resultado - - \n");
        System.out.printf("Lula: %d votos\n", votos13);
        System.out.printf("Bolsonaro: %d votos\n", votos22);
    }
}
