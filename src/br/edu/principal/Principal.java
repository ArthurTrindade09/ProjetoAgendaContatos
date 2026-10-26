package br.edu.principal;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// V3.2.0 IMPLEMENTA CRUD ORIENTADO A OBJETOS

public class Principal {
	
	public static void main(String[] args) {

		List<Contato> contatos = new ArrayList<>(); // CRIAR UMA LISTA DE CONTATOS

        Persistencia.carregarContatos(contatos); // CARREGA A LISTA DE CONTATOS
        
        // CRIAR VARIAVEIS DE CONTROLE DO PROGRAMA
        int opcao;
        boolean continuar = true;
        
        Scanner sc = new Scanner(System.in); // OBJETO QUE RECEBE ENTRADAS DO USUÁRIO
        
        Uteis.mostraInicializacao();  // MOSTRA TELINHA PRINCIPAL 

        // LOOP PRINCIPAL DO PROGRAMA
        while (continuar) {
        
        	Uteis.mostraMenu(); // MOSTRA TELINHA DAS OPÇÕES
            opcao = Uteis.selecionaOpcao(sc);

            switch (opcao) {
                case 1-> Agenda.adicionar(sc, contatos);   // ADICIONAR         	
                case 2-> Agenda.listar(contatos);          // LISTAR
                case 3-> Agenda.pesquisar(sc, contatos);   // PESQUISAR
                case 4-> Agenda.atualizar(sc, contatos);   // ATUALIZAR
                case 5-> Agenda.excluir(sc, contatos);     // EXCLUIR
                case 6-> {
                	Persistencia.salvarContatos(contatos); // SALVA OS CONTATOS E SAI
                	continuar = Uteis.sair();
                }
                case 7-> Uteis.sobre(); // JANELA COM DADOS DO PROGRAMA
                default -> System.out.println("Opção inválida!"); // CASO DIGITE ALGO INVÁLIDO(números apenas)
            } // switch
        } // while
        sc.close();
    }	// main
} // principal