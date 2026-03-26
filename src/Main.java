import br.edu.biblioteca.model.*;
import br.edu.biblioteca.service.*;

import java.time.LocalDate;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        // Serviços
        CatalogoService catalogo = new CatalogoService();
        UsuarioService usuarioService = new UsuarioService();
        EmprestimoService emprestimoService = new EmprestimoService();

        // Criando dados
        Livro livro = new Livro(
                "123",
                "Java Básico",
                2023,
                List.of(),
                List.of(),
                List.of("programação")
            );

        Usuario usuario = new Usuario(
                1,
                "Larissa",
                "ALUNO",
                "larissa@email.com"
        );

        // Cadastrar
        catalogo.cadastrarLivro(livro);
        usuarioService.cadastrarUsuario(usuario);

        System.out.println("=== LIVROS ===");
        catalogo.listarLivros();

        System.out.println("\n=== USUÁRIOS ===");
        usuarioService.listarUsuarios();

        // Criar empréstimo
        Emprestimo emprestimo = new Emprestimo(
                1,
                usuario.getId(),
                1,
                LocalDate.now(),
                LocalDate.now().plusDays(7),
                null,
                "EMPRESTADO"
        );

        emprestimoService.emprestarExemplar(emprestimo);

        // Simular devolução atrasada
        emprestimo.setDataDevolucao(LocalDate.now().plusDays(10));

        double multa = emprestimoService.calcularMulta(emprestimo);

        System.out.println("\nMulta calculada: R$ " + multa);
    }
}