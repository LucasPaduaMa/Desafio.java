public class Banco {
    
    private String titularConta;
    private int numeroConta;
    private double saldoConta;

    Banco(int numconta, String nometit){
        numeroConta = numconta;
        titularConta = nometit;
        saldoConta = 0.0;
    }

    void depositar(double valor) {
        if (valor > 0) {
            saldoConta += valor;
            System.out.println("Depósito de R$" + valor + " realizado com sucesso.");
        } else {
            System.out.println("Valor de depósito inválido.");
        }
    }

    void sacar(double valor) {
        if (valor > 0 && saldoConta >= valor) {
            saldoConta -= valor;
            System.out.println("Saque de R$" + valor + " realizado com sucesso.");
        } else {
            System.out.println("Saldo insuficiente ou valor de saque inválido.");
        }
    }


    double Saldo() {
        return saldoConta;
    }
}
