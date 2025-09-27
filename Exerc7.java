import java.util.Scanner;

public class Exerc7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Valor da compra: ");
        double valorCompra = sc.nextDouble();
        double desconto=0;

        if (valorCompra > 500) {
            desconto = 0.75;
        } else if (valorCompra > 100) {
            desconto = 0.9;
        }

        valorCompra = valorCompra * desconto;

        System.out.printf("Valor Final: R$%.2f", valorCompra);
    }
}
