import java.util.Scanner;

public class Exerc12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean valor=false;
        char clima, estacao='p';

        do {
            System.out.print("[S] Sol\n");
            System.out.print("[C] Chuva\n");

            System.out.print("Qual o clima de hoje? ");
            clima = sc.next().toUpperCase().charAt(0);

            if (clima == 'S' || clima == 'C'){
                break;
            } else {
                System.out.print("Clima inválido");
            }
        } while (true);

        System.out.print("Qual a temperatura de hoje? ");
        int temperatura = sc.nextInt();

        do {
            System.out.print("[P] Primavera\n");
            System.out.print("[V] Verão\n");
            System.out.print("[O] Outono\n");
            System.out.print("[I] Inverno\n");

            System.out.print("Qual a estação?: ");
            estacao = sc.next().toUpperCase().charAt(0);

            if (estacao == 'P' || estacao == 'V' || estacao == 'O' || estacao == 'I'){
                break;
            } else {
                System.out.print("Estação inválido");
            }
        } while (true);


        switch(estacao){
            // Primavera
            case 'P':
                // Com sol e - de 20ºC
                if (clima == 'S' && temperatura <= 20){
                    System.out.print("Use uma blusa e calça\n");
                // Com sol e + de 20ºC
                } else if (clima == 'S' && temperatura > 20){
                    System.out.print("Use uma camisa e shorts\n");
                // Com chuva e - de 20ºC
                } else if (clima == 'C' && temperatura <= 20){
                    System.out.print("Use duas blusas, calça e leve o guarda-chuva\n");
                // Com chuva e + de 20ºC
                } else {
                    System.out.print("Use uma blusas, calça e leve o guarda-chuva\n");
                }
                break;
            // Verão
            case 'V':
                // Com sol e - de 20ºC
                if (clima == 'S' && temperatura <= 20){
                    System.out.print("Use uma blusa e calça\n");
                // Com sol e + de 20ºC
                } else if (clima == 'S' && temperatura > 20){
                    System.out.print("Use uma camisa e shorts\n");
                // Com chuva e - de 20ºC
                } else if (clima == 'C' && temperatura <= 20){
                    System.out.print("Use uma blusa, calça e leve o guarda-chuva\n");
                // Com chuva e + de 20ºC
                } else {
                    System.out.print("Use uma camisa, calça e leve o guarda-chuva\n");
                }
                break;
            // Outono
            case 'O':
                // Com sol e - de 20ºC
                if (clima == 'S' && temperatura <= 20){
                    System.out.print("Use duas blusas e calça, considere usar uma touca\n");
                // Com sol e + de 20ºC
                } else if (clima == 'S' && temperatura > 20){
                    System.out.print("Use uma blusa e calça\n");
                // Com chuva e - de 20ºC
                } else if (clima == 'C' && temperatura <= 20){
                    System.out.print("Use duas/três blusas, calça, considere usar uma touca e leve o guarda-chuva\n");
                // Com chuva e + de 20ºC
                } else {
                    System.out.print("Use uma/duas blusas, calça e leve o guarda-chuva\n");
                }
                break;
            // Inverno
            case 'I':
                // Com sol e - de 20ºC
                if (clima == 'S' && temperatura <= 20){
                    System.out.print("Use três blusas, uma/duas calças, use uma touca e/ou cachecol\n");
                // Com sol e + de 20ºC
                } else if (clima == 'S' && temperatura > 20){
                    System.out.print("Use duas blusas, uma calça e considere usar uma touca\n");
                // Com chuva e - de 20ºC
                } else if (clima == 'C' && temperatura <= 20){
                    System.out.print("Use três/quatro blusas, duas calças, use uma touca e leve o guarda-chuva\n");
                // Com chuva e + de 20ºC
                } else {
                    System.out.print("Use uma/duas blusas, calça, use uma touca e leve o guarda-chuva\n");
                }
                break;
        }



    }
}

