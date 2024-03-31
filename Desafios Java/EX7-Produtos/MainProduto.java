public class MainContato {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Contato> agenda = new ArrayList<>();

       
        while (true) {
            System.out.println("\n1. Adicionar Contato");
            System.out.println("2. Remover Contato");
            System.out.println("3. Buscar Contato");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcao) {
                case 1:
                    System.out.print("Nome: ");
                    String nome = scanner.nextLine();

                    System.out.print("Email: ");
                    String email = scanner.nextLine();

                    System.out.print("Telefone: ");
                    String telefone = scanner.nextLine();

                    Contato novoContato = new Contato(nome, email, telefone);
                    agenda.add(novoContato);

                    System.out.println("Contato adicionado com sucesso!");
                    break;

                case 2:
                    System.out.print("Nome do contato a ser removido: ");
                    String nomeRemover = scanner.nextLine();
                    boolean removido = false;

                    for (Contato contato : agenda) {
                        if (contato.getNome().equalsIgnoreCase(nomeRemover)) {
                            agenda.remove(contato);
                            removido = true;
                            break;
                        }
                    }
                    if (removido) {
                        System.out.println("Contato removido com sucesso!");
                    } else {
                        System.out.println("Contato não encontrado!");
                    }
                    break;

                case 3:
                    System.out.print("Nome do contato a ser buscado: ");
                    String nomeBuscar = scanner.nextLine();
                    boolean encontrado = false;
                    
                    for (Contato contato : agenda) {
                        if (contato.getNome().equalsIgnoreCase(nomeBuscar)) {
                            contato.mostrarInformacoes();
                            encontrado = true;
                            break;
                        }
                    }
                    if (!encontrado) {
                        System.out.println("Contato não encontrado!");
                    }
                    break;
                case 4:
                    System.out.println("Saindo...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        }
    }
}
