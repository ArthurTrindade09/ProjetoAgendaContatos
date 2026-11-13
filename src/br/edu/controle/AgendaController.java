package br.edu.controle;

import java.util.ArrayList;
import java.util.List;

import br.edu.dao.ContatoDAO;
import br.edu.modelo.Contato;

public class AgendaController {

    private List<Contato> contatos;
    private ContatoDAO dao;

    public AgendaController(List<Contato> contatos, ContatoDAO dao) {
        this.contatos = contatos;
        this.dao = dao;
    }
    
    public List<Contato> listarContatos() {
    	return contatos;
    }
    
    public boolean salvarContatos() {
        return dao.salvarContatos(contatos);
    }
    
    public void adicionarContato(Contato contato) {
        contatos.add(contato);
    }
    
    public Contato pesquisarContato(String nome) {

        for (Contato contato : contatos) {

            if (contato.getNome().equalsIgnoreCase(nome)) {
                return contato;
            }
        }

        return null;
    }
    
    public boolean atualizarContato(String nome, String novoNome, String novoCelular, String novoEmail) {

        Contato contato = pesquisarContato(nome);

        if (contato == null) {
            return false;
        }

        contato.setNome(novoNome);
        contato.setCelular(novoCelular);
        contato.setEmail(novoEmail);

        return true;
    }
    
    public boolean excluirContato(String nome) {

        Contato contato = pesquisarContato(nome);

        if (contato == null) {
            return false;
        }

        return contatos.remove(contato);
    }
}