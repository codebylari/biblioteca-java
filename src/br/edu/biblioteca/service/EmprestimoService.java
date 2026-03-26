package br.edu.biblioteca.service;

import br.edu.biblioteca.model.Emprestimo;
import br.edu.biblioteca.structures.Vetor;

import java.time.LocalDate;

public class EmprestimoService {

    private Vetor<Emprestimo> emprestimos;

    public EmprestimoService() {
        emprestimos = new Vetor<>(100);
    }

    public void emprestarExemplar(Emprestimo emprestimo) {
        emprestimos.add(emprestimo);
        System.out.println("Empréstimo realizado!");
    }

    public void devolverExemplar(int idEmprestimo) {
        for (int i = 0; i < emprestimos.size(); i++) {
            Emprestimo e = emprestimos.get(i);

            if (e.getId() == idEmprestimo) {
                e.setDataDevolucao(LocalDate.now());
                e.setStatus("DEVOLVIDO");
                System.out.println("Devolvido com sucesso!");
            }
        }
    }

    public double calcularMulta(Emprestimo e) {
        if (e.getDataDevolucao() == null) return 0;

        long diasAtraso = e.getDataDevolucao().toEpochDay() - e.getDataPrevista().toEpochDay();

        if (diasAtraso > 0) {
            return diasAtraso * 2.0; // R$2 por dia
        }

        return 0;
    }
}