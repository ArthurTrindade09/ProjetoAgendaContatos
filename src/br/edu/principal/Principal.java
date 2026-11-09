package br.edu.principal;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import br.edu.dao.ContatoDao;
import br.edu.modelo.Contato;
import br.edu.servico.Agenda;

import br.edu.uteis.Uteis;

public class Principal {
	
	public static void main(String[] args) {

		List<Contato> contatos = new ArrayList<>();
		
		ContatoDao dao = new ContatoDao("contatos.txt");

		dao.carregarContatos(contatos);
        
        int opcao;
        
        Scanner sc = new Scanner(System.in);
        
        Uteis.mostraInicializacao(); 

        while (true) {
        	
        	Uteis.mostraMenu();
            
        	opcao = Uteis.selecionaOpcao(sc);

            switch (opcao) {
                case 1-> Agenda.adicionar(sc, contatos);           	
                case 2-> Agenda.listar(contatos);
                case 3-> Agenda.pesquisar(sc, contatos);
                case 4-> Agenda.atualizar(sc, contatos);           	
                case 5-> Agenda.excluir(sc, contatos);          	
                case 6-> {
                	boolean salvou = dao.salvarContatos(contatos);
                    if (salvou) {
                        Uteis.sair();
                        sc.close();
                        return;
                    }
                    else {
                        System.out.println("Não foi possível salvar os contatos.");
                        System.out.println("A aplicação continuará em execução.");
                    }
                }
                case 7-> Uteis.sobre();
                default -> System.out.println("Opção Inválida!");
            }
        }
    }	
}