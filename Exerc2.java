import java.util.Scanner;

public class Exerc2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        char unidadeAtual, unidadeDestino;
        String auxLer1, auxLer2;

        // Lê unidade atual
        do {
            System.out.print("-- Conversor de Temperaturas --\n");
            System.out.print("-- Digite a unidade atual --\n");
            System.out.print("[C] Celsius [F] Fahrenheit [K] Kelvin\n");
            auxLer1 = sc.nextLine().toUpperCase();
            unidadeAtual = auxLer1.charAt(0);

            if (unidadeAtual != 'F' && unidadeAtual != 'C' && unidadeAtual != 'K') {
                System.out.print("Unidade inválida!\n");
            }
        } while (unidadeAtual != 'F' && unidadeAtual != 'C' && unidadeAtual != 'K');

        // Lê temperatura
        System.out.print("Digite o valor da temperatura atual: ");
        double temperatura = sc.nextDouble();
        sc.nextLine(); // consome o \n
        double temperaturaConv;

        // Lê unidade destino
        do {
            System.out.print("-- Digite a unidade destino --\n");
            System.out.print("[C] Celsius [F] Fahrenheit [K] Kelvin\n");
            auxLer2 = sc.nextLine().toUpperCase();
            unidadeDestino = auxLer2.charAt(0);

            if ((unidadeDestino != 'F' && unidadeDestino != 'C' && unidadeDestino != 'K')
                    || unidadeDestino == unidadeAtual) {
                System.out.print("Unidade inválida!\n");
            }
        } while ((unidadeDestino != 'F' && unidadeDestino != 'C' && unidadeDestino != 'K')
                || unidadeDestino == unidadeAtual);

        // Conversão
        if (unidadeAtual == 'F') {
            if (unidadeDestino == 'K') {
                temperaturaConv = (temperatura - 32) / 1.8 + 273.15;
            } else { // Celsius
                temperaturaConv = (temperatura - 32) / 1.8;
            }
        } else if (unidadeAtual == 'C') {
            if (unidadeDestino == 'K') {
                temperaturaConv = temperatura + 273.15;
            } else { // Fahrenheit
                temperaturaConv = temperatura * 1.8 + 32;
            }
        } else { // Kelvin
            if (unidadeDestino == 'C') {
                temperaturaConv = temperatura - 273.15;
            } else { // Fahrenheit
                temperaturaConv = (temperatura - 273.15) * 1.8 + 32;
            }
        }

        System.out.printf("A temperatura na nova unidade é %.2f%n", temperaturaConv);

        sc.close();
    }
}