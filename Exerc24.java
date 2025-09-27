import java.util.Scanner;
import java.util.ArrayList;

public class Exerc24 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        ArrayList<Double> tempDiaria = new ArrayList<>();
        ArrayList<Double> variacaoDiaria = new ArrayList<>();
        double media=0;
        int i;

        for (i=0;i<5;i++){
            System.out.printf("Temperatura da %dºfeira: \n", i+2);
            tempDiaria.add(leitor.nextDouble());
            media += tempDiaria.get(i);
        }
        System.out.printf("A temperatura média da semana foi %.1fºC\n", media/i);

        // vai calculando as variações
        for (i=0;i<4;i++) {
            variacaoDiaria.add(tempDiaria.get(i) - tempDiaria.get(i+1));
            System.out.printf("De %dºfeira para %dºfeira houve uma variação de %.1fºC\n", i+2, i+3, Math.abs(variacaoDiaria.get(i)));
        }


    }
}
