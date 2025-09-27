import java.util.Scanner;

public class Exerc12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean valor=false;
        char clima;

        do {
            System.out.print("[S] Sol\n");
            System.out.print("[C] Chuva\n");

            System.out.print("Qual o clima de hoje? ");
            clima = sc.next().toUpperCase().charAt(0);

            if (clima == 'S' || clima == 'C'){
                valor = true;
            } else {
                System.out.print("Clima inválido");
            }
        } while (valor == false);

        System.out.print("Qual a temperatura de hoje? ");
        int temperatura = sc.nextInt();

        // com sol
        // sol e - de 20
        if (clima == 'S' && temperatura <= 20) {
            System.out.print("Leve um casaco caso faça mais frio");

        // sol e + de 21
        } else if (clima == 'S' && temperatura > 20) {
            System.out.print("Use roupas frescas, a previsão é de calor");

        // chuva
        // chuva e - de 20
        } else if (clima == 'C' && temperatura <= 20) {
            System.out.print("Leve guarda chuva e roupas quentes");
        // chuva e - de 20
        } else {
            System.out.print("Leve guarda chuva e roupas mais amenas");
        }
    }
}
