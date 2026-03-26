# 📚 Sistema de Biblioteca em Java

Projeto desenvolvido para a disciplina de Construção de Dados, com o objetivo de implementar um sistema de biblioteca utilizando estruturas de dados.

---

## 🚀 Tecnologias utilizadas

* ☕ Java
* Estruturas de Dados:

  * Lista (Vetor)
  * Fila
  * Pilha
  * Árvore Binária de Busca (BST)

---

## 📦 Estrutura do Projeto

```
src/
 └── br.edu.biblioteca
     ├── model
     ├── structures
     └── service
```

---

## 📚 Funcionalidades

* Cadastro de livros
* Cadastro de usuários
* Controle de empréstimos e devoluções
* Reservas de livros (fila)
* Controle de multas
* Relatórios simples
* Busca eficiente por ISBN (árvore)

---

## 🧱 Estruturas de Dados Implementadas

* Vetor<T> → armazenamento de dados
* MinhaFila<T> → controle de reservas
* MinhaPilha<T> → histórico (undo/redo)
* ArvoreBST<K, V> → busca eficiente

---

## 📂 Pacotes

### 🔹 model

Classes principais do sistema:

* Livro
* Autor
* Categoria
* Usuario
* Emprestimo
* Reserva
* Multa
* Notificacao
* Exemplar

### 🔹 structures

Implementação das estruturas de dados:

* Vetor
* MinhaFila
* MinhaPilha
* ArvoreBST

### 🔹 service

Regras de negócio:

* CatalogoService
* UsuarioService
* EmprestimoService
* ReservaService
* RelatorioService

---

## 🎯 Objetivo

Aplicar conceitos de estruturas de dados na construção de um sistema real, simulando o funcionamento de uma biblioteca.

---

## 👩‍💻 Autora

Larissa Soeiro

---

## 💻 Linguagem

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge\&logo=java\&logoColor=white)
