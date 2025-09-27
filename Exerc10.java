import java.util.Scanner;

public class Exerc10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Velocidade: ");
        double velocidade = sc.nextDouble();
        int limite = 40;

        System.out.print("[U] Verde \n");
        System.out.print("[A] Amarelo \n");
        System.out.print("[V] Vermelho \n");
        System.out.print("Sinal: \n");
        char sinal = sc.next().toUpperCase().charAt(0);

        // Dentro do limite
        if (velocidade < limite && sinal == 'U') {
            System.out.print("Não houve infração");
        } else if (velocidade < limite && sinal == 'A') {
            System.out.print("Não houve infração");
        } else if (velocidade < limite && sinal == 'V') {
            System.out.print("Multa de R$220,00");

        // Acima do limite
        } else if (velocidade > limite && sinal == 'U') {
            System.out.print("Multa de R$130,00");
        } else if (velocidade > limite && sinal == 'A') {
            System.out.print("Multa de R$130,00");
        } else if (velocidade > limite && sinal == 'V') {
            System.out.print("Multa de R$350,00");
        }
    }
}
