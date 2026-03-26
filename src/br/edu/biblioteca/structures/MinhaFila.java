package br.edu.biblioteca.structures;

public class MinhaFila<T> {

    private Object[] elementos;
    private int inicio;
    private int fim;
    private int tamanho;

    public MinhaFila(int capacidade) {
        elementos = new Object[capacidade];
        inicio = 0;
        fim = 0;
        tamanho = 0;
    }

    public void enqueue(T elemento) {
        if (tamanho < elementos.length) {
            elementos[fim] = elemento;
            fim = (fim + 1) % elementos.length;
            tamanho++;
        } else {
            System.out.println("Fila cheia!");
        }
    }

    public T dequeue() {
        if (tamanho == 0) return null;

        T elemento = (T) elementos[inicio];
        inicio = (inicio + 1) % elementos.length;
        tamanho--;
        return elemento;
    }

    public T peek() {
        if (tamanho == 0) return null;
        return (T) elementos[inicio];
    }

    public boolean isEmpty() {
        return tamanho == 0;
    }
}