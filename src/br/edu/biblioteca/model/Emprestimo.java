package br.edu.biblioteca.model;

import java.time.LocalDate;

public class Emprestimo {

    private int id;
    private int usuarioId;
    private int exemplarId;
    private LocalDate dataEmprestimo;
    private LocalDate dataPrevista;
    private LocalDate dataDevolucao;
    private String status;

    public Emprestimo(int id, int usuarioId, int exemplarId,
                       LocalDate dataEmprestimo,
                       LocalDate dataPrevista,
                       LocalDate dataDevolucao,
                       String status) {

        this.id = id;
        this.usuarioId = usuarioId;
        this.exemplarId = exemplarId;
        this.dataEmprestimo = dataEmprestimo;
        this.dataPrevista = dataPrevista;
        this.dataDevolucao = dataDevolucao;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public int getUsuarioId() {
        return usuarioId;
    }

    public int getExemplarId() {
        return exemplarId;
    }

    public LocalDate getDataEmprestimo() {
        return dataEmprestimo;
    }

    public LocalDate getDataPrevista() {
        return dataPrevista;
    }

    public LocalDate getDataDevolucao() {
        return dataDevolucao;
    }

    public String getStatus() {
        return status;
    }

    public void setDataDevolucao(LocalDate dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}