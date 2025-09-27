import java.util.Scanner;

public class Exerc6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean nacionalidade;

        System.out.print("Digite sua idade: \n");
        int idade = sc.nextInt();

        System.out.print("Você é brasileiro? [S][N] \n");
        String brasileiro = sc.next().toUpperCase();
        if (brasileiro.equals("S")) {
            nacionalidade = true;
        } else {
            nacionalidade = false;
        }

        if (idade >= 16 && nacionalidade == true) {
            System.out.print("Você pode votar!");
        } else {
            System.out.print("Você NÃO pode votar!");
        }
    }
}
