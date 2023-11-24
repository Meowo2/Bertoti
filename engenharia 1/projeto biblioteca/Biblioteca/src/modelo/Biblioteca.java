package modelo;

import java.util.LinkedList;
import java.util.List;

public class Biblioteca {
    
    private List<Livro> livros;
    private List<Membro> membros;

    public Biblioteca(List<Livro> livros, List<Membro> membros) {
        this.livros = livros;
        this.membros = membros;
    }
    
    public void adicionarLivro(Livro livro){
        livros.add(livro);
    }
    
    public void adicionarMembro(Membro membro){
        membros.add(membro);
    }
    
    public List<Livro> buscarLivroPorNome(String nome){
        List<Livro> livrosAchados = new LinkedList<Livro>();
        for (Livro livro:livros){
            if ((livro.getTitulo()).equals(nome)) {
                livrosAchados.add(livro);
            }
        }
        return livrosAchados;
    }
    
    public Livro buscarLivroPorISBN(int isbn){
        Livro livroAchado = null;
        for (Livro livro:livros){
            if ((livro.getNumeroISBN()) == isbn) {
                livroAchado = livro;
            }
        }
        return livroAchado;
    }
    
    public List<Membro> buscarMembroPorNome(String nome){
        List<Membro> membrosAchados = new LinkedList<Membro>();
        for (Membro membro:membros){
            if ((membro.getNome()).equals(nome)) {
                membrosAchados.add(membro);
            }
        }
        return membrosAchados;
    }
    
    public Membro buscarMembroPorCodigo(int codigo){
        Membro membroAchado = null;
        for (Membro membro:membros){
            if ((membro.getCodigo()) == codigo) {
                membroAchado = membro;
            }
        }
        return membroAchado;
    }
    
}
