package br.edu.biblioteca.model;

import java.time.LocalDate;

public class Reserva {

    private int id;
    private int usuarioId;
    private String isbnLivro;
    private LocalDate dataReserva;
    private String status; // RESERVADO

    public Reserva(int id, int usuarioId, String isbnLivro,
                   LocalDate dataReserva, String status) {

        this.id = id;
        this.usuarioId = usuarioId;
        this.isbnLivro = isbnLivro;
        this.dataReserva = dataReserva;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public int getUsuarioId() {
        return usuarioId;
    }

    public String getIsbnLivro() {
        return isbnLivro;
    }

    public LocalDate getDataReserva() {
        return dataReserva;
    }

    public String getStatus() {
        return status;
    }
}