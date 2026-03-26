package br.edu.biblioteca.structures;

public class Vetor<T> {

    private Object[] elementos;
    private int size;

    public Vetor(int capacidade) {
        elementos = new Object[capacidade];
        size = 0;
    }

    public void add(T elemento) {
        if (size < elementos.length) {
            elementos[size] = elemento;
            size++;
        } else {
            System.out.println("Vetor cheio!");
        }
    }

    public T get(int index) {
        return (T) elementos[index];
    }

    public void remove(int index) {
        for (int i = index; i < size - 1; i++) {
            elementos[i] = elementos[i + 1];
        }
        size--;
    }

    public int size() {
        return size;
    }
}