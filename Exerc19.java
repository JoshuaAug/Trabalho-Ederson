import java.util.Scanner;

public class Exerc19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] moeda= {0, 0};

        System.out.print("- - Conversor de Moedas - -\n");
        System.out.print("[1] Real\n");
        System.out.print("[2] Dólar\n");
        System.out.print("[3] Euro\n");
        System.out.print("Qual a moeda de origem: ");
        moeda[0] = sc.nextInt();

        System.out.print("Digite o valor: ");
        double valor = sc.nextDouble();

        System.out.print("[1] Real\n");
        System.out.print("[2] Dólar\n");
        System.out.print("[3] Euro\n");
        System.out.print("Qual a moeda de destino: ");
        moeda[1] = sc.nextInt();

        // cada conversão
        // moeda origem
        switch(moeda[0]){
            // real
            case 1:
                switch(moeda[1]){
                    // dolar
                    case 2:
                        valor = valor * 0.19;
                        System.out.printf("O valor fornecido em dolar US$%.2f\n", valor);
                        break;
                    // euro
                    case 3:
                        valor = valor * 0.16;
                        System.out.printf("O valor fornecido em euro €%.2f\n", valor);
                        break;
                    // caso nao seja nenhum
                    default:
                        System.out.print("Moeda destino inválida\n");
                    break;
                }
                break;
            // dolar
            case 2:
                switch(moeda[1]){
                    // real
                    case 1:
                        valor = valor * 5.34;
                        System.out.printf("O valor fornecido em real R$%.2f\n", valor);
                        break;
                    // euro
                    case 3:
                        valor = valor * 0.85;
                        System.out.printf("O valor fornecido em euro €%.2f\n", valor);
                        break;
                    // caso nao seja nenhum
                    default:
                        System.out.print("Moeda destino inválida\n");
                        break;
                }
                break;
            // euro
            case 3:
                switch(moeda[1]){
                    // real
                    case 1:
                        valor = valor * 6.29;
                        System.out.printf("O valor fornecido em real R$%.2f\n", valor);
                        break;
                    // dolar
                    case 2:
                        valor = valor * 1.18;
                        System.out.printf("O valor fornecido em dolar US$%.2f\n", valor);
                        break;
                    // caso nao seja nenhum
                    default:
                        System.out.print("Moeda destino inválida");
                        break;
                }
                break;
            // caso nao seja nenhum
            default:
                System.out.print("Moeda origem inválida\n");
                break;
        }
    }
}
