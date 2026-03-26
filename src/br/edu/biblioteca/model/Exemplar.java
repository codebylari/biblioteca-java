package br.edu.biblioteca.model;

public class Exemplar {

    private int id;
    private String isbnLivro;
    private String status; // DISPONIVEL, EMPRESTADO, RESERVADO, INATIVO

    public Exemplar(int id, String isbnLivro, String status) {
        this.id = id;
        this.isbnLivro = isbnLivro;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public String getIsbnLivro() {
        return isbnLivro;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}