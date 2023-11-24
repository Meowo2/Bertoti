/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

import java.util.List;
import modelo.Biblioteca;
import modelo.Data;
import modelo.Livro;
import modelo.Membro;

/**
 *
 * @author Manhã
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Biblioteca b = new Biblioteca();
        
        Data d1 = new Data(25,07,2004);
        Membro m1 = new Membro("Arthur", d1, 1);
        
        Data d2 = new Data(03,10,2008);
        Membro m2 = new Membro("Fabio", d2, 2);
        
        Data d3 = new Data(15,10,2010);
        Livro l1 = new Livro("Titulo1", "Autor1", d3, 1);
        
        Data d4 = new Data(31,12,2012);
        Livro l2 = new Livro("Titulo2", "Autor2", d4, 2);
        
        b.adicionarLivro(l1);
        b.adicionarLivro(l2);
        
        b.adicionarMembro(m1);
        b.adicionarMembro(m2);
        
    }
    
}
