package br.edu.biblioteca.service;

import br.edu.biblioteca.model.Usuario;
import br.edu.biblioteca.structures.Vetor;

public class UsuarioService {

    private Vetor<Usuario> usuarios;

    public UsuarioService() {
        usuarios = new Vetor<>(100);
    }

    public void cadastrarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }

    public void listarUsuarios() {
        for (int i = 0; i < usuarios.size(); i++) {
            System.out.println(usuarios.get(i).getNome());
        }
    }
}