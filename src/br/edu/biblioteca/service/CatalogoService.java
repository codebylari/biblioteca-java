package br.edu.biblioteca.service;

import br.edu.biblioteca.model.Livro;
import br.edu.biblioteca.structures.Vetor;
import br.edu.biblioteca.structures.ArvoreBST;

public class CatalogoService {

    private Vetor<Livro> livros;
    private ArvoreBST<String, Livro> indicePorIsbn;

    public CatalogoService() {
        livros = new Vetor<>(100);
        indicePorIsbn = new ArvoreBST<>();
    }

    public void cadastrarLivro(Livro livro) {
        livros.add(livro);
        indicePorIsbn.put(livro.getIsbn(), livro);
    }

    public Livro buscarPorIsbn(String isbn) {
        return indicePorIsbn.get(isbn);
    }

    public void listarLivros() {
        for (int i = 0; i < livros.size(); i++) {
            System.out.println(livros.get(i).getTitulo());
        }
    }
}