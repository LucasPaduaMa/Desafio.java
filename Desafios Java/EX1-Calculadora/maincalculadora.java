import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class maincalculadora {
    
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        List<Calculadora> funçao = new ArrayList<Calculadora>();

        System.out.println("-- Calculadora ULTRA PLUS --\n");

        System.out.println("\nCamarada deseja?\n");

        System.out.println("+ Adição +\n");
        System.out.println("- Subtração -\n");
        System.out.println("x Multiplicação x\n");
        System.out.println("/ Divisão /\n");

        String escolha = leitor.nextLine();

        switch (escolha) {
            case ("+"):
            
            for(int i = 0; i < 1 ; i++){

                System.out.print("Digite o primeiro numero: ");
                float n1 = leitor.nextFloat();
    
                System.out.print("Digite o segundo numero: ");
                float n2 = leitor.nextFloat();

                Calculadora novaConta = new Calculadora(n1, n2);
                funçao.add(novaConta);

            novaConta.adiçao(true);
            }
                break;

            case ("-"):
                
            for(int i = 0; i < 1 ; i++){

                System.out.print("Digite o primeiro numero: ");
                float n1 = leitor.nextFloat();

                System.out.print("Digite o segundo numero: ");
                float n2 = leitor.nextFloat();
      
                Calculadora novaConta = new Calculadora(n1, n2);
                funçao.add(novaConta);

            novaConta.subtraçao(true);
            }
                break;

            case ("x"):
            
            for(int i = 0; i < 1 ; i++){

             System.out.print("Digite o primeiro numero: ");
                float n1 = leitor.nextFloat();

                System.out.print("Digite o segundo numero: ");
                float n2 = leitor.nextFloat();

                Calculadora novaConta = new Calculadora(n1, n2);
                funçao.add(novaConta);

            novaConta.divisao(true);
            }
                break;

            case ("/"):

            for(int i = 0; i < 1 ; i++){

                System.out.print("Digite o primeiro numero: ");
                float n1 = leitor.nextFloat();

                System.out.print("Digite o segundo numero: ");
                float n2 = leitor.nextFloat();

                Calculadora novaConta = new Calculadora(n1, n2);
                funçao.add(novaConta);

            novaConta.divisao(true);
            }
                break;
        }
    leitor.close();
    }
}