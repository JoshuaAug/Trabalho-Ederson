import java.util.Scanner;

public class Exerc18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String CPF;

        System.out.println("- - - - -  Validador de CPF - - - - - ");
        System.out.println("Digite o CPF (sem pontos ou traços): ");
        CPF = sc.nextLine();

        // tamanho certo
        if (CPF.length() != 11) {
            System.out.print("CPF inválido!\n");
            System.exit(0);
        } else {
            System.out.println("CPF primeiramente valido!\n");
        }

        int verificador=0;

        // verifica se os números são enguais
        for (int i = 0; i < CPF.length(); i++) {
            if (CPF.charAt(i) == CPF.charAt(0)) {
                verificador++;
            }
        }

        // segundo etapa de verificação
        if (verificador > 7) {
            System.out.print("CPF inválido!");
            System.exit(0);
        } else {
            System.out.print("CPF segundamente válido!\n");
        }


        // verificação do primeiro ultimo digito
        int peso=10, resul=0, mult;
        for (int i = 0; i < 9; i++) {
            mult=0;
            mult = Integer.parseInt(String.valueOf(CPF.charAt(i)))*peso;
            peso = peso - 1;
            resul +=mult;
        }
        int resto = resul % 11;
        int dig1=Integer.parseInt(String.valueOf(CPF.charAt(9)));

        if (resto < 2) {
            if (dig1 == 0) {
                System.out.print("CPF terceiramente válido!\n");
            } else {
                System.out.print("CPF inválido!\n");
                System.exit(0);
            }
        } else {
            if ((11-resto) != dig1) {
                System.out.print("CPF inválido!\n");
                System.exit(0);
            } else {
                System.out.print("CPF terceiramente válido!\n");
            }
        }

        // verificação do segundo ultimo digito
        int peso2=11, resul2=0, mult2;
        for (int i = 0; i < 10; i++) {
            mult2=0;
            mult2 = Integer.parseInt(String.valueOf(CPF.charAt(i)))*peso2;
            peso2 = peso2 - 1;
            resul2 +=mult2;
        }
        int resto2 = resul2 % 11;
        int dig2=Integer.parseInt(String.valueOf(CPF.charAt(10)));

        if (resto2 < 2) {
            if (dig2 == 0) {
                System.out.print("CPF quartamente válido!\n");
            } else {
                System.out.print("CPF inválido!\n");
                System.exit(0);
            }
        } else {
            if ((11-resto2) != dig2) {
                System.out.print("CPF inválido!\n");
                System.exit(0);
            } else {
                System.out.print("CPF quartamente válido!\n");
            }
        }

        System.out.print("Parabens! Seu CPF é válido, você existe!\n");

    }
}
