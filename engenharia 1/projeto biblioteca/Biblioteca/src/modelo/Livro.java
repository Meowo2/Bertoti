package modelo;

public class Livro {
    
    private String titulo;
    private String autor;
    private Data dataPublicacao;
    private int numeroISBN;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Data getDataPublicacao() {
        return dataPublicacao;
    }

    public void setDataPublicacao(Data dataPublicacao) {
        this.dataPublicacao = dataPublicacao;
    }

    public int getNumeroISBN() {
        return numeroISBN;
    }

    public void setNumeroISBN(int numeroISBN) {
        this.numeroISBN = numeroISBN;
    }
    
    public String getInformacoes(){
        return "Título: " + titulo + "\n" +
               "Autor: " + autor + "\n" +
               "Data De Publicação: " + dataPublicacao.formataData() + "\n" +
               "ISBN: " + numeroISBN + "\n";
    }
    
}
