package br.edu.principal;

import java.util.ArrayList;

import java.util.List;
import java.util.Scanner;

import br.edu.dao.ContatoDAO;
import br.edu.modelo.Contato;

import br.edu.visao.AgendaView;
import br.edu.controle.AgendaController;

public class Principal {
	
	public static void main(String[] args) {

		List<Contato> contatos = new ArrayList<>();
		
		ContatoDAO dao = new ContatoDAO("contatos.txt");

		dao.carregarContatos(contatos);
		
		AgendaController controller = new AgendaController(contatos, dao);
		
		
        
        int opcao;
        
        Scanner sc = new Scanner(System.in);
        
        AgendaView view = new AgendaView(sc);
        
        view.mostraInicializacao(); 

        while (true) {
        	
        	view.mostrarMenu();

        	opcao = view.selecionarOpcao();

            switch (opcao) {
                case 1-> {
                	Contato contato = view.lerContato();
                    controller.adicionarContato(contato);
                    view.mostrarMensagem("Contato adicionado com sucesso!");
                }          	
                case 2-> {
                	List<Contato> lista = controller.listarContatos();
                    view.mostrarContatos(lista);
                }
                case 3-> {
                	String nome = view.lerNomePesquisa();
                    Contato contato = controller.pesquisarContato(nome);
                    view.mostrarResultadoPesquisa(contato);
                }
                case 4-> {
                	String nome = view.lerNomePesquisa();

                    Contato contato = controller.pesquisarContato(nome);

                    if (contato == null) {

                        view.mostrarMensagem("Contato não encontrado.");

                    } else {

                        view.mostrarResultadoPesquisa(contato);

                        Contato novosDados = view.lerDadosAtualizacao();

                        boolean atualizado = controller.atualizarContato(
                                nome,
                                novosDados.getNome(),
                                novosDados.getCelular(),
                                novosDados.getEmail()
                        );

                        if (atualizado) {
                            view.mostrarMensagem("Contato atualizado com sucesso!");
                        }
                    }
                }          	
                case 5-> {
                	String nome = view.lerNomePesquisa();

                    Contato contato = controller.pesquisarContato(nome);

                    if (contato == null) {

                        view.mostrarMensagem("Contato não encontrado.");

                    } else {

                        view.mostrarResultadoPesquisa(contato);

                        if (view.confirmarExclusao()) {

                            boolean excluido = controller.excluirContato(nome);

                            if (excluido) {
                                view.mostrarMensagem("Contato excluído com sucesso!");
                            }

                        } else {

                            view.mostrarMensagem("Exclusão cancelada.");
                        }
                    }
                }        	
                case 6-> {
                	boolean salvou = controller.salvarContatos();
                    if (salvou) {
                        view.sair();
                        sc.close();
                        return;
                    }
                    else {
                        System.out.println("Não foi possível salvar os contatos.");
                        System.out.println("A aplicação continuará em execução.");
                    }
                }
                case 7-> view.sobre();
                default -> System.out.println("Opção Inválida!");
            }
        }
    }	
}