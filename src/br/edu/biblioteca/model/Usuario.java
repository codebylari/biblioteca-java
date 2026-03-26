package br.edu.biblioteca.model;

public class Usuario {

    private int id;
    private String nome;
    private String tipo; // ALUNO, PROFESSOR, SERVIDOR
    private String email;

    public Usuario(int id, String nome, String tipo, String email) {
        this.id = id;
        this.nome = nome;
        this.tipo = tipo;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getTipo() {
        return tipo;
    }

    public String getEmail() {
        return email;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}