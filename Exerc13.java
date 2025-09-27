import java.util.Scanner;

public class Exerc13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean continuar = true, continuar2=true;
        char Resp;

        while (continuar==true) {
            System.out.print("---- Gerador de Tabuada ------\n");
            System.out.print("Qual tabuada desejas ver?\n");
            int tabuada = sc.nextInt();

            for (int i=1; i<=10; i++){
                System.out.printf("%d * %d = %d\n", i, tabuada, i*tabuada);
            }
            continuar2 = true;

            while (continuar2==true) {
                System.out.print("Desejas continuar? [S][N]\n");
                Resp = sc.next().toUpperCase().charAt(0);

                if (Resp == 'S') {
                    continuar = true;
                    continuar2 = false;
                } else if (Resp == 'N') {
                    continuar = false;
                    continuar2 = false;
                } else {
                    System.out.print("Resposta inválida\n");
                }
            }
        }
    }
}
