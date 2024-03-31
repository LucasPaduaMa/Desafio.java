public class Jogador {
    private String nome;
    private int pontuacao;
    private int nivel;
    
    public Jogador(String nome) {
        this.nome = nome;
        this.pontuacao = 0;
        this.nivel = 0;
    }
    
    public void aumentarPontuacao(int pontos) {
        if (pontos > 0) {
            pontuacao += pontos;
            System.out.println("Pontuação de " + nome + " aumentada em " + pontos + " pontos.");
    
            int niveisGanhos = pontuacao / 100;
            if (niveisGanhos > 0) {
                nivel += niveisGanhos;
                System.out.println(nome + " subiu " + niveisGanhos + " lvl.");
            }
        } else {
            System.out.println("Pontuação deve ser um valor positivo.");
        }
    }
    
    public void exibirInformacoes() {
        System.out.println("~Nome: " + nome);
        System.out.println("~Pontuação: " + pontuacao);
        System.out.println("~Nível: " + nivel);
    }
    
    public String getNome() {
        return nome;
    }
    
    public int getPontuacao() {
        return pontuacao;
    }
    
    public int getNivel() {
        return nivel;
    }
}