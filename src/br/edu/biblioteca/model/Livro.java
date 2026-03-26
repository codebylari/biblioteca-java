package br.edu.biblioteca.model;

import java.util.List;

public class Livro {

    private String isbn;
    private String titulo;
    private int ano;
    private List<Categoria> categorias;
    private List<Autor> autores;
    private List<String> palavrasChave;

    public Livro(String isbn, String titulo, int ano,
                 List<Categoria> categorias,
                 List<Autor> autores,
                 List<String> palavrasChave) {

        this.isbn = isbn;
        this.titulo = titulo;
        this.ano = ano;
        this.categorias = categorias;
        this.autores = autores;
        this.palavrasChave = palavrasChave;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getAno() {
        return ano;
    }

    public List<Categoria> getCategorias() {
        return categorias;
    }

    public List<Autor> getAutores() {
        return autores;
    }

    public List<String> getPalavrasChave() {
        return palavrasChave;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
}