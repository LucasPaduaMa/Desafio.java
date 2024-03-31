import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainBiblioteca {
    
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        List<Biblioteca> stand = new ArrayList<Biblioteca>();

        System.out.print("Quantos livros deseja cadastrar? ");
        int quant = leitor.nextInt();

        leitor.nextLine();

        for(int i = 0; i < quant; i++){

            System.out.print("\nDigite o titulo do livro ["+ (i+1) +"]: ");
            String tit = leitor.nextLine();

            System.out.print("Digite o autor do livro ["+ (i+1) +"]: ");
            String aut = leitor.nextLine();

            System.out.print("Digite o ano do livro ["+ (i+1) +"]: ");
            int year = leitor.nextInt();

            leitor.nextLine();

            Biblioteca novoLivro = new Biblioteca(tit, aut, year);
            stand.add(novoLivro);

            System.out.println("Informações do livro ["+ (i+1)+ "]: ");

            novoLivro.exibirInfo(true);

        }
        leitor.close();
    }
}
