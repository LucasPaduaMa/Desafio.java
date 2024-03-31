import java.util.Scanner;

public class MainJogador {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite o nome do jogador: ");
        String nome = leitor.nextLine();

        Jogador player = new Jogador(nome);

        player.exibirInformacoes();

        System.out.print("Quantos pontos foram conquistados na ultima aventura? ");
        int pontos = leitor.nextInt();

        player.aumentarPontuacao(pontos);

        player.exibirInformacoes();

    }
}
