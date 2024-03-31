import java.util.Scanner;

public class MainBanco {
    
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o número da conta:");
        int numeroConta = leitor.nextInt();

        System.out.println("Digite o nome do titular:");
        leitor.nextLine();
        String nomeTitular = leitor.nextLine();

        Banco conta = new Banco(numeroConta, nomeTitular);

        System.out.println("\n1 - Depositar");
        System.out.println("\n2 - Sacar");
        System.out.println("\n3 - Verificar Saldo");
        int escolha = leitor.nextInt();
        leitor.nextLine();

        if (escolha > 0) {

        switch (escolha) {
            case 1:
                
            System.out.println("Digite o valor a ser depositado:");
           
            double valorDeposito = leitor.nextDouble();
            conta.depositar(valorDeposito);

                return;
        
            case 2:
            
            System.out.println("Digite o valor a ser sacado:");
            
            double valorSaque = leitor.nextDouble();
            conta.sacar(valorSaque);

                return;

            case 3:
            
            double saldoAtual = conta.Saldo();
            System.out.println("Saldo atual: R$" + saldoAtual);
    
                return;
        }
        }
    }
}
