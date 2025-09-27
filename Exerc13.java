import java.util.Scanner;

public class Exerc13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char Resp;

        while (true) {
            System.out.print("---- Gerador de Tabuada ------\n");
            System.out.print("Qual tabuada desejas ver?\n");
            int tabuada = sc.nextInt();

            for (int i=1; i<=10; i++){
                System.out.printf("%d * %d = %d\n", i, tabuada, i*tabuada);
            }

            System.out.print("Desejas continuar? [S][N]\n");
            Resp = sc.next().toUpperCase().charAt(0);

            if (Resp == 'S') {
                continue;
            } else if (Resp == 'N') {
                break;
            } else {
                System.out.print("Resposta inválida\n");
            }
        }
    }
}
