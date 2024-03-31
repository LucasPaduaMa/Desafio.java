import java.util.Scanner;


public class MainCarro {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite a marca do carro: ");
        String marca = leitor.nextLine();

        System.out.print("Digite o modelo do carro: ");
        String modelo = leitor.nextLine();

        System.out.print("Digite o ano do carro: ");
        int ano = leitor.nextInt();

        leitor.nextLine();

        System.out.print("Digite a placa do carro: ");
        String placa = leitor.nextLine();


        Carro Carro1 = new Carro(marca, modelo, ano, placa);

        Carro1.exibirInformacoes();

        System.out.print("\n--O que deseja fazer?--\n");

        System.out.println("[1] Acelerar o carro");
        System.out.println("[2] Frear o carro");
        System.out.println("[3] Desligar o carro\n");

        int escolha = leitor.nextInt();

        leitor.nextLine();

        switch (escolha) {
            case 1:
                
            System.out.print("Quanto deseja acelerar?");
            double maisVelocidade = leitor.nextDouble(); 

            Carro1.acelerar(maisVelocidade);

                break;
            case 2:  

            System.out.print("Quanto deseja frear?");
            double menosVelocidade = leitor.nextDouble(); 


            Carro1.frear(menosVelocidade);

                break;
            case 3:
                
            System.out.println("Carro desligado");

                break;
        }

        Carro1.exibirInformacoes();

}
}