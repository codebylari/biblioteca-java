package br.edu.biblioteca.structures;

public class ArvoreBST<K extends Comparable<K>, V> {

    private class No {
        K chave;
        V valor;
        No esquerda, direita;

        public No(K chave, V valor) {
            this.chave = chave;
            this.valor = valor;
        }
    }

    private No raiz;

    // INSERIR
    public void put(K chave, V valor) {
        raiz = inserir(raiz, chave, valor);
    }

    private No inserir(No atual, K chave, V valor) {
        if (atual == null) {
            return new No(chave, valor);
        }

        int cmp = chave.compareTo(atual.chave);

        if (cmp < 0) {
            atual.esquerda = inserir(atual.esquerda, chave, valor);
        } else if (cmp > 0) {
            atual.direita = inserir(atual.direita, chave, valor);
        } else {
            atual.valor = valor;
        }

        return atual;
    }

    // BUSCAR
    public V get(K chave) {
        return buscar(raiz, chave);
    }

    private V buscar(No atual, K chave) {
        if (atual == null) return null;

        int cmp = chave.compareTo(atual.chave);

        if (cmp < 0) {
            return buscar(atual.esquerda, chave);
        } else if (cmp > 0) {
            return buscar(atual.direita, chave);
        } else {
            return atual.valor;
        }
    }
}