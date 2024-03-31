public class Biblioteca {

    String titulo;
    String autor;
    int ano;

    Biblioteca(String tit, String aut, int year){

        titulo = tit;
        autor = aut;
        ano = year;
        
    }

    void exibirInfo(boolean mostrar) {

        System.out.println("\n--Dados do livro--");
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Ano de Publicação: " + ano);
    }

}
