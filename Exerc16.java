import java.util.Scanner;

public class Exerc16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1=0, n2=1, qnt, i=1;

        System.out.print("Números impares de fibonacci: ");
        qnt = sc.nextInt();

        System.out.print("Sequência de Fibonacci sem os Pares\n");
        while (i <= qnt ){
            if (n1 == 0) {
                n1+=n2;
            } else {
                if (n1%2!=0){
                    System.out.printf("%d\n", n1);
                    i++;
                }
                n1+=n2;
                if (n2 % 2 != 0){
                    System.out.printf("%d\n", n2);
                    i++;
                }
                n2+=n1;
            }
        }
    }
}
