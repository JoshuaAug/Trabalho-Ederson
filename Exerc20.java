import java.util.Random;
import java.util.Scanner;

public class Exerc20 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        // "Base de dados(caracteres)" para gerar a senha
        String letras = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";

        System.out.print("Digite o tamanho da senha: ");
        int tamanho = leitor.nextInt();

        // Chama a função e já cria a variável da senha
        String senha = geradordeSenha(letras, tamanho);
        System.out.printf("A sua nova senha é \"%s\"", senha);
    }

    // Função Geradora de Senhas
    public static String geradordeSenha(String characters, int tamanho) {
        // Cria o randomizador
        Random random = new Random();

        // O pedreiro da senha e terreno da casa
        StringBuilder irmaosaobra = new StringBuilder(tamanho);

        // Vai puxando uma letra aleatória da "Base de Dados(String Letras)"
        for (int i = 0; i < tamanho; i++) {
            int indice = random.nextInt(characters.length());
            irmaosaobra.append(characters.charAt(indice));
        }

        return irmaosaobra.toString();
    }
}