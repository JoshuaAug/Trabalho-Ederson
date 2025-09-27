import java.util.Scanner;

public class Exerc11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean temNum=false, maior8=false, temMaiusc=false, temMinusc=false;
        int ClashRoyal=0;

        System.out.print("Digite sua senha: ");
        String senha = sc.nextLine();

        // if >= 8
        if (senha.length() >= 8) {
            maior8 = true;
        }

        // if tem maiscula, if tem minuscula e if tem num
        for (char s : senha.toCharArray()) { // Converte a string em um array de caracteres
            if (Character.isUpperCase(s)) {
                temMaiusc = true;
            }
            if (Character.isDigit(s)) {
                temNum = true;
            }
            if (Character.isLowerCase(s)) {
                temMinusc = true;
            }
        }

        // classificação

        // pequnenos
        if (senha.length() >= 3 && senha.length() <= 5) {
            // so num
            if (temNum == true) {
                ClashRoyal++;
            }
            if (temMaiusc == true) {
                ClashRoyal++;
            }
            if (temMinusc == true) {
                ClashRoyal++;
            }
        }


        // medios
        if (senha.length() >= 6 && senha.length() <= 10) {
            // so num
            if (temNum == true) {
                ClashRoyal+=2;
            }
            if (temMaiusc == true) {
                ClashRoyal+=2;
            }
            if (temMinusc == true) {
                ClashRoyal+=2;
            }
        }

        // grandes
        if (senha.length() >= 11) {
            // so num
            if (temNum == true) {
                ClashRoyal+=3;
            }
            if (temMaiusc == true) {
                ClashRoyal+=3;
            }
            if (temMinusc == true) {
                ClashRoyal+=3;
            }
        }

        // switch de prints
        switch(ClashRoyal) {
            case 1:
                System.out.print("Sua senha é fraca e você é beta!");
                break;
            case 2:
                System.out.print("Sua senha é fraca e você é beta!");
                break;
            case 3:
                System.out.print("Sua senha é fraca e você é beta!");
                break;
            case 4:
                System.out.print("Sua senha é fraca e você é beta!");
                break;
            case 5:
                System.out.print("Sua senha é moderada, melhore.");
                break;
            case 6:
                System.out.print("Sua senha é moderada, melhore.");
                break;
            case 7:
                System.out.print("Sua senha é moderada, melhore.");
                break;
            case 8:
                System.out.print("Sua senha é forte, você é um alpha!");
                break;
            case 9:
                System.out.print("Sua senha é forte, você é um alpha!");
                break;
        }
    }
}
