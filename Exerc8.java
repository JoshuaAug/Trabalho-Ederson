import java.util.Scanner;

public class Exerc8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o coeficiente A: ");
        double a = sc.nextDouble();

        System.out.println("Digite o coeficiente B: ");
        double b = sc.nextDouble();

        System.out.println("Digite o coeficiente C: ");
        double c = sc.nextDouble();

        double resultado = Math.pow(b, 2) - 4 * a * c ;

        System.out.printf("Resultado da equação b² - 4ac: %.0f\n", resultado);
    }
}
