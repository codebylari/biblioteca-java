package br.edu.biblioteca.structures;

public class MinhaPilha<T> {

    private Object[] elementos;
    private int topo;

    public MinhaPilha(int capacidade) {
        elementos = new Object[capacidade];
        topo = -1;
    }

    public void push(T elemento) {
        if (topo < elementos.length - 1) {
            elementos[++topo] = elemento;
        } else {
            System.out.println("Pilha cheia!");
        }
    }

    public T pop() {
        if (topo == -1) return null;
        return (T) elementos[topo--];
    }

    public T peek() {
        if (topo == -1) return null;
        return (T) elementos[topo];
    }

    public boolean isEmpty() {
        return topo == -1;
    }
}