import java.util.ArrayList;
import java.util.Scanner;

public class Exerc4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Declaração de variáveis
        boolean playagain=true, playagain2 = true;
        char resposta;
        ArrayList<Double> receitas = new ArrayList<>();
        ArrayList<Double> despesas = new ArrayList<>();
        int x=1;
        double aux, somaRec=0, somaDesp=0;

        // Inserir receitas
        do {
            System.out.printf("Receita %dº: ", x++);
            aux = sc.nextDouble();
            receitas.add(aux);
            somaRec += aux;

            // Verifica se quer mais
            System.out.print("Continuar? [S][N]\n");
            resposta = sc.next().toUpperCase().charAt(0);
            if (resposta == 'N') {
                playagain = false;
            }
        } while (playagain == true);

        // reseta o x
        x=1;

        // Inserir despesas
        do {
            System.out.printf("Despesa %dº: ", x++);
            aux = sc.nextDouble();
            receitas.add(aux);
            somaDesp += aux;

            // Verifica se quer mais
            System.out.print("Continuar? [S][N]\n");
            resposta = sc.next().toUpperCase().charAt(0);
            if (resposta == 'N') {
                playagain2 = false;
            }
        } while (playagain2 == true);

        // Calcular o saldo
        double saldo = somaRec - somaDesp;

        // Alerta Pobre
        if (saldo < 0) {
            System.out.println("Alerta!! Saldo negativo!!");
        }
        System.out.printf("Saldo atual: %.2f", saldo);
    }
}
