package br.edu.biblioteca.service;

import br.edu.biblioteca.model.Reserva;
import br.edu.biblioteca.structures.MinhaFila;

public class ReservaService {

    private MinhaFila<Reserva> filaReservas;

    public ReservaService() {
        filaReservas = new MinhaFila<>(100);
    }

    public void reservarLivro(Reserva reserva) {
        filaReservas.enqueue(reserva);
    }

    public Reserva atenderProximaReserva() {
        return filaReservas.dequeue();
    }
}