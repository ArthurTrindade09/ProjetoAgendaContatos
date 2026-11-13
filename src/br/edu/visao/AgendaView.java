package br.edu.visao;

import java.util.List;
import java.util.Scanner;

import javax.swing.JOptionPane;

import br.edu.modelo.Contato;

public class AgendaView {

    private Scanner sc;

    public AgendaView(Scanner sc) {
        this.sc = sc;
    }
    
	public void mostraInicializacao() {
    	System.out.println("==========================");
        System.out.println("     AGENDA DE CONTATOS   ");
        System.out.println("          v5.0.0          ");
        System.out.println("==========================");
        System.out.println("Bem-vindo!");
    }
    
    
    public void sair() {
    	System.out.println("Saindo da Agenda de Contatos...");
    }
    
    public void sobre() {
    	JOptionPane.showMessageDialog(null, 
    			"Desenvolvido por Arthur risada frouxa!");
    }

    public void mostrarMenu() {

        System.out.println();
        System.out.println("1 - Adicionar contato");
        System.out.println("2 - Listar contatos");
        System.out.println("3 - Procurar contato");
        System.out.println("4 - Alterar contato");
        System.out.println("5 - Excluir contato");
        System.out.println("6 - Sair");
        System.out.println("7 - Sobre");
    }

    public int selecionarOpcao() {

        System.out.print("Escolha uma opção: ");

        int opcao = sc.nextInt();
        sc.nextLine();

        return opcao;
    }
    
    public Contato lerContato() {

        System.out.println("=== ADICIONAR CONTATO ===");

        System.out.print("Digite o nome: ");
        String nome = sc.nextLine();

        System.out.print("Digite o celular: ");
        String celular = sc.nextLine();

        System.out.print("Digite o email: ");
        String email = sc.nextLine();

        return new Contato(nome, celular, email);
    }
    
    public String lerNomePesquisa() {

        System.out.println("\n=== PESQUISAR CONTATO ===");

        System.out.print("Digite o nome do contato: ");

        return sc.nextLine();
    }
    
    public Contato lerDadosAtualizacao() {

        System.out.println("\n=== NOVOS DADOS ===");

        System.out.print("Novo nome: ");
        String nome = sc.nextLine();

        System.out.print("Novo celular: ");
        String celular = sc.nextLine();

        System.out.print("Novo email: ");
        String email = sc.nextLine();

        return new Contato(nome, celular, email);
    }
    
    public void mostrarMensagem(String mensagem) {

        System.out.println(mensagem);
    }
    
    public void mostrarContatos(List<Contato> contatos) {

        System.out.println("\n=== LISTA DE CONTATOS ===");

        if (contatos.isEmpty()) {
            mostrarMensagem("Nenhum contato cadastrado.");
            return;
        }

        for (Contato contato : contatos) {
            System.out.println(contato);
        }
    }
    
    public void mostrarResultadoPesquisa(Contato contato) {

        if (contato == null) {

            mostrarMensagem("Contato não encontrado.");

        } else {

            System.out.println("\nContato encontrado:");
            System.out.println(contato);
        }
    }
    
    public boolean confirmarExclusao() {

        System.out.print("Deseja realmente excluir? (S/N): ");

        String resposta = sc.nextLine();

        return resposta.equalsIgnoreCase("S");
    }
}