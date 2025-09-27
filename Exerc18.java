import java.util.Scanner;

public class Exerc181 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String CPF;

        System.out.println("- - - - -  Validador de CPF - - - - - ");
        System.out.println("Digite o CPF (sem pontos ou traços): ");
        CPF = sc.nextLine();

        if (validarCPF(CPF)) {
            System.out.print("Parabéns! Seu CPF é válido, você existe!\n");
        } else {
            System.out.print("CPF inválido!\n");
        }
    }

    public static boolean validarCPF(String CPF) {
        // tamanho certo
        if (CPF.length() != 11) {
            return false;
        }

        // verifica se todos os números são iguais
        boolean repetido = true;
        for (int i = 1; i < CPF.length(); i++) {
            if (CPF.charAt(i) != CPF.charAt(0)) {
                repetido = false;
                break;
            }
        }
        if (repetido) return false;

        // verificação do primeiro dígito
        int peso = 10, soma = 0;
        for (int i = 0; i < 9; i++) {
            soma += (CPF.charAt(i) - '0') * peso;
            peso--;
        }
        int resto = soma % 11;
        
        int dig1;
        if (resto < 2) {
            dig1 = 0;
        } else {
            dig1 = 11 - resto;
        }
        if (dig1 != (CPF.charAt(9) - '0')) {
            return false;
        }

        // verificação do segundo dígito
        peso = 11;
        soma = 0;
        for (int i = 0; i < 10; i++) {
            soma += (CPF.charAt(i) - '0') * peso;
            peso--;
        }
        resto = soma % 11;
        int dig2;
        if (resto < 2) {
            dig2 = 0;
        } else {
            dig2 = 11 - resto;
        }
        if (dig1 != (CPF.charAt(9) - '0')) {
            return false;
        }
        if (dig2 != (CPF.charAt(10) - '0')) {
            return false;
        }

        return true; // passou em todas as validações
    }
}
